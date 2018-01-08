package com.org.uiautomation;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebDriverUtils {

	public static void switchToNewWindow() {

		String baseWindowId = Browser.getBaseWindowId();

		Set<String> windowIds = Browser.getInstance().getWindowHandles();

		if (windowIds.size() == 1) {
			Reporter.log("No New Windows openened to switch");
		} else {

			for (String eachWindow : windowIds) {

				if (!eachWindow.equalsIgnoreCase(baseWindowId)) {
					Browser.getInstance().switchTo().window(eachWindow);
					break;
				}
			}
		}
	}

	public static void waitUntilNewWindowOpens() {

		Set<String> windowIds = new HashSet<String>();
		long timer = 300L;

		do {

			windowIds = Browser.getInstance().getWindowHandles();

			if (windowIds.size() > 1) {
				timer = timer + 30000L;
			} else {
				timer = timer + 300L;
			}

		} while (timer < 30000);
	}

	public static void switchToBaseWindow() {

		String baseWindowId = Browser.getBaseWindowId();

		Browser.getInstance().switchTo().window(baseWindowId);
	}

	public static void switchToNewWindow(String newWindowTitle) {

		String baseWindowId = Browser.getBaseWindowId();

		Set<String> windowIds = Browser.getInstance().getWindowHandles();

		if (windowIds.size() == 1) {
			Reporter.log("No New Windows openened to switch");
		} else {

			for (String eachWindow : windowIds) {

				Browser.getInstance().switchTo().window(eachWindow);

				if (Browser.getInstance().getTitle().equalsIgnoreCase(newWindowTitle)) {
					break;
				}

				Browser.getInstance().switchTo().window(baseWindowId);
			}
		}
	}

	public static boolean isElementVisibleOnThePage(WebElement element) {

		WebDriverWait explWait = new WebDriverWait(Browser.getInstance(), 120);
		return explWait.until(ExpectedConditions.visibilityOf(element)) != null;
	}

}