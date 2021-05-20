Feature: Validation of Interactions section
  Scenario: Container Restricted Draggable Functionality
    Given User in the Draggable Page
    When User performs container restricted drag
    Then The elements should be dragged within the container