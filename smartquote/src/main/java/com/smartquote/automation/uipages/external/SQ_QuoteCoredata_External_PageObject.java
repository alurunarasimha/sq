package com.smartquote.automation.uipages.external;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_QuoteCoredata_External_PageObject extends BasePage {

	public SQ_QuoteCoredata_External_PageObject() {
		super("SQ_Quotecoredata_External_Obj","SQ_Extrnal_Obj");

	}

	private WebElement getsearchquoterequestcmt() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("Comment_list").getAsString());
		return searchTextFieldValue;
	}

	private Select getselectQuotecore_justificationIdlst() {

		Select oSelect = new Select(Browser.getInstance()
				.findElement(By.xpath("//*[@id='quoteRequestFormId']/div[3]/div[2]/div[3]/p[2]/select")));

		return oSelect;

	}

	public void selectQuoteCoredata_list(int seachString) throws Exception {
		
		AutomationReportLogger.log("Successfully view  Quote Core Page", true);
		AutomationReportLogger.log("                                 ");

		getselectQuotecore_justificationIdlst().selectByIndex(seachString);
		
		//getselectQuotecore_justificationIdlst().selectByVisibleText(seachString);
		Thread.sleep(12000);

		AutomationReportLogger.log("Successfully enter QuoteCore_list value  in Quote Core Page", true);
		AutomationReportLogger.log("   	                                                   ");
	}

	public void setquoterequestcmt(String seachString) {

		getsearchquoterequestcmt().sendKeys(seachString);

	}

	private WebElement getsearchquotDealReqID() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("DealRegID").getAsString());
		return searchTextFieldValue;
	}

	public void setquotequotDealReqID(String seachString) {

		getsearchquotDealReqID().sendKeys(seachString);

	}

	
	private WebElement getsearchquotReview_submit() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("btnGrey").getAsString());
		return searchTextFieldValue;
	}
	
public void clickOnquotReview_submit() {
	 
	getsearchquotReview_submit().click(); 
}
	 

private WebElement getsearchquotSave_btn() {
	WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("Savebutton").getAsString());
	return searchTextFieldValue;
}

public void clickOnquotSave_btn() {
 
	getsearchquotSave_btn().click(); 
}

public WebElement getsearchCheck() {
	WebElement elechkBox = HtmlUtils.doIdentifyElement(locatorMap.get("acceptedHpTermsAndConditions").getAsString());
	return elechkBox;
}

public void getInternaluser_flagCheckbox() {

	if (getsearchCheck().isSelected()) {
		
		AutomationReportLogger.log("-->Check box is already selected");
		AutomationReportLogger.log("                                ");


	} else {
		
		getsearchCheck().click();

		AutomationReportLogger.log("-->Succssfully selected I accept HP's End-User Special Negotiated Discounts Terms on HP's Partner Portal",true);
		AutomationReportLogger.log("                                        ");
		
			}

}
 
private WebElement getsearchQuote_submission() {
	WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("submission").getAsString());
	return searchTextFieldValue;
}

public void clickOnQuote_submission() {
	
	getsearchQuote_submission().click(); 
}


/*private WebElement getsearchtext(){
	
	WebElement textfiledvalue = HtmlUtils.dogettext(locatorMap.get("SmartQuoteid").getAsString());
	return textfiledvalue;
	
}
*/

public String getsearchtext(){
	 
	 WebElement textfiledvalue = HtmlUtils.doIdentifyElement(locatorMap.get("SmartQuoteid").getAsString());
	 return textfiledvalue.getText().trim();
	 
	}

public String getsearchstatus(){
	 
	 WebElement textfiledstatus = HtmlUtils.doIdentifyElement(locatorMap.get("SmartQuote_Status").getAsString());
	 return textfiledstatus.getText().trim();
	 
	}

public WebElement getsearcherrmsg1(){
	 
	 WebElement textfiledstatus = HtmlUtils.doIdentifyElement(locatorMap.get("error_msg1").getAsString());
	 
	 return textfiledstatus;
	 
	}


public String doActionerrmsg1() throws Exception {

	String text = null;
if (getsearcherrmsg1().isDisplayed()) {
	
 text = getsearcherrmsg1().getText().trim();
}

return text;
}

public String doActionerrmsg2() throws Exception {
	String text = null;
if (getsearcherrmsg2().isDisplayed()) {
	
 text = getsearcherrmsg2().getText().trim();
}

return text;

}
public WebElement getsearcherrmsg2(){
	 
	 WebElement textfiledstatus = HtmlUtils.doIdentifyElement(locatorMap.get("error_msg2").getAsString());
	 return textfiledstatus;
	 
	}

}
