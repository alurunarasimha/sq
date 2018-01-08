package com.org.uiautomation;

public class AutomationReportLogger {

	private static final ThreadLocal<UiAutomationLogger> logger = new ThreadLocal<UiAutomationLogger>() {

        @Override
        protected UiAutomationLogger initialValue() {
        	
        	//Here we need to add conditions for IE , Chrome and we can add check for Grid Execution
        	UiAutomationLogger logger = new UiAutomationLogger();
        	return logger;
        }
    };
    
    
    public static UiAutomationLogger getInstace(){
    	return logger.get();
    }

    public static void log(String logMessage){
    	getInstace().setLogContent(logMessage);
    }
    
    public static void log(String logMessage,boolean takeScreenshot){
    
    	if(takeScreenshot){
    	
	    	String screenshotFileName = ReportGenerationFileHelper.copyScreentShot();
	    	
	    	String screenshotLink = "<a href='" + "./Screenshots/"+screenshotFileName +"'> Screenshot </a>";
	    	
	    	logMessage = logMessage + "&nbsp;&nbsp;" + screenshotLink.trim(); 
    	
    	}
    	
    	getInstace().setLogContent(logMessage);
    }
    
    public static void clearLogContents(){
        getInstace().clearLogContents();
       }
  
}
