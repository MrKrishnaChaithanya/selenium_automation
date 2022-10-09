package com.selenium_automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    
    //path of features files folder
    features = "features",
    //path of stepDef & hooks
    glue = {"com.selenium_automation.stepDef","com.selenium_automation.hooks"},
    dryRun = false,
    monochrome = true,
    publish = false,
    //add features file execution tag
    tags = "@ValidLogin"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
