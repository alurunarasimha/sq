package com.smartquote.automation.uipages.internal;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.WebDriverUtils;
import com.smartquote.automation.quotedata.QuoteTestdataSource;
import com.smartquote.automation.utilities.GetQuoteUtilities;

public class SQDealCreationNavigationInternal {

	SQ_Simulate_Internal_loginPageObject sqSimulateInternalloginPage = new SQ_Simulate_Internal_loginPageObject();
	SQ_SmartQuote_Internal_Admin_HomePageObject SqSmartQuoteInternalAdminHomePage = new SQ_SmartQuote_Internal_Admin_HomePageObject();
	SQ_Simulate_Internal_ProcessQuote_PageObject sqSimulateInternalProcessQuotePage = new SQ_Simulate_Internal_ProcessQuote_PageObject();
	GetQuoteUtilities GetQuoteUtilities = new GetQuoteUtilities();

	public void doInternalSimulatorLogin(QuoteTestdataSource dealCreationData) {

		sqSimulateInternalloginPage.sethpuserid(dealCreationData.getsHPPuserId());
		sqSimulateInternalloginPage.getInternaluser_flag();
		sqSimulateInternalloginPage.clickOnInternal_SQ_Login_Btn();

		AutomationReportLogger.log("Successfully click on Internal Simulate SQ Login Button>>--", true);
		AutomationReportLogger.log("                                                              ");
	}

	public void doandactionQuoteid() throws InterruptedException {

		WebDriverUtils.waitUntilNewWindowOpens();

		if (Browser.getInstance().getWindowHandles().size() == 1) {
			AutomationReportLogger.log("Failure to open the new window on Login Page", true);
			Assert.assertTrue(false, "Failure to open the new window on Login Page");
		}

		WebDriverUtils.switchToNewWindow();

		Thread.sleep(20000);

		AutomationReportLogger.log("Successfully Swich Welcome Smart Quote Admin Page", true);
		AutomationReportLogger.log("                                                          ");

		// AutomationReportLogger.log("Successfully Click NEW QUOTE REQUEST");
		// AutomationReportLogger.log(" ");
	}

	public void doandActionProcessQuote(QuoteTestdataSource dealCreationData) throws Exception {
		sqSimulateInternalProcessQuotePage.setwrkEmailID(dealCreationData.getsQuoteLeadid());
		sqSimulateInternalProcessQuotePage.clickOnwrkbEmailBtn();
		sqSimulateInternalProcessQuotePage.getwrkbcheck().click();
		sqSimulateInternalProcessQuotePage.doActionReqstQulif();
			
	}

	public void doandActionEISProcess(QuoteTestdataSource dealCreationData) throws Exception {
		Thread.sleep(1300);
		
		sqSimulateInternalProcessQuotePage.selectEISReqBM("Volume Channel");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.setEISReqDescr("RTTesting");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.selectEISmcCode("15 - Product Issues");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.selectEISReqLBG("Printing");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.selectEISRoutingInd("Commercial");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.selectEIScustinfSeg("AUTOMOTIVE");
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.selectEIScustinfindustry("Accounting");
		sqSimulateInternalProcessQuotePage.selectEISReqBU("Printing Hardware");
		Thread.sleep(1100);
		AutomationReportLogger.log("Successfully Swich On  Page", true);
		List<String> emails = new ArrayList<String>();
		  emails.add("S R, Nitinraj ");
		  emails.add("Priya, Mukunda ");
		  emails.add("S R, Nitinraj ");
		  emails.add("Priya, Mukunda ");
		  
		
		Thread.sleep(1000);
		sqSimulateInternalProcessQuotePage.doSelectEmails(emails);
		sqSimulateInternalProcessQuotePage.clickOnEISEmailSave();
		Thread.sleep(1100);
		sqSimulateInternalProcessQuotePage.clickOnEISReseller(dealCreationData.getsParterProId());
		sqSimulateInternalProcessQuotePage.selectEIScreatdeal("Create Deal");
		sqSimulateInternalProcessQuotePage.clickOnEISGo();
		String var = sqSimulateInternalProcessQuotePage.CollectEISSuccessbox();
		AutomationReportLogger.log("Successfully Swich On Page", true);
		GetQuoteUtilities.GetDeailsforQuote(var);		
		sqSimulateInternalProcessQuotePage.setEISSuccessClose();
		AutomationReportLogger.log("Successfully Swich On Page", true);

	}

}
