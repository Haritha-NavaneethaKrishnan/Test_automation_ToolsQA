Feature: Validation of Browser Window Page
  Scenario: New Window Functionality
    Given User in Browser Windows Page
    When User clicks on the New Window Button
    Then New window should be opened
