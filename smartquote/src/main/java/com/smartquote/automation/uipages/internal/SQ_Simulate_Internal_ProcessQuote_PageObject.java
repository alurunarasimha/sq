package com.smartquote.automation.uipages.internal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;


public class SQ_Simulate_Internal_ProcessQuote_PageObject extends BasePage {

	public SQ_Simulate_Internal_ProcessQuote_PageObject() {
		super("SQ_Internal_ProcessQuote_Obj", "SQ_Internal_Obj");

	}

	public WebElement getMachcustomer_link() {
		WebElement Machcustomer_link = HtmlUtils.doIdentifyElement(locatorMap.get("btn_Machcustomer").getAsString());
		return Machcustomer_link;
	}

	public void clickOnMachcustomer_link() {

		getMachcustomer_link().click();
	}

	public WebElement getActionReqstQulif() {
		WebElement chkboxActionReqstQulif = HtmlUtils
				.doIdentifyElement(locatorMap.get("searchActionReqstQulif").getAsString());
		return chkboxActionReqstQulif;
	}

	public WebElement getcust_Retrieve() {
		WebElement cust_Retrieve_btn = HtmlUtils.doIdentifyElement(locatorMap.get("btncust_Retrieve").getAsString());
		return cust_Retrieve_btn;
	}

	public void clickOncust_Retrieve_btn() {

		getcust_Retrieve().click();
	}

	public WebElement getMatchMDCPcust() {
		WebElement MatchMDCPcust_radio = HtmlUtils
				.doIdentifyElement(locatorMap.get("radio_MatchMDCPcust").getAsString());
		return MatchMDCPcust_radio;
	}

	public void clickOnMatchMDCPcust_radio() {

		getMatchMDCPcust().click();
	}

	public WebElement getMatchslectedcustomer() {
		WebElement Matchslectedcustomer = HtmlUtils
				.doIdentifyElement(locatorMap.get("btn_slectedcustomer").getAsString());
		return Matchslectedcustomer;
	}

	public void clickOnMatchslectedcustomer() {

		getMatchslectedcustomer().click();
	}
public WebElement getsearchwrkEmailID() {
        WebElement searchEmailID= HtmlUtils.doIdentifyElement(locatorMap.get("userassing_emailid").getAsString());
        return searchEmailID;
 }

 public void setwrkEmailID(String seachString) {
 
        getsearchwrkEmailID().sendKeys(seachString);
 }
 
 public WebElement getwrkbEmail_Btn() {
        WebElement Save_Actions_Btn = HtmlUtils.doIdentifyElement(locatorMap.get("userassing_search").getAsString());
        return Save_Actions_Btn;
 }

 public void clickOnwrkbEmailBtn() {

        getwrkbEmail_Btn().click();
 }
 
 public WebElement getwrkbcheck() {
        WebElement wrkbcheck = HtmlUtils
                     .doIdentifyElement(locatorMap.get("useremailcheckbox").getAsString());
        return wrkbcheck;
 }



	public void doActionReqstQulif() throws Exception {

		if (getActionReqstQulif().isEnabled()) {
			
			if (getActionReqstQulif().isSelected()) {

				AutomationReportLogger.log("-->Check box is NOT selected intinitally",true);
				AutomationReportLogger.log("                                        ");
					
			} else {

				AutomationReportLogger.log("-->Check box is enabled and selected");
				AutomationReportLogger.log("                                ");
				getActionReqstQulif().click();
				clickOnSave_Actions_Btn();
				Thread.sleep(1000);
				clickOnhightouch_radio();
				selecthightouch_lstbox();
				clickOnsavetouchs_Btn();
				AutomationReportLogger.log("Successfully Swich On Page", true);
				
				clickOnEIS_link();
			}


		} else {

			AutomationReportLogger.log("-->Check box is not enabled and need customer setup intinitally");
			AutomationReportLogger.log("                                        ");
			// customer Action
			// customer -> click match customer
			clickOnMachcustomer_link();
			Thread.sleep(10000);
			clickOncust_Retrieve_btn();
			Thread.sleep(10000);
			clickOnMatchMDCPcust_radio();
			Thread.sleep(5000);
			clickOnMatchslectedcustomer();
			Thread.sleep(1000);
			getActionReqstQulif().click();
			Thread.sleep(2000);
			clickOnSave_Actions_Btn();
			Thread.sleep(1000);

		}

	}

	public WebElement getSave_Actions_Btn() {
		WebElement Save_Actions_Btn = HtmlUtils.doIdentifyElement(locatorMap.get("btnSave_Actions").getAsString());
		return Save_Actions_Btn;
	}

