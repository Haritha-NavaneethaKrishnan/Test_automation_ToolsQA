Feature: Validation of Alerts
  Scenario: Alert after 5 seconds
    Given User in the Alerts Page
    When User click on the second button
    Then User should be able to see the alert after 5 seconds
