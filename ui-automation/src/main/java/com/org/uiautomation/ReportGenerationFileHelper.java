package com.org.uiautomation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;

public class ReportGenerationFileHelper {
	
	public static String reportDir;
	
	public static String createReportHtml(ISuite suite){
		
		File outFile = new File(suite.getOutputDirectory());
        String outputDirectory = outFile.getParent();

		String fileName =  outputDirectory + File.separator + "automation-report.html";
		
		return fileName;
	}
	
	public static void writeContentInToFile(String fileName, String content){

		File file = new File(fileName);
		try {
			if(!file.exists())
				file.createNewFile();

			FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(content);
			bw.close();
		}catch (IOException e) {
			
		}

	}
	
	public static String copyScreentShot(){
	
		
		String screenshotsFolder = reportDir + File.separator + "Screenshots";
		
		String screenshotName =  Calendar.getInstance().getTimeInMillis()+"".trim() + ".png";
		
		File scrFile = ((TakesScreenshot) Browser.getInstance())
				.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File(screenshotsFolder+File.separator+screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return screenshotName;
	   
	}
	
}
