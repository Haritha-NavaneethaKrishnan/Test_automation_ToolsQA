Feature: Validation of Alert,Frames and Windows
  Scenario: Frames validation
    Given User is in Frames Page
    When User scrolls down to the end of page
    Then User should see two iframes in Frames Page