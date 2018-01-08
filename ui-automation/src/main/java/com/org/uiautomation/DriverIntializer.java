package com.org.uiautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

class DriverIntializer {

	static WebDriver getWebDriverInstance(){
		
		WebDriver driver = null;
		
		String browser = ConfigReader.getConfigData().getBrowser();
		
		
		if(browser.equalsIgnoreCase("CH")){
    		System.setProperty("webdriver.chrome.driver", "C:\\CP12302\\framework\\chromedriver.exe"); //TODO : need to get this from config properties
    		driver = new ChromeDriver();
    	}else if (browser.equalsIgnoreCase("IE")) {
		   System.setProperty("webdriver.ie.driver","C:\\Users\\aluru\\Desktop\\F&O\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		}else{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aluru\\Desktop\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}
    	
    	/*if(browser.equalsIgnoreCase("CH")){
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aluru\\Desktop\\F&O\\chromedriver.exe"); //TODO : need to get this from config properties
    		driver = new ChromeDriver();
    	}
    	else{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aluru\\Desktop\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}*/
    	
    	EventFiringWebDriver eDriver = new 	EventFiringWebDriver(driver);
    	
    	WebEventListener eventListener = new WebEventListener();
    	eDriver.register(eventListener);
    	
    	eDriver.manage().window().maximize();
    	eDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	
    	return eDriver;
	}
}
