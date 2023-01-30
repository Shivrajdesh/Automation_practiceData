package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\HP\\eclipse-workspace\\Batch16_AutomationPractice\\Config\\Config.properties";
		FileInputStream file=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(file);	
	}
	
	public String getBaseUrlQA1() {
		return pro.getProperty("BaseUrlQA1");
	}
	 
	public String getBrowserName(){
		
		return pro.getProperty("BrowserName");
	}
	public String getBrowserName1() {
		return pro.getProperty("BrowserName1");
	}
	public String getBrowserName2() {
		return pro.getProperty("BrowserName2");
	}
	
}
