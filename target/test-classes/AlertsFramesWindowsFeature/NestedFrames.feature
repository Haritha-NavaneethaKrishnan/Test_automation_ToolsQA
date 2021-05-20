Feature: Validation of Alert,Frames and Windows
  Scenario: Nested Frames validation
    Given User in Nested Frames Page
    When User inspects the Nested Frames
    Then User should be able to view the parent and child frames in nested form