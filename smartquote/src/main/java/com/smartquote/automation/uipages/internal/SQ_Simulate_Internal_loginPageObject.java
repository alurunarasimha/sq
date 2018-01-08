package com.smartquote.automation.uipages.internal;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Simulate_Internal_loginPageObject extends BasePage {

	public SQ_Simulate_Internal_loginPageObject() {
		super("SQ_Simulate_login_Internal_Obj","SQ_Internal_Obj");

	}

	public WebElement getsearchhpuserid() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchhpuserid").getAsString());
		return searchTextFieldValue;
	}
	
	
	public void sethpuserid(String seachString) {

		getsearchhpuserid().clear();
		getsearchhpuserid().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter HPPUserId in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}

	
	public WebElement getSubmitBtn() {
		WebElement Internal_SQ_Lgn_submitBtn = HtmlUtils.doIdentifyElement(locatorMap.get("Internal_SQ_Login_btn").getAsString());
		return Internal_SQ_Lgn_submitBtn;
	}
	
	public void clickOnInternal_SQ_Login_Btn() {

		getSubmitBtn().click();
	}


	public WebElement getInternalUser() {
		WebElement elechkBox = HtmlUtils.doIdentifyElement(locatorMap.get("SearchhpInternalUser").getAsString());
		return elechkBox;
	}


	public void getInternaluser_flag() {

		if (getInternalUser().isSelected()) {

			AutomationReportLogger.log("-->Check box is already selected");
			AutomationReportLogger.log("                                ");

		} else {

			getInternalUser().click();
			AutomationReportLogger.log("-->Check box is NOT selected intinitally");
			AutomationReportLogger.log("                                        ");
		}

	}

}
