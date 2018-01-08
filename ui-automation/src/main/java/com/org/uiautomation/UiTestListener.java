package com.org.uiautomation;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class UiTestListener implements ITestListener, IInvokedMethodListener, ISuiteListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

		if (method.isTestMethod()) {

			WebDriver driver = DriverIntializer.getWebDriverInstance();
			Browser.setWebDriver(driver);
			Browser.setBaseWindowId();
			AutomationReportLogger.getInstace();
			
		}

	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		

		setCustomReportData(testResult);
		//Browser.getInstance().quit();
		
		if (Browser.getInstance() != null) {
			Browser.getInstance().quit();
			  }
		
		if(AutomationReportLogger.getInstace().getCompleteLogContent() != null){
			   AutomationReportLogger.clearLogContents();
			  }
	}

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ISuite suite) {

		File outFile = new File(suite.getOutputDirectory());

		String screenshotsFolder = outFile.getParent() + File.separator + "Screenshots";

		File screenshotsFolderExists = new File(screenshotsFolder);

		if (!screenshotsFolderExists.isDirectory()) {
			screenshotsFolderExists.mkdir();
		}

		ReportGenerationFileHelper.reportDir = outFile.getParent();
	}

	public void onFinish(ISuite suite) {

		String oldtext = "<!DOCTYPE html> <html> <head> <title>Smart QuoteTest Report</title> <style> body { 	width: auto; 	margin: 40px auto; 	font-family: 'trebuchet MS', 'Lucida sans', Arial; 	font-size: 14px; 	color: #444; }  table { 	*border-collapse: collapse; /* IE7 and lower */ 	border-spacing: 0; 	width: 100%; }  .bordered { 	border: solid #ccc 1px; 	-moz-border-radius: 6px; 	-webkit-border-radius: 6px; 	border-radius: 6px; 	-webkit-box-shadow: 0 1px 1px #ccc; 	-moz-box-shadow: 0 1px 1px #ccc; 	box-shadow: 0 1px 1px #ccc; }  .bordered tr:hover { 	background: #fbf8e9; 	-o-transition: all 0.1s ease-in-out; 	-webkit-transition: all 0.1s ease-in-out; 	-moz-transition: all 0.1s ease-in-out; 	-ms-transition: all 0.1s ease-in-out; 	transition: all 0.1s ease-in-out; }  .bordered td, .bordered th { 	border-left: 1px solid #ccc; 	border-top: 1px solid #ccc; 	padding: 10px; 	text-align: left; }  .bordered th { 	background-color: #dce9f9; 	background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), 		to(#dce9f9)); 	background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9); 	background-image: -moz-linear-gradient(top, #ebf3fc, #dce9f9); 	background-image: -ms-linear-gradient(top, #ebf3fc, #dce9f9); 	background-image: -o-linear-gradient(top, #ebf3fc, #dce9f9); 	background-image: linear-gradient(top, #ebf3fc, #dce9f9); 	-webkit-box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; 	-moz-box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; 	box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; 	border-top: none; 	text-shadow: 0 1px 0 rgba(255, 255, 255, .5); }  .bordered td:first-child, .bordered th:first-child { 	border-left: none; }  .bordered th:first-child { 	-moz-border-radius: 6px 0 0 0; 	-webkit-border-radius: 6px 0 0 0; 	border-radius: 6px 0 0 0; }  .bordered th:last-child { 	-moz-border-radius: 0 6px 0 0; 	-webkit-border-radius: 0 6px 0 0; 	border-radius: 0 6px 0 0; }  .bordered th:only-child { 	-moz-border-radius: 6px 6px 0 0; 	-webkit-border-radius: 6px 6px 0 0; 	border-radius: 6px 6px 0 0; }  .bordered tr:last-child td:first-child { 	-moz-border-radius: 0 0 0 6px; 	-webkit-border-radius: 0 0 0 6px; 	border-radius: 0 0 0 6px; }  .bordered tr:last-child td:last-child { 	-moz-border-radius: 0 0 6px 0; 	-webkit-border-radius: 0 0 6px 0; 	border-radius: 0 0 6px 0; }   .zebra td, .zebra th { 	padding: 10px; 	border-bottom: 1px solid #f2f2f2; }  .zebra tbody tr:nth-child(even) { 	background: #f5f5f5; 	-webkit-box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; 	-moz-box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; 	box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset; }  .zebra th { 	text-align: left; 	text-shadow: 0 1px 0 rgba(255, 255, 255, .5); 	border-bottom: 1px solid #ccc; 	background-color: #eee; 	background-image: -webkit-gradient(linear, left top, left bottom, from(#f5f5f5), 		to(#eee)); 	background-image: -webkit-linear-gradient(top, #f5f5f5, #eee); 	background-image: -moz-linear-gradient(top, #f5f5f5, #eee); 	background-image: -ms-linear-gradient(top, #f5f5f5, #eee); 	background-image: -o-linear-gradient(top, #f5f5f5, #eee); 	background-image: linear-gradient(top, #f5f5f5, #eee); }  .zebra th:first-child { 	-moz-border-radius: 6px 0 0 0; 	-webkit-border-radius: 6px 0 0 0; 	border-radius: 6px 0 0 0; }  .zebra th:last-child { 	-moz-border-radius: 0 6px 0 0; 	-webkit-border-radius: 0 6px 0 0; 	border-radius: 0 6px 0 0; }  .zebra th:only-child { 	-moz-border-radius: 6px 6px 0 0; 	-webkit-border-radius: 6px 6px 0 0; 	border-radius: 6px 6px 0 0; }  .zebra tfoot td { 	border-bottom: 0; 	border-top: 1px solid #fff; 	background-color: #f1f1f1; }  .zebra tfoot td:first-child { 	-moz-border-radius: 0 0 0 6px; 	-webkit-border-radius: 0 0 0 6px; 	border-radius: 0 0 0 6px; }  .zebra tfoot td:last-child { 	-moz-border-radius: 0 0 6px 0; 	-webkit-border-radius: 0 0 6px 0; 	border-radius: 0 0 6px 0; }  .zebra tfoot td:only-child { 	-moz-border-radius: 0 0 6px 6px; 	-webkit-border-radius: 0 0 6px 6px border-radius: 0 0 6px 6px } </style>  <script src='http://code.jquery.com/jquery-1.5.1.min.js' type='text/javascript'></script>  <script type='text/javascript'> 		                 $(document).ready(function()              {                  $('.RowToClick').click(function ()                  {                      $(this).nextAll('tr').each( function()                      {                          if ($(this).is('.RowToClick'))                         {                            return false;                         }                         $(this).toggle(350);                      });                  });              });  </script>   </head>  <body>  	<h2> Smart Quote Test Report</h2> 	<table class='bordered' > 		<thead>  			<tr> 				<th>S.No</th> 				<th>TestClassName</th> 				<th>MethodName</th> 				<th>Status</th> 				<th>Parameters</th> 			</tr> 		</thead> 		<tbody> 			#content# 		</tbody>  	</table>  </body>  </html> ";
		
		try{
			String serviceLogsContent = ReportConstantStrings.getCompleteRowContent();
			if (serviceLogsContent != null) {
				String newtext = oldtext.replace("#content#", serviceLogsContent);
				String newfileName = ReportGenerationFileHelper.createReportHtml(suite);
				ReportGenerationFileHelper.writeContentInToFile(newfileName, newtext);
			} else {
				System.out.println("Error while retriving the Logs");
			}
		} catch (Exception ex) {
		}

	}

	private void setCustomReportData(ITestResult testResult) {

		ITestNGMethod testmethod = testResult.getMethod();
		String canonicalClassName = testResult.getInstanceName();
		String methodName = testmethod.getMethodName();
		//String parameters = Arrays.toString(testResult.getParameters());
		String paramters = testResult.getParameters().toString();

		String statckTraces = TestNGHelper.getStackTraces(testResult);

		String testLogs = TestNGHelper.getTestLogs();

		testLogs = String.join("<br>", Reporter.getOutput(testResult)) + "<br>" + testLogs;//TODO :: Need update the logic to print the log statement in order.

		ReportConstantStrings.setTemplateRowContent(canonicalClassName, methodName, testResult.getStatus(), paramters,
				statckTraces, testLogs);

	}

	public void onStart(ITestContext context) {

		ConfigReader.readAndSetConfigData();

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	/*private void doScreenCaptureAndQuitBrowser() {

		if (Browser.getInstance() != null) {
			AutomationReportLogger.log("Title :: " + Browser.getInstance().getTitle(), true);
			Browser.getInstance().quit();
		}
	}*/

}
