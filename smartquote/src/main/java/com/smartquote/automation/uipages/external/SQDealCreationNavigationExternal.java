package com.smartquote.automation.uipages.external;


import org.testng.Assert;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.WebDriverUtils;
import com.smartquote.automation.quotedata.QuoteTestdataSource;


public class SQDealCreationNavigationExternal {

	private SQ_Reseller_External_PageObject sqResellerPageObject = new SQ_Reseller_External_PageObject();
	private SQ_Simulate_External_loginPageObject sqSimulateLoginPageObject = new SQ_Simulate_External_loginPageObject();
	private SQ_SmartQuote_External_HomePageObject sqSmartQuoteHomePageObject = new SQ_SmartQuote_External_HomePageObject();
	private SQDealCreationNavigationVerifications sqDealCreationNavigationVerifications = new SQDealCreationNavigationVerifications();
	private SQ_Customer_External_PageObject sqCustomerPageObject = new SQ_Customer_External_PageObject();
	private SQ_Product_External_PageObject sqProductPageObject = new SQ_Product_External_PageObject();
	private SQ_Distributor_External_PageObject sqDistributorPageObject = new SQ_Distributor_External_PageObject();
	private SQ_QuoteCoredata_External_PageObject sqQuoteCorePageObject = new SQ_QuoteCoredata_External_PageObject();

	public void doSimulatorLogin(QuoteTestdataSource dealCreationData) throws Exception {
	
		
 sqDealCreationNavigationVerifications.doVerifySimulationLoginPage(sqSimulateLoginPageObject.getsearchParterProId());
		sqSimulateLoginPageObject.setsearchemail("narasimha.aluru@hp.com");

		sqSimulateLoginPageObject.setParterProId(dealCreationData.getsParterProId());

		sqSimulateLoginPageObject.setCountrycode(dealCreationData.getsCountryCode());

		sqSimulateLoginPageObject.getInternaluser_flag();

		AutomationReportLogger.log("Successfully Unchecked checkbox in Simulate SQ Login Page");
		AutomationReportLogger.log("                                                         ");
		   
	    
		sqSimulateLoginPageObject.clickOnExt_SQ_Login_Btn();

		AutomationReportLogger.log("Successfully click on Simulate SQ Login Button>>--", true);
		AutomationReportLogger.log("                                                              ");
	}


	public void doClickOnNewRequest() throws InterruptedException {

	WebDriverUtils.waitUntilNewWindowOpens();

		if (Browser.getInstance().getWindowHandles().size() == 1) {
			AutomationReportLogger.log("Failure to open the new window on Login Page", true);
			Assert.assertTrue(false, "Failure to open the new window on Login Page");
		}
	
		WebDriverUtils.switchToNewWindow();

		Thread.sleep(20000);

		AutomationReportLogger.log("Successfully Swich Smart Quotes Page", true);
		AutomationReportLogger.log("                                                          ");
		

		sqSmartQuoteHomePageObject.clickOnNEWQUOTEREQUEST_Btn();

		AutomationReportLogger.log("Successfully Click NEW QUOTE REQUEST");
		
		AutomationReportLogger.log("                                                    ");
		//Browser.getInstance().close();
		//WebDriverUtils.switchToBaseWindow();
	}

	public String doclickOnResellerrequest() {

		AutomationReportLogger.log("Successfully Swich On Reseller Page", true);
		AutomationReportLogger.log("                                                          ");
	    String Quoteid = sqQuoteCorePageObject.getsearchtext();
	    
	    sqResellerPageObject.setcustPhonenum("9886602020");
	 
	    sqResellerPageObject.clickOnResellercustomer_Btn();

		AutomationReportLogger.log("Successfully Click on Next To Customer", true);
		AutomationReportLogger.log("                                           ");
      return Quoteid;
      
	}

	public String doCreatCustomerDetailsRequest(QuoteTestdataSource dealCreationData) {

		AutomationReportLogger.log("Successfully Swich on Customer Page", true);
		AutomationReportLogger.log("   	                                       ");
		 String quotestatus = sqQuoteCorePageObject.getsearchstatus();		

		sqCustomerPageObject.clickOncustomer_NPFBtn();

		AutomationReportLogger.log("-->Successfully Click NEWCUSTOMER(*NPF is mandatory)");
		AutomationReportLogger.log("   	                                                   ");

		sqCustomerPageObject.setcustFullName(dealCreationData.getsFullLegalName());

		sqCustomerPageObject.setcustFirstName(dealCreationData.getsFirstName());

		sqCustomerPageObject.setcustLastName(dealCreationData.getsLastName());

		sqCustomerPageObject.setcustPhonenum("9886602020");

		sqCustomerPageObject.setcustEmail(dealCreationData.getsEmail());
		sqCustomerPageObject.setcustCity(dealCreationData.getsCity());
		sqCustomerPageObject.setcustStreetdetails(dealCreationData.getsStreet());

		sqCustomerPageObject.clickOnBtn_NexttoProducts();
		return quotestatus;

	}
	
