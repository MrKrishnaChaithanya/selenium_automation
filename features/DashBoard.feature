@RegressionTest @DashBoard
Feature: Validate Dash Board

  @ValidLogin
  Scenario: Validate Dash Board page all the links and data
    Given user on the Dash Board page
    When user clicks on the all links
    Then verify data and links status codes
