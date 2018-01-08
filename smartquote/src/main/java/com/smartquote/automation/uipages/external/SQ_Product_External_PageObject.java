package com.smartquote.automation.uipages.external;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Product_External_PageObject extends BasePage {

	public SQ_Product_External_PageObject() {
		super("SQ_Product_External_Obj","SQ_Extrnal_Obj");

	}

	private WebElement getsearchPrdouct_PL() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("Product_PL").getAsString());
		return searchTextFieldValue;
	}

	public void setProductPL(String seachString) {

		getsearchPrdouct_PL().sendKeys(seachString);
		AutomationReportLogger.log("Successfully entered Product Line in Product Deatails");
		AutomationReportLogger.log("                                                          ");

	}

	private WebElement getProdcutSearch_Btn() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("Search_Btn").getAsString());
		return searchTextFieldValue;

	}

	public void clickOnProdcutSearch_Btn() {

		getProdcutSearch_Btn().click();

		AutomationReportLogger.log("Successfully click on Search button in Product Deatails");
		AutomationReportLogger.log("                                                          ");
	}

	private WebElement getsearchProduct_Add() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("Product_Add").getAsString());
		return searchTextFieldValue;
	}

	public void ClickonProduct_Add() {

		AutomationReportLogger.log("Successfully click on Product Number check box in Product Deatails", true);
		AutomationReportLogger.log("                                                          ");

		getsearchProduct_Add().click();

		AutomationReportLogger.log("Successfully click on Add product(s) to list in Product Deatails");
		AutomationReportLogger.log("                                                          ");
	}

	private WebElement getsearchPrdouct_RBP_Discount() {
		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("RBP_Discount").getAsString());
		return searchTextFieldValue;
	}

	public void setProduct_RBP_DiscountL(String seachString) {

		getsearchPrdouct_RBP_Discount().sendKeys(seachString);

	}

	private WebElement getsearchprdouct_setall() {

		WebElement searchTextFieldValue = HtmlUtils.doIdentifyElement(locatorMap.get("prdouct_setall").getAsString());
		return searchTextFieldValue;

	}

	public void Clickonprdouct_setall() throws InterruptedException {

		getsearchprdouct_setall().click();

		Thread.sleep(3000);

		AutomationReportLogger.log("Successfully entered on RBP Discount and set all in Product Deatails", true);
		AutomationReportLogger.log("                                                          ");

	}

	private WebElement getsearchNexttoDistribution() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("NexttoDistribution").getAsString());
		return searchTextFieldValue;
	}

	public void ClickonNexttoDistribution() {

		getsearchNexttoDistribution().click();

		AutomationReportLogger.log("Successfully Click on Next to Products button in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}

	private List<WebElement> getsearchprdouct_check() {
		List<WebElement> searchTextFieldValue = HtmlUtils
				.doIdentifyElements(locatorMap.get("Product_Num_checkbox").getAsString());

		return searchTextFieldValue;
	}

	public void onselect_checkbox() {

		// This will tell you the number of Check Boxes are present
		int iSize = getsearchprdouct_check().size();

		// Start the loop from first Check Box to last Check Box
		for (int i = 0; i < iSize; i++) {
			// Select the Check Box it based on application functionality what
			// we are looking for
			if (i == 1) {

				break;

			} else {

				getsearchprdouct_check().get(i).click();

			}

		}
	}

	private Select getselectProduct_list() {
		
		Select oSelect = new Select(Browser.getInstance().findElement(By.xpath("//*[@id='ext-gen74']")));
		
		return oSelect;
		
		
	
	}
	
	private WebElement getsearchProduct_list() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("Productcountrylist").getAsString());
		return searchTextFieldValue;
	}

	public void ClickonNexttoProduct_list() {

		getsearchProduct_list().click();

		AutomationReportLogger.log("Successfully Click on Next to Products button in Customer Deatails");
		AutomationReportLogger.log("   	                                                   ");
	}
	
	
	private Select getselectProduct_list2() {
		
		Select oSelect = new Select(Browser.getInstance().findElement(By.xpath("//*[@id='comboCurrencyCode']")));
		
		return oSelect;
		
	
	
	}
	
	

public void selectProduct_list(int string) throws Exception {
	
	
	getselectProduct_list().selectByIndex(string);
	

		
		Thread.sleep(12000);
		
		AutomationReportLogger.log("Successfully enter Prodcut_list value  in Distributor Page");
		AutomationReportLogger.log("   	                                                   ");
	}

public void selectProduct_list2(int string) throws Exception {
	
	
	getselectProduct_list2().selectByIndex(string);
	
	
		Thread.sleep(12000);
		
		//AutomationReportLogger.log("Successfully enter Prodcut_list value  in Distributor Page");
		//AutomationReportLogger.log("   	                                                   ");
	}

public void doActionIPG_Radio() throws Exception {

if (getIPG_Radio().isDisplayed()) {

		AutomationReportLogger.log("-->IPG redio is enabled and selected");
		AutomationReportLogger.log("                                ");
		getIPG_Radio().click();
}

}

public WebElement getIPG_Radio() {
	WebElement IPG_Radio_radio = HtmlUtils
			.doIdentifyElement(locatorMap.get("Product_IPO_Radio").getAsString());
	return IPG_Radio_radio;
}

	
}
