package com.selenium_automation.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp() 
    {
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @BeforeTest
    public void openUrl() 
    {
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterSuite
    public void tearDown() 
    {
        driver.quit();
    }
    
}
