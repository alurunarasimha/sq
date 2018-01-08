package com.smartquote.automation.uipages.external;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.WebDriverUtils;

public class SQDealCreationNavigationVerifications {

	public void doVerifySimulationLoginPage(WebElement element) {

		boolean checkOfLoginPage = WebDriverUtils.isElementVisibleOnThePage(element);

		if (checkOfLoginPage) {

			AutomationReportLogger.log("Successfully Invoked Simulate SQ Login Page >>", true);
			AutomationReportLogger.log("                                             ");
		} else {

			AutomationReportLogger.log("Successfully not Invoked Simulate SQ Login Page >>", true);
			AutomationReportLogger.log("                                                 ");

			Assert.assertTrue(checkOfLoginPage, "Successfully not Invoked Simulate SQ Login Page");
		}
	}

}
