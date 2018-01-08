package com.smartquote.automation.uipages.external;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.uiautomation.AutomationReportLogger;
import com.org.uiautomation.Browser;
import com.org.uiautomation.html.BasePage;
import com.org.uiautomation.html.HtmlUtils;

public class SQ_Distributor_External_PageObject extends BasePage {

	public SQ_Distributor_External_PageObject() {
		super("SQ_Distributor_External_Obj","SQ_Extrnal_Obj");

	}

	
	private WebElement getsearchDistributor_coreData_btn() {
		WebElement searchTextFieldValue = HtmlUtils
				.doIdentifyElement(locatorMap.get("NEXT_TO_QUOTE_CORE_DATA").getAsString());
		return searchTextFieldValue;
	}
	
	private Select getselectDistributor_list() {
		
		Select oSelect = new Select(Browser.getInstance().findElement(By.xpath("//*[@id='combo0']")));
		
		return oSelect;
		
		
	
	}
	
	

public void selectDistributor_list(String string) throws Exception {
	
	//getselectDistributor_list().selectByIndex(string);
	getselectDistributor_list().selectByVisibleText(string);

		
		Thread.sleep(12000);
		
		AutomationReportLogger.log("Successfully enter Distributor_list value  in Distributor Page",true);
		AutomationReportLogger.log("   	                                                   ");
	}

	

	public void clickOnBtn_Distributor_core_Btn() {

		getsearchDistributor_coreData_btn().click();
		AutomationReportLogger.log("Successfully Click on Next to QUOTE CORE DATAs button in Distributor Page");
		AutomationReportLogger.log("   	                                                   ");
			
	}

	
}