	public void clickOnSave_Actions_Btn() {

		getSave_Actions_Btn().click();
	}

	public WebElement gethightouch_radio() {
		WebElement hightouch_radio = HtmlUtils.doIdentifyElement(locatorMap.get("radioHightouch").getAsString());
		return hightouch_radio;
	}

	public void clickOnhightouch_radio() {

		gethightouch_radio().click();
	}

	private Select getlstbox_Hightouch() {

		Select oSelect = new Select(Browser.getInstance().findElement(By.xpath("//select[@id='escalationId']")));

		return oSelect;
	}

	public void selecthightouch_lstbox() throws Exception {

	    getlstbox_Hightouch().selectByIndex(1);

		Thread.sleep(12000);

	}

	public WebElement getsavetouch_Btn() {
		WebElement savetouch_Btn = HtmlUtils.doIdentifyElement(locatorMap.get("btn_savetouch").getAsString());
		return savetouch_Btn;
	}

	public void clickOnsavetouchs_Btn() {

		getsavetouch_Btn().click();
	}

	public WebElement getEIS_link() {
		WebElement EIS_link = HtmlUtils.doIdentifyElement(locatorMap.get("link_EIS").getAsString());
		return EIS_link;
	}

	public void clickOnEIS_link() {

		getEIS_link().click();
	}

	/*-----------------------------------------------------EIS - Page Object element--------------------------------------------------------- */

	public WebElement getsearcEISReqDescr() {
		WebElement searchEISReqDescr = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Req_Description").getAsString());
		return searchEISReqDescr;
	}

	public void setEISReqDescr(String seachString) {
	
		getsearcEISReqDescr().sendKeys(seachString);
	}

	private WebElement getEISReqBM() {

		WebElement EISReqBM_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Req_BM").getAsString());
		return EISReqBM_link;
	}

	public void selectEISReqBM(String value) throws Exception {

		getEISReqBM().click();

		String EIS_Req_BM_valuexpath = locatorMap.get("EIS_Req_BM_Value").getAsString().replace("BusinessModelValue",
				value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EIS_Req_BM_valuexpath).click();

	}
	
	private WebElement getEISmcCode() {

		WebElement EISmcCode_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Req_MC").getAsString());
		return EISmcCode_link;
	}

