package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator { //add dependencies ExtentReports

	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String report="C:\\Users\\HP\\eclipse-workspace\\Batch16_AutomationPractice\\Reports";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(report);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 16 Test Report- Automation");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project", "Automation_Project_HealthCare");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("BrowserName", "Chrome");
		extent.setSystemInfo("OS Name", "Window10");
		extent.setSystemInfo("QA Name", "Shivraj Deshmukh");
		
		return extent;  //return extent object using for use in listner class
		
	}
	
	
}
