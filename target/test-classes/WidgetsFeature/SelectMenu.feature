Feature: Validation of Widget Section
  Scenario: Select Menu Functionality
    Given User is in Select Menu Page
    And User select the value from dropdown
    And User select one from dropdown
    And User select a color from old style dropdown
    When User clicks on the dropdown of Multiselect
    Then User selects colors
    And User selects a option from Standard multiselect