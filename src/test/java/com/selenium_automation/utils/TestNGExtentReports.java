package com.selenium_automation.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNGExtentReports {

    //current time
    private static final String time= new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss-sss").format(new Date());

    //ExtentReports
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter(".Test-OutPut/ExtentReports-"+time+".html");

    
    public void onTestSuccess(ITestContext context)
    {
        
    }
    
}
