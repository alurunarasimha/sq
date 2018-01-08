package com.smartquote.automation.uipages.internal;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_SmartQuote_Internal_Admin_HomePageObject extends BasePage {
	
	

	public SQ_SmartQuote_Internal_Admin_HomePageObject() {
		super("SQ_Internal_Admin_Home_Obj","SQ_Internal_Obj");

	}
	
	
	public WebElement getsearchSmartQuoteid() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchSmartQuoteId").getAsString());
		return searchTextFieldValue;
	}
	
	
	public void setSmartQuoteid(String seachString) {

		getsearchSmartQuoteid().clear();
		getsearchSmartQuoteid().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter Smart Quote id Internal SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}

	private WebElement getGoButton() {
		WebElement GoButton = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchGobutton").getAsString());
		return GoButton;
	}

	public void clickOnGo_Btn() {

		getGoButton().click();
	}

}
