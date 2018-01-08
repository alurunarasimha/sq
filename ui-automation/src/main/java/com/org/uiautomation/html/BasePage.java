package com.org.uiautomation.html;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class BasePage {

	protected JsonObject locatorMap= new JsonObject();
	
	public BasePage(String locatorFile,String objpage){
			

		String locatorFilePath = "src/test/resources/locators/"+objpage+"/"+locatorFile+".json";
		
		Gson gson = new Gson();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader(locatorFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(" Locator File is not available :: "+locatorFilePath);
		}
		
		locatorMap = gson.fromJson(br,JsonObject.class);
	}
	
}
