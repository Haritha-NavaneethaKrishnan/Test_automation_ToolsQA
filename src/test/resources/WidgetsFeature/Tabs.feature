Feature: Validation of Widgets
  Scenario: Tabs Functionality
    Given User is in Tabs Page
    When User clicks on each tab
    Then Particular content should be displayed