package com.selenium_automation.stepDef;

import org.testng.annotations.Test;
import io.cucumber.java.en.*;

public class TC0002_DashBoard_StepDef 
{
    @Given("user on the Dash Board page")
    public void user_on_the_Dash_Board_page() 
    {
        System.out.println("user_on_the_Dash_Board_page");
    }

    @When("user clicks on the all links")
    public void user_clicks_on_the_all_links() 
    {
        System.out.println("user_clicks_on_the_all_links");
    }

    @Then("verify data and links status codes")
    public void verify_data_and_links_status_codes() 
    {
        System.out.println("verify_data_and_links_status_codes");
    }

    @Test
    public void testcase2()
    {
        System.out.println("test case2");
    }

}
