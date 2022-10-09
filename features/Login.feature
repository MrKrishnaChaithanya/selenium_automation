@RegressionTest @Login
Feature: Application login
  Validate application login with valid and in-valid credentials 

  Background: 
    Given user on the login page

  @ValidLogin
  Scenario: Validate application login with valid credentials
    When user enter "username" and "password" and click on login
    Then user should be login to the application

  @InValidLogin
  Scenario Outline: Validate application login with invalid credentials
    When user enter wrong credentials <"username"> <"password"> and click on login
    Then user should not be login to the application

    Examples: 
      | username | password    |
      | dummy1   | dummy pass1 |
      | dummy2   | dummy pass2 |
