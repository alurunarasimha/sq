package com.smartquote.automation.uipages.external;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Simulate_External_loginPageObject extends BasePage {

	public SQ_Simulate_External_loginPageObject() {
		super("SQ_Simulate_login_External_Obj","SQ_Extrnal_Obj");

	}

	public WebElement getsearchParterProId() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchParterProId").getAsString());
		return searchTextFieldValue;
	}
	
	public WebElement getsearchemail() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("search_email").getAsString());
		return searchTextFieldValue;
	}
	

	public WebElement getsearchcountrycode() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchcountrycode").getAsString());
		return searchTextFieldValue;
	}

	public WebElement getSubmitBtn() {
		WebElement Ext_SQ_Lgn_submitBtn = HtmlUtils.doIdentifyElement(locatorMap.get("Ext_SQ_Login_btn").getAsString());
		return Ext_SQ_Lgn_submitBtn;
	}

	public WebElement getInternalUser() {
		WebElement elechkBox = HtmlUtils.doIdentifyElement(locatorMap.get("SearchhpInternalUser").getAsString());
		return elechkBox;
	}

	public void setParterProId(String seachString) {

		getsearchParterProId().clear();
		getsearchParterProId().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter ParterProId in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}
	
	public void setsearchemail(String seachString) {

		getsearchemail().clear();
		getsearchemail().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter useremail id in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}

	
	public void setCountrycode(String seachString) {

		getsearchcountrycode().clear();
		getsearchcountrycode().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter Countrycode in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}

	public void clickOnExt_SQ_Login_Btn() {

		getSubmitBtn().click();
	}

	public void getInternaluser_flag() {

		if (getInternalUser().isSelected()) {

			AutomationReportLogger.log("-->Check box is already selected");
			AutomationReportLogger.log("                                ");

			getInternalUser().click();

		} else {

			AutomationReportLogger.log("-->Check box is NOT selected intinitally");
			AutomationReportLogger.log("                                        ");
		}

	}
	
	public WebElement getsearchusername() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("username").getAsString());
		return searchTextFieldValue;
	}
	public WebElement getsearchPassword() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("password").getAsString());
		return searchTextFieldValue;
	}
	public WebElement getsearchsignin() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("sing_in").getAsString());
		return searchTextFieldValue;
	}
	
	public WebElement getsearchworkspace() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("myworkspace").getAsString());
		return searchTextFieldValue;
	}
	public WebElement getsearchrequestquote() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("requestdeal").getAsString());
		return searchTextFieldValue;
	}
	public WebElement getsearchgobutton() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Gobutton").getAsString());
		return searchTextFieldValue;
	}
	public void setusername(String seachString) {

		getsearchusername().clear();
		getsearchusername().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter username in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}
	public void setPassword(String seachString) {

		getsearchPassword().clear();
		getsearchPassword().sendKeys(seachString);
		AutomationReportLogger.log("Successfully enter Password in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                        ");
	}

	public void clickOnsing_Login_Btn() {

		getsearchsignin().click();
	}
	
	public void clickOnworkspace_Btn() {

		getsearchworkspace().click();
	}
	public void clickOnrequestquote_Btn() {

		getsearchrequestquote().click();
	}
	public void clickOnGo_Btn() {

		getsearchgobutton().click();
	}

}
