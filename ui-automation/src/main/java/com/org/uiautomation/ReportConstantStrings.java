package com.org.uiautomation;

/**
 * The Class ReportConstantStrings.
 */
public class ReportConstantStrings {

	/** The template row content. */
	private static String templateRowContent;
	
	/** The complete row content. */
	private static String completeRowContent;
	
	/** The sno. */
	private static String SNO = "#SNO#";
	
	/** The classname. */
	private static String CLASSNAME = "#CLASSNAME#";
	
	/** The methodname. */
	private static String METHODNAME = "#METHODNAME#";
	
	/** The status. */
	private static String STATUS = "#STATUS#";
	
	/** The params. */
	private static String PARAMS = "#PARAMS#";
	
	/** The STACKTRACES link. */
	private static String STACKTRACES = "#STACKTRACES#";
	
	private static String LOGS	=	"#LOGS#";
	
	/** The test counter. */
	private static int testCounter = 0;

	/**
	 * Sets the template row content.
	 *
	 * @param className the class name
	 * @param methodName the method name
	 * @param status the status
	 * @param params the params
	 * @param serviceLogLink the service log link
	 */
	public static void setTemplateRowContent(String className,String methodName,int status,String params,String stacktraces, String logs) {
		
		testCounter = testCounter + 1;
		String testResult = "";
		
		if(status == 1){
			testResult = "PASSED";
		}
		else if(status == 2){
			testResult = "FAILED";
		}
		else if(status == 3){
			testResult = "SKIPPED";
		}
		else{
			testResult = "UNKNOWN";
		}
		
		String rowTeplateContentData = getTemplateRowContent();
		rowTeplateContentData = rowTeplateContentData.replaceAll(getSNO(), String.valueOf(testCounter));
		rowTeplateContentData = rowTeplateContentData.replaceAll(getCLASSNAME(), className);
		rowTeplateContentData = rowTeplateContentData.replaceAll(getMETHODNAME(), methodName);
		rowTeplateContentData = rowTeplateContentData.replaceAll(getSTATUS(), testResult);
		if( ! params.contains("Ljava.lang.Object")){
			rowTeplateContentData = rowTeplateContentData.replaceAll(getPARAMS(), params);
		}
		else{
			rowTeplateContentData = rowTeplateContentData.replaceAll(getPARAMS(), "");
		}
		
		if(stacktraces != null){	
			rowTeplateContentData = rowTeplateContentData.replace(getSTACKTRACES(), stacktraces);
		}
		else{
			rowTeplateContentData = rowTeplateContentData.replaceAll(getSTACKTRACES(), "");
		}
		
		if(logs != null){
			rowTeplateContentData = rowTeplateContentData.replaceAll(getLOGS(), logs);
		}
		else{
			rowTeplateContentData = rowTeplateContentData.replaceAll(getLOGS(), "");
		}
		
		setCompleteRowContent(rowTeplateContentData);
	}
	
	/**
	 * Gets the template row content.
	 *
	 * @return the template row content
	 */
	public static String getTemplateRowContent() {
		templateRowContent = "<tr class='RowToClick'><td>" + SNO + "</td><td>" + CLASSNAME
				+ "</td><td>" + METHODNAME + "</td><td>" + STATUS + "</td><td>" + PARAMS + "</td></tr>"
				+"<tr style='display: none;'> <td> </td> <td>"
				+ STACKTRACES + "</td><td>"
				+ LOGS + "</td> </tr>";
		return templateRowContent;
	}

	/**
	 * Gets the sno.
	 *
	 * @return the sno
	 */
	public static String getSNO() {
		return SNO;
	}

	/**
	 * Gets the classname.
	 *
	 * @return the classname
	 */
	public static String getCLASSNAME() {
		return CLASSNAME;
	}

	/**
	 * Gets the methodname.
	 *
	 * @return the methodname
	 */
	public static String getMETHODNAME() {
		return METHODNAME;
	}

	/**
	 * Gets the params.
	 *
	 * @return the params
	 */
	public static String getPARAMS() {
		return PARAMS;
	}
	
	

	public static String getSTACKTRACES() {
		return STACKTRACES;
	}

	public static void setSTACKTRACES(String sTACKTRACES) {
		STACKTRACES = sTACKTRACES;
	}

	public static String getLOGS() {
		return LOGS;
	}

	public static void setLOGS(String lOGS) {
		LOGS = lOGS;
	}

	/**
	 * Gets the complete row content.
	 *
	 * @return the complete row content
	 */
	public static String getCompleteRowContent() {
		return completeRowContent;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public static String getSTATUS() {
		return STATUS;
	}

	/**
	 * 
	 * Sets the complete row content.
	 *
	 * @param newCompleteRowcontent the new complete row content
	 */
	private static void setCompleteRowContent(String newCompleteRowcontent) {

		if ((null != completeRowContent) && (completeRowContent.length() > 0)) {
			completeRowContent = completeRowContent + newCompleteRowcontent;
		} else {
			completeRowContent = newCompleteRowcontent;
		}
	}
}
