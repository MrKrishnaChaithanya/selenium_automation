package com.selenium_automation.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC004_BrokenImages extends BaseTest{
    
    @Test(priority = 0)
    public void clickOnBrokenImages() 
    {
        driver.findElement(By.linkText("Broken Images")).click();
    }
    
    @Test(priority = 1)
    public void checkBrockenImages() throws MalformedURLException, IOException 
    {
        List<WebElement> img = driver.findElements(By.xpath("//div[@class='example']/img"));

        for(WebElement ele: img){

            String src = ele.getAttribute("src");
            HttpURLConnection huc = (HttpURLConnection)(new URL(src).openConnection());

            huc.setConnectTimeout(2000);

            huc.connect();

            System.out.println("url= "+ src +", status code: " +huc.getResponseCode());
        }
    }
}
