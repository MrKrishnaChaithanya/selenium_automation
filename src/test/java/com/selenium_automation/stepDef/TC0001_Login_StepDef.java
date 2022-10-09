package com.selenium_automation.stepDef;

import io.cucumber.java.en.*;

/* 
 * Step definition class is a test case of Feature file steps
*/
public class TC0001_Login_StepDef {

    @Given("user on the login page")
    public void user_on_the_login_page() 
    {
        System.out.println("user_on_the_login_page");
    }

    @Then("user should not be login to the application")
    public void user_should_not_be_login_to_the_application() 
    {
        System.out.println("user_should_not_be_login_to_the_application");
    }

    @When("user enter wrong credentials <{string}> <{string}> and click on login")
    public void user_enter_wrong_credentials_and_click_on_login(String string, String string2) 
    {
        System.out.println("user_enter_wrong_and_and_click_on_login: " +string +", "+ string2);
    }

    @Then("user should be login to the application")
    public void user_should_be_login_to_the_application() 
    {
        System.out.println("user_should_be_login_to_the_application");
    }

    @When("user enter {string} and {string} and click on login")
    public void user_enter_and_and_click_on_login(String s, String s2) 
    {
        System.out.println("user_enter_and_and_click_on_login: " +s +", "+ s2);
    }

}
