Feature: Validation of Interactions section
  Scenario: Resizable Functionality
    Given User is in Resizable Page
    When User drags the frame
    Then The size of the frame should be changed