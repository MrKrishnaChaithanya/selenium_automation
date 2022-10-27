package com.selenium_automation.testCases;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC005_ChallengingDOM extends BaseTest{
    
    @Test(priority = 0)
    public void clickOnChallengingDOM() 
    {
        driver.findElement(By.linkText("Challenging DOM")).click();
    }
    
    @Test(priority = 1)
    public void printTable()
    {
        List<List<String>> list = new LinkedList<List<String>>();

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        for(WebElement row: rows)
        {
            List<String> local_list = new LinkedList<String>();
            List<WebElement> cols = row.findElements(By.tagName("td"));
            
            for(WebElement col: cols)
            {
                local_list.add(col.getText());
            }
            list.add(local_list);
            
        }

        System.out.println(list);
    }
}
