package com.org.uiautomation;

public class UiAutomationLogger {

	private StringBuilder logContent;
	
	public UiAutomationLogger() {
		super();
		logContent = new StringBuilder();
	}

	public StringBuilder getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent.append(logContent);
		this.logContent.append("<br>");

	}

	public String getCompleteLogContent() {
		return this.logContent.toString();
	}

	public void clearLogContents(){
		  this.logContent = new StringBuilder();
		 }
}
