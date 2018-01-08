package com.org.uiautomation.html;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.uiautomation.Browser;

public class HtmlUtils {

	public static WebElement doIdentifyElement(String locator) {

		By by = getBy(locator);

		return Browser.getInstance().findElement(by);

	}

	public static List<WebElement> doIdentifyElements(String locator) {

		return Browser.getInstance().findElements(getBy(locator));

	}

	public static WebElement doIdentifySelectElements(String locator) {

		return Browser.getInstance().findElement(By.id(locator));

	}

/*	public static WebElement dogettext(String locator ){
		
		return Browser.getInstance().findElement(By.id(locator));
			
	}*/
	
	public static By getBy(String locator) {

		String[] locatorTypeAndValue = locator.split(":=:");

		if (!(locatorTypeAndValue.length == 2)) {
			throw new RuntimeException("Please pass the locator values like -- id/css/xpath/name--" + locator);
		}

		if (locator.contains("xpath:=:")) {
			return By.xpath(locatorTypeAndValue[1]);
		} else if (locator.contains("css:=:")) {
			return By.cssSelector(locatorTypeAndValue[1]);
		} else if (locator.contains("name:=:")) {
			return By.name(locatorTypeAndValue[1]);
		} else if (locator.contains("id:=:")) {
			return By.id(locatorTypeAndValue[1]);
		} else {
			throw new RuntimeException("Please pass the locator values like -- id/css/xpath/name--" + locator);
		}

	}





	




}