	public String doCreatExCustomerDetailsRequest(QuoteTestdataSource dealCreationData) {

		AutomationReportLogger.log("Successfully Swich on Customer Page", true);
		AutomationReportLogger.log("   	                                       ");

		sqCustomerPageObject.doclickExcustomer();

		AutomationReportLogger.log("-->Successfully selected Previously CUSTOMER");
		AutomationReportLogger.log("   	                                                   ");
		 String quotestatus = sqQuoteCorePageObject.getsearchstatus();	
		/*sqCustomerPageObject.setcustFullName(dealCreationData.getFulllegalname());

		sqCustomerPageObject.setcustFirstName(dealCreationData.getFirstname());

		sqCustomerPageObject.setcustLastName(dealCreationData.getLastname());

		sqCustomerPageObject.setcustPhonenum("9886602020");

		sqCustomerPageObject.setcustEmail("narasimha.aluru@hp.com");
		sqCustomerPageObject.setcustCity(dealCreationData.getCity());
		sqCustomerPageObject.setcustStreetdetails(dealCreationData.getStreet());*/

		sqCustomerPageObject.clickOnBtn_NexttoProducts();
		return quotestatus;
	}

	public void doSelectProductDetails(QuoteTestdataSource dealCreationData) throws Exception {

		AutomationReportLogger.log("Successfully Swich On Product Page", true);
		AutomationReportLogger.log("                                                          ");

		sqProductPageObject.setProductPL(dealCreationData.getsProductLine());

		sqProductPageObject.clickOnProdcutSearch_Btn();

		Thread.sleep(3000);
		//sqProductPageObject.ClickonNexttoProduct_list();
		
		//sqProductPageObject.selectProduct_list(1);
		

		sqProductPageObject.onselect_checkbox();

		Thread.sleep(1000);
		
	

		sqProductPageObject.ClickonProduct_Add();

		Thread.sleep(1000);

		sqProductPageObject.setProduct_RBP_DiscountL("5");

		Thread.sleep(2000);

		sqProductPageObject.Clickonprdouct_setall();
		
		sqProductPageObject.doActionIPG_Radio();
		
		sqProductPageObject.ClickonNexttoDistribution();
		
		

	}

	public void doactionDistributorDetail(QuoteTestdataSource dealCreationData) throws Exception {
		
		sqDistributorPageObject.selectDistributor_list(dealCreationData.getsDistributorsList());

		sqDistributorPageObject.clickOnBtn_Distributor_core_Btn();

	}

	public String SQDealCreationNavigationExternal(QuoteTestdataSource dealCreationData) throws Exception {

		sqQuoteCorePageObject.selectQuoteCoredata_list(4);

		sqQuoteCorePageObject.setquoterequestcmt("Regression Testing");

		//sqQuoteCorePageObject.setquotequotDealReqID("Testing1234");

		sqQuoteCorePageObject.clickOnquotSave_btn();

		Thread.sleep(1500);
		sqQuoteCorePageObject.clickOnquotReview_submit();

		AutomationReportLogger.log("Successfully Submited Quote Core details", true);
		AutomationReportLogger.log("                                             ");

		sqQuoteCorePageObject.getInternaluser_flagCheckbox();

		sqQuoteCorePageObject.clickOnQuote_submission();

		Thread.sleep(10000);
		
		String quotstatus = sqQuoteCorePageObject.getsearchstatus();
		System.out.println(quotstatus);
		
		if(quotstatus.contains("Not Submitted to HP")){
			
			System.out.println(sqQuoteCorePageObject.getsearcherrmsg2());
			System.out.println(sqQuoteCorePageObject.getsearcherrmsg1());
			
			
		//throw new Exception();
		}
		
	     String smartQuoteid = sqQuoteCorePageObject.getsearchtext();
			
			AutomationReportLogger.log("Successfully Generated Smart Quote ID-->"+smartQuoteid, true);
			
			
			
    	return quotstatus; 
	
	}
}





