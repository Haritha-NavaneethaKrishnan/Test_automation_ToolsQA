Feature: Validation of Interactions section
  Scenario: Accept droppable Functionality
    Given User is in the Droppable Page
    When User performs accept drag and drop action
    Then The acceptable item should be dropped inside desired location
