package com.selenium_automation.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_BasicAuth extends BaseTest{
    
    @Test(priority = 0)
    public void clickOnBasicAuth() {
        driver.findElement(By.linkText("Basic Auth")).click();
    }

    @Test(priority = 1)
    public void loginWithBasicAuth() {

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    @Test(priority = 2)
    public void verifyBasicAuthPage() 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String h3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='example']/h3"))).getText();
        Assert.assertEquals(h3, "Basic Auth");

        String p= driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(p.trim(), "Congratulations! You must have the proper credentials.");
    }
}
