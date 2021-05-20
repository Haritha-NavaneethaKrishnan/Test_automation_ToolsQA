Feature: Validation of Check Box Box Functionality in Elements Page
  Scenario: Check Box Functionality
    Given User is in Check Box Page
    And User clicks on the drop down arrow of Home Option
    And User checks the wanted Options
    When User user clicks the minus button
    Then The selected checkboxes should be mentioned under You have selected tag
