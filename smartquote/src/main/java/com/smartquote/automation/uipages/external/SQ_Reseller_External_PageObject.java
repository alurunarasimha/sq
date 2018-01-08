package com.smartquote.automation.uipages.external;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Reseller_External_PageObject extends BasePage {

	public SQ_Reseller_External_PageObject() {
		super("SQ_Reseller_External_Obj","SQ_Extrnal_Obj");

	}

	private WebElement getsearchReseller_btn() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Reseller_NEXTTOCUSTOMER").getAsString());
		return searchTextFieldValue;
	}

	

	public void clickOnResellercustomer_Btn() {

		getsearchReseller_btn().click();
	}

	
	
	private WebElement getsearchcustPhonenum() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Reseller_phonenumber").getAsString());
		return searchTextFieldValue;
	}


public void setcustPhonenum(String seachString) {
		

		String edttxt = getsearchcustPhonenum().getAttribute("value");
		
		if(edttxt.isEmpty())
		{
			getsearchcustPhonenum().sendKeys(seachString);
			
			//System.out.println(getsearchcustPhonenum().getAttribute("value"));
		}

	}
}
