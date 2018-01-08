package com.smartquote.automation.uipages.external;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_SmartQuote_External_HomePageObject extends BasePage {

	public SQ_SmartQuote_External_HomePageObject() {
		super("SQ_SmartQuote_Home_External_Obj","SQ_Extrnal_Obj");

	}

	private WebElement getSubmitBtn() {
		WebElement NEWQUOTEREQUEST_Btn = HtmlUtils
				.doIdentifyElement(locatorMap.get("NEWQUOTEREQUEST_Btn").getAsString());
		return NEWQUOTEREQUEST_Btn;
	}

	public void clickOnNEWQUOTEREQUEST_Btn() {

		getSubmitBtn().click();
	}

}
