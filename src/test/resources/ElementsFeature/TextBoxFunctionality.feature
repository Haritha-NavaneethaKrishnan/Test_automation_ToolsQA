Feature: Validation of Text Box Functionality in Elements Page
  Scenario: Text Box Functionality
    Given User is in Text Box Page
    And User enters the name <"Haritha"> in Full Name input field
    And User enters the valid email address <"abc@xyz.com"> in email input field
    And User enters the current address <"4/183 C , coimbatore"> in current address input field
    And User User enters the permanent address <"4/183 C , coimbatore"> in permanent address input field
    When User clicks on the submit button
    Then User entered details should be viewed below the submit button
