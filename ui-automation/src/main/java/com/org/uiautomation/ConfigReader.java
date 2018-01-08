package com.org.uiautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The Class LifeCycleConfigReader.
 */
public class ConfigReader {

	/** The config data. */
	private static ConfigFileData configData;
	
	/**
	 * Read config data.
	 *
	 * @return the life cycle config
	 */
	public static void readAndSetConfigData(){
		
		//int urli =0;
		
		Properties props = new Properties();
		
		try {
			
			File file = new File(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			
			props.load(new FileInputStream(file.getAbsolutePath()));
		} catch (IOException | NullPointerException e) {
			throw new RuntimeException("[Config File Missed -- Error] -- Please provide the config file"); //TODO: 
		}
		
		String browser = props.getProperty(Config.BROWSER.getConfigvalue());
		String url = props.getProperty(Config.URL.getConfigvalue());
		//String url1 = props.getProperty(Config.URL1.getConfigvalue());
		String runlocally = props.getProperty(Config.RUNLOCALLY.getConfigvalue());
		String username = props.getProperty(Config.USERNAME.getConfigvalue());
		String password = props.getProperty(Config.PASSWORD.getConfigvalue());
		String sqresellerresults = props.getProperty(Config.SQRESELLERRESULTS.getConfigvalue());
				
		configData = new ConfigFileData(browser,runlocally,url,username,password,sqresellerresults); 
			
			
			
	}
		
	
	/**
	 * Sets the config data.
	 *
	 * @param lifeCycleConfigData the new config data
	 */
	public static void setConfigData(ConfigFileData lifeCycleConfigData){
		configData =  lifeCycleConfigData;
	} 
	
	/**
	 * Gets the config data.
	 *
	 * @return the config data
	 */
	public static ConfigFileData getConfigData(){
		return configData;
	}
	
	/**
	 * Gets the value with custom property name.
	 *
	 * @param propertyName
	 *            the property name
	 * @return the valuewith custom property name
	 */
	public static String getValuewithCustomPropertyName(String propertyName){
		
		Properties props = new Properties();
		
		try {
			File file = new File(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			props.load(new FileInputStream(file.getAbsolutePath()));
		} catch (IOException | NullPointerException e) {
			throw new RuntimeException("[Config File Missed -- Error] -- Please provide the config file"); //TODO: 
		}
		
		if(!props.containsKey(propertyName)){
			throw new RuntimeException("Property is missed in Config File tried arg is :"+propertyName); //TODO:
		}
		
		return props.getProperty(propertyName).toString();
	}
}
