Feature: Validation of Web Table in Elements Section
  Scenario: Add user to Web Table
    Given User is in Web Table Page
    And User clicks on Add button
    And User enters the First Name <"Haritha">
    And User enters the Last Name <"N">
    And User enters the email address <"abc@xyz.com">
    And User enters the age <"22">
    And User enters the salary details <"21000">
    And User enters the department <"Information Technology">
    When User clicks on submit button
    Then New user should be added to the Table