package com.selenium_automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "features",
    glue = "com.selenium_automation.stepDef",
    dryRun = false,
    monochrome = true,
    publish = false,
    tags = "@Login"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
