package com.smartquote.automation.uipages.external;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Customer_External_PageObject extends BasePage {

	public SQ_Customer_External_PageObject() {
		super("SQ_Customer_External_Obj","SQ_Extrnal_Obj");

	}

	private WebElement getNPF_btn() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("NEWCUSTOMER(*NPF is mandatory)").getAsString());
		return searchTextFieldValue;
	}
	
	private WebElement getsearchcustFullName() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custFullLegalname").getAsString());
		return searchTextFieldValue;
	}

	private WebElement getsearchcustFirstName() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custFirstName").getAsString());
		return searchTextFieldValue;
	}

	private WebElement getsearchcustLastName() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custLastName").getAsString());
		return searchTextFieldValue;
	}

	private WebElement getsearchcustPhonenum() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custPhonenum").getAsString());
		return searchTextFieldValue;
	}
	
	private WebElement getsearchcustEmail() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custEmail").getAsString());
		return searchTextFieldValue;
	}
	
	private WebElement getsearchcustStreetdetails() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custStreetdetails").getAsString());
		return searchTextFieldValue;
	}
	
	
	private WebElement getsearchcustCity() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("custCity").getAsString());
		return searchTextFieldValue;
	}
	
	
	private WebElement getsearchBtn_NexttoProducts() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Btn_NexttoProducts").getAsString());
		return searchTextFieldValue;
	}


	public void clickOncustomer_NPFBtn() {

		getNPF_btn().click();
	}
	
	
public void doclickExcustomer(){
			
WebElement emailFields = HtmlUtils.doIdentifyElement(locatorMap.get("Ex_Customers").getAsString());

				/*	  
					for(WebElement eachElement : emailFields){
						 System.out.println(eachElement.getText());*/ 
emailFields.click();
					  //WebElement email_textid = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_emilid_Inputbox").getAsString());
					     
		
}
	
	private WebElement getExNPF_btn() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Ex_Customers").getAsString());
		return searchTextFieldValue;
	}

	public void setcustFullName(String seachString) {
		
    String edttxt = getsearchcustFullName().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustFullName().sendKeys(seachString);
		}
	
		AutomationReportLogger.log("Successfully enter Full Leagal name in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}
	
	

	public void setcustFirstName(String seachString) {
		
		
		String edttxt = getsearchcustFirstName().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustFirstName().sendKeys(seachString);
		}

		
		
		AutomationReportLogger.log("Successfully enter Frist name in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}
	
	public void setcustLastName(String seachString) {
		
		
		String edttxt = getsearchcustLastName().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustLastName().sendKeys(seachString);
		}
	
		AutomationReportLogger.log("Successfully enter Last name in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	public void setcustPhonenum(String seachString) {
		

		String edttxt = getsearchcustPhonenum().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustPhonenum().sendKeys(seachString);
		}

		
		
		AutomationReportLogger.log("Successfully enter Phone Number in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	public void setcustEmail(String seachString) {
		
		String edttxt = getsearchcustEmail().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustEmail().sendKeys(seachString);
		}
		
		AutomationReportLogger.log("Successfully enter Email id  in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	public void setcustStreetdetails(String seachString) {
		
		String edttxt = getsearchcustStreetdetails().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustStreetdetails().sendKeys(seachString);
		}
	
		AutomationReportLogger.log("Successfully enter Street Address in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
		
		AutomationReportLogger.log("Successfully Entered Customer Deatials on Customer Page", true);
		AutomationReportLogger.log("   	                                                   ");
	}

	public void setcustCity(String seachString) {
		
	String edttxt = getsearchcustCity().getText();
		
		if(edttxt.isEmpty())
		{
			getsearchcustCity().sendKeys(seachString);
		}
	
		AutomationReportLogger.log("Successfully enter City in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	public void clickOnBtn_NexttoProducts() {

		getsearchBtn_NexttoProducts().click();
		AutomationReportLogger.log("Successfully Click on Next to Products button in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	
}
