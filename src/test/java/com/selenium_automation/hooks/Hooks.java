package com.selenium_automation.hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.selenium_automation.utils.GetConfigProp;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

/* 
 * Hooks class contains pre & post actions like
 * open browser & any connections and at the end close browser etc...
*/
public class Hooks {

    //Webdriver instance
    public static WebDriver driver;
    
    @BeforeAll
    public static void setUp() 
    {
        //browser open
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //implicitlyWait load time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //open url from configuration properties
        driver.get(GetConfigProp.getConfigPropData("app_url"));
    }

    @AfterAll
    public static void tearDown() 
    {
        //close browsers
        driver.quit();
    }
}
