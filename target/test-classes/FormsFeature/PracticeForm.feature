Feature: Validation of Practice Form under Forms section
  Scenario: Practice Form Validation
    Given User in Forms Page
    And User navigates to Practice form page
    And Enter the first name <"Haritha"> and last name <"NavaneethaKrishnan">
    And Fill the valid email address <"abc@xyz.com">
    And choose the gender
    And Enter the Mobile number <"9876542346">
    And Choose the hobbies
    And Upload a picture
    And Give the current Address details <"4/183C, Coimbatore">
    When User clicks the Submit button
    Then User should be able to view the entered details in a form