	public void selectEISmcCode(String value) throws Exception {

		getEISmcCode().click();

		String EISmcCode_valuexpath = locatorMap.get("EIS_Req_MC_Value").getAsString().replace("mcCodeValue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EISmcCode_valuexpath).click();
	}
	
	private WebElement getEISReqLBG() {

		WebElement EISReqLBG_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Req_LBG").getAsString());
		return EISReqLBG_link;
	}

	public void selectEISReqLBG(String value) throws Exception {

		getEISReqLBG().click();

		String EISReqLBG_valuexpath = locatorMap.get("EIS_Req_LBG_Value").getAsString().replace("leadBizValue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EISReqLBG_valuexpath).click();
	}
	
	private WebElement getEISReqBU() {

		WebElement EISReqBU_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Req_BU").getAsString());
		return EISReqBU_link;
	}

	public void selectEISReqBU(String value) throws Exception {

		getEISReqBU().click();

		String EISReqBU_valuexpath = locatorMap.get("EIS_Req_BU_Value").getAsString().replace("bizUnitValue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EISReqBU_valuexpath).click();
	}
	
	private WebElement getEISRoutingInd() {

		WebElement EISRoutingInd_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_RoutingInd").getAsString());
		return EISRoutingInd_link;
	}

	public void selectEISRoutingInd(String value) throws Exception {

		getEISRoutingInd().click();

		String EISRoutingInd_valuexpath = locatorMap.get("EIS_RoutingIndValue").getAsString().replace("routingIndvalue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EISRoutingInd_valuexpath).click();
	}
	
	private WebElement getEIScustinfSeg() {

		WebElement EIScustinfSeg_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_custinfSeg").getAsString());
		return EIScustinfSeg_link;
	}

	public void selectEIScustinfSeg(String value) throws Exception {

		getEIScustinfSeg().click();

		String EIScustinfSeg_valuexpath = locatorMap.get("EIS_custinfSegValue").getAsString().replace("custSegvalue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EIScustinfSeg_valuexpath).click();
	}
	
	
	private WebElement getEIScustinfindustry() {

		WebElement EIScustinfindustry_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_custinfindustry").getAsString());
		return EIScustinfindustry_link;
	}

	public void selectEIScustinfindustry(String value) throws Exception {

		getEIScustinfindustry().click();

		String EIScustinfindustry_valuexpath = locatorMap.get("EIS_custinfindustryvalue").getAsString().replace("industryvalue",value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EIScustinfindustry_valuexpath).click();
	}


	/*----------------------------------------------EIS_Customer Partner Details*---------------------------------------------------*/
	
public void doSelectEmails(List<String> emailNames){
		
	
  List<WebElement> emailFields = HtmlUtils.doIdentifyElements(locatorMap.get("EIS_Primaryuser_Emailsid").getAsString());
		  
		  int index = 0; 
		  
		  for(WebElement eachElement : emailFields){
			 System.out.println(eachElement.getText()); 
		  //eachElement.clear();
		  eachElement.click();
		  WebElement email_textid = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_emilid_Inputbox").getAsString());
		  
		  email_textid.clear();
		  
		  email_textid.sendKeys(emailNames.get(index++));
		  
		  WebDriverWait explWait = new WebDriverWait(Browser.getInstance(), 120);
		  explWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'email-search-item')]/h3/span")));  
		  WebElement emailValue  = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Primaryuser_Emailsname").getAsString());
		  emailValue.click();
		     
		  }
	}

public WebElement getsearchEISReseller() {
	WebElement searchEISReseller = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Reseller").getAsString());
	return searchEISReseller;
}

private WebElement getEISChangePrtner() {

	WebElement EISChangePrtner_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_ChangePrtner").getAsString());
	return EISChangePrtner_link;
}

 public void clickOnEISReseller(String data) throws Exception {

	
    if(getEISChangePrtner().isEnabled()){
        //Do something if the text field is empty
    	getEISChangePrtner().click();
    	Thread.sleep(1100);
    	setEISParterProId(data);
    	clickOnEISPrtnersearch();
    	Thread.sleep(12000);
    	clickOnEIS_Prtnercheck();
    	Thread.sleep(1100);
    	getEISAddReseller().click();
    	Thread.sleep(1100);
    	getEISbacktoeis().click();
    	
    }
    else{
        //Store the value
        String EISContract =getsearchEISReseller().getText();

    }
}
 
	public WebElement getsearchEISParterProId() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("EIS_Prtnerproid").getAsString());
		return searchTextFieldValue;
	}
	
	public void setEISParterProId(String seachString) throws Exception {

		getsearchEISParterProId().clear();
		Thread.sleep(1000);
		//getsearchEISParterProId().sendKeys(seachString);
		
	}
 
	private WebElement getEISPrtnersearch() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Prtnersearch").getAsString());
		return searchTextFieldValue;

	}
	private WebElement getEISbacktoeis() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_backtoeis").getAsString());
		return searchTextFieldValue;

	}
	
	
	public void clickOnEISPrtnersearch() {

		getEISPrtnersearch().click();

		
	}
	
	private WebElement getEISAddReseller() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_AddReseller").getAsString());
		return searchTextFieldValue;

	}
	
	
 public WebElement getsearchEISEmailSave() {
		WebElement searchEISEmailSave = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Email_Save").getAsString());
		return searchEISEmailSave;
	}
 
	public void clickOnEISEmailSave() {

		getsearchEISEmailSave().click();
	}
	
	public WebElement getEISPrtnercheck() {
		WebElement EISPrtnercheck = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Prtnercheck").getAsString());
		return EISPrtnercheck;
	}

	public void clickOnEIS_Prtnercheck() {
		getEISPrtnercheck().click();
	}


	public WebElement getEISGo() {
		
		WebElement EISGo = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Go").getAsString());
		return EISGo;
					
	}

	public void clickOnEISGo() throws Exception {
	Thread.sleep(1100);
		getEISGo().click();
	}
	
	private WebElement getEIScreatdeal() {

		WebElement EIScreatdeal_link = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_creatdeal").getAsString());
		return EIScreatdeal_link;
	}

	public void selectEIScreatdeal(String value) throws Exception {

		getEIScreatdeal().click();

		String EIScreatdeal_valuexpath = locatorMap.get("EIS_creatdealvalue").getAsString().replace("CreateValue",
				value);

		// Thread.sleep(1000);
		HtmlUtils.doIdentifyElement(EIScreatdeal_valuexpath).click();

	}
	
	private WebElement getEISSuccessbox() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Success_box").getAsString());
		return searchTextFieldValue;

	}
	
	public String CollectEISSuccessbox() throws Exception {
		Thread.sleep(1100);
		return getEISSuccessbox().getText();
	}
	private WebElement getEISSuccessClose() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("EIS_Success_Close").getAsString());
		return searchTextFieldValue;

	}
	
	public void setEISSuccessClose() throws Exception {
		Thread.sleep(1100);
		getEISSuccessClose().click();
	}
	
}
