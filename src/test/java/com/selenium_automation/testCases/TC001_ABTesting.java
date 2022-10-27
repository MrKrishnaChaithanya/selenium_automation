package com.selenium_automation.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_ABTesting extends BaseTest{
    

    @Test
    public void clickOnAbTestLink() {
        driver.findElement(By.linkText("A/B Testing")).click();
    }

    @Test
    public void verifyAbTestPage() 
    {
        String current_url = driver.getCurrentUrl();
        Assert.assertEquals(current_url, "https://the-internet.herokuapp.com/abtest");

        String h3= driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(h3, "A/B Test Control");

        String p= driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(p.trim(), "Also known as split testing. This is a way " 
            +"in which businesses are able to simultaneously test and learn different versions "
            +"of a page to see which text and/or functionality works best towards a desired " 
            +"outcome (e.g. a user action such as a click-through)."
            );
    }
}
