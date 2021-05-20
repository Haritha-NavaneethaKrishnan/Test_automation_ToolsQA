Feature: Validation of Browser Window Page
  Scenario: New Tab Functionality
    Given User is in Browser Windows Page
    When User clicks on the New Tab Button
    Then New tab should open
