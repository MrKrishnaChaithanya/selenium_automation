package com.selenium_automation.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_AddRemoveElements extends BaseTest{
    
    @Test(priority = 0)
    public void clickOnAdd_remove_elements() {
        driver.findElement(By.linkText("Add/Remove Elements")).click();
    }
    
    @Test(priority = 1)
    public void checkButtons() {
        
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),
             "Add/Remove Elements");
        

        for(int x=0; x<5; x++){
            driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        }

        List<WebElement> list = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        Assert.assertEquals(list.size(), 5);

        for(WebElement ele: list){
            ele.click();
        }

        List<WebElement> list_2 = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

        Assert.assertEquals(list_2.size(), 0);

    }
    
}
