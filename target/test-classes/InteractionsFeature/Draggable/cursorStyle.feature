Feature: Validation of Interactions section
  Scenario: Container Restricted Draggable Functionality
    Given User in Draggable Page
    When User performs cursor style drag
    Then The elements is dragged in cursor-style