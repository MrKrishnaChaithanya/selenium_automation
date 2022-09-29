@RegressionTest @Login
Feature: Application login

  Background: 
    Given user on the login page

  Scenario: Validate application login with Valid credentials
    When user enter "username" and "password" and click on login
    Then user should be login to the application

  Scenario Outline: Validate application login with invalid credentials
    When user enter wrong "username" and "password" and click on login
    Then user should not be login to the application
