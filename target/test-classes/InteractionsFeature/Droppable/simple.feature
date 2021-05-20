Feature: Validation of Interactions section
  Scenario: Simple droppable Functionality
    Given User is in Droppable Page
    When User performs simple drag and drop action
    Then The dragged item should be dropped inside desired location