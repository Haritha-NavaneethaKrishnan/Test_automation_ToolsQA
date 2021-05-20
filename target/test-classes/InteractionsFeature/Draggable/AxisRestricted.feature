Feature: Validation of Interactions section
  Scenario: Axis Restricted Draggable Functionality
    Given User is in the Draggable Page
    When User performs axis drag
    Then The elements should be dragged to the particular axis