package com.org.uiautomation;





import org.openqa.selenium.WebDriver;



public class Browser {

	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	private static ThreadLocal<String> webDriverWindowId = new ThreadLocal<String>();
	

	

	
	//private static ThreadLocal<String> webDriverWinImplicityHandle = new ThreadLocal<String>();
 
	public static WebDriver getInstance() {
		return webDriver.get();
		
	}

	static void setWebDriver(WebDriver driver) {
		webDriver.set(driver);
	}

	static void setBaseWindowId() {
		webDriverWindowId.set(webDriver.get().getWindowHandle());
	}

	static String getBaseWindowId() {
		return webDriverWindowId.get();
	}
	
  /*static FluentWait settimewidow(){
	  
	  return wait.withTimeout(15, TimeUnit.SECONDS);
  }*/

}
