package com.smartquote.automation;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.org.uiautomation.Browser;
import com.org.uiautomation.ConfigReader;
import com.smartquote.automation.excelutilities.SQExcelUtilities;
import com.smartquote.automation.quotedata.DealCreationData;
import com.smartquote.automation.quotedata.QuoteTestdataSource;
import com.smartquote.automation.uipages.external.SQDealCreationNavigationExternal;
import com.smartquote.automation.uipages.external.SQDealCreationNavigationVerifications;
import com.smartquote.automation.uipages.internal.SQDealCreationNavigationInternal;
import com.smartquote.automation.uipages.internal.SQ_SmartQuote_Internal_Admin_HomePageObject;
import com.smartquote.automation.utilities.DataProviderUtilities;
import com.smartquote.automation.utilities.GetQuoteUtilities;

public class SQ_Standalone_DealCreate {

	private QuoteTestdataSource dealCreationData;
	public String QuoteID;
	public String quotestatus;
	public String squotstatus;

	@Factory(dataProviderClass = DataProviderUtilities.class, dataProvider = "dataForSQExternal")
	public SQ_Standalone_DealCreate(QuoteTestdataSource dealCreationData) {

		this.dealCreationData = dealCreationData;

	}

	@Test
	public void sqExternalDealCreation() throws Exception {

		String[] valueToWrite = new String[8];
		try {

			SQDealCreationNavigationExternal sqDealCreationNavigation = new SQDealCreationNavigationExternal();
			GetQuoteUtilities SQDealUtilities = new GetQuoteUtilities();

			String url = ConfigReader.getConfigData().getURL();

			String[] Url1 = SQDealUtilities.checkStringurl(url);

			Browser.getInstance().get(Url1[0]);

			sqDealCreationNavigation.doSimulatorLogin(dealCreationData);
			sqDealCreationNavigation.doClickOnNewRequest();

			QuoteID = sqDealCreationNavigation.doclickOnResellerrequest();

			if (ConfigReader.getConfigData().getPassword().isEmpty())

			{
				quotestatus = sqDealCreationNavigation.doCreatCustomerDetailsRequest(dealCreationData);

			} else {

				quotestatus = sqDealCreationNavigation.doCreatExCustomerDetailsRequest(dealCreationData);

			}

			sqDealCreationNavigation.doSelectProductDetails(dealCreationData);
			sqDealCreationNavigation.doactionDistributorDetail(dealCreationData);
			squotstatus = sqDealCreationNavigation.SQDealCreationNavigationExternal(dealCreationData);
			System.out.println(
			dealCreationData.getsParterProId() + "::" + dealCreationData.getsCountryCode() + "::" + QuoteID);
			valueToWrite[0] = dealCreationData.getsParterProId();
			valueToWrite[1] = dealCreationData.getsCountryCode();
			valueToWrite[2] = QuoteID;
			valueToWrite[3] = squotstatus;
			valueToWrite[4] = "PASSSED";
			valueToWrite[5] = "PASSSED";
			valueToWrite[6] = "PASSSED";
			valueToWrite[7] = "PASSSED";
			SQExcelUtilities SQWriteExcelFile = new SQExcelUtilities();

			// Write the file using file name, sheet name and the data to be
			// filled__AU

			SQWriteExcelFile.SQ_ExcelWrite("C:/Users/aluru/Desktop/SQResults",
					ConfigReader.getConfigData().getSqresellerresults(),
					"Status_Reseller_" + dealCreationData.getsCountryCode(), valueToWrite);

		} catch (Exception e) {

			valueToWrite[0] = dealCreationData.getsParterProId();
			valueToWrite[1] = dealCreationData.getsCountryCode();
			valueToWrite[2] = QuoteID;
			valueToWrite[3] = squotstatus;
			valueToWrite[4] = "FAILED";
			valueToWrite[5] = "FAILED";
			valueToWrite[6] = "FAILED";
			valueToWrite[7] = "FAILED";
			// TODO: handle exception

			SQExcelUtilities SQWriteExcelFile = new SQExcelUtilities();

			// Write the file using file name, sheet name and the data to be
			// filled__AU
			SQWriteExcelFile.SQ_ExcelWrite("C:/Users/aluru/Desktop/SQResults",
					ConfigReader.getConfigData().getSqresellerresults(),
					"Status_Reseller_" + dealCreationData.getsCountryCode(), valueToWrite);

		}

	}

	@Test(dependsOnMethods = { "sqExternalDealCreation" })
	public void sqInternalDealCreation() throws Exception {
		SQDealCreationNavigationInternal sqDealCreationNavigationInternal = new SQDealCreationNavigationInternal();
		SQ_SmartQuote_Internal_Admin_HomePageObject SqSmartQuoteInternalAdminHomePage = new SQ_SmartQuote_Internal_Admin_HomePageObject();
		String url = ConfigReader.getConfigData().getURL();

		String[] Url2 = GetQuoteUtilities.checkStringurl(url);
		Thread.sleep(10000);

		Browser.getInstance().get(Url2[1]);

		String[] QuoteID1 = GetQuoteUtilities.checkString(QuoteID);

		sqDealCreationNavigationInternal.doInternalSimulatorLogin(dealCreationData);
		sqDealCreationNavigationInternal.doandactionQuoteid();
		Thread.sleep(10000);
		SqSmartQuoteInternalAdminHomePage.setSmartQuoteid(QuoteID1[1]);
		SqSmartQuoteInternalAdminHomePage.clickOnGo_Btn();
		sqDealCreationNavigationInternal.doandActionProcessQuote(dealCreationData);
		sqDealCreationNavigationInternal.doandActionEISProcess(dealCreationData);

	}

}
