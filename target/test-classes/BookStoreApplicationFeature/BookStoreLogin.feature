Feature: Login to Book Store Application
  Scenario Outline: Login Functionality
    Given User is in Tools QA site
    And Book Store Application card is clicked
    And User clicks on the Login Button
    And User enters the valid email ID <email>
    And User enters valid password <password>
    When User clicks on Login Button
    Then User navigates to Book Store page
    Examples:
      |email|password|
      |"abc@xyz.com"|"Test@123"|