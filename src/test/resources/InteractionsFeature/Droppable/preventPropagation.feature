Feature: Validation of Interactions section
  Scenario: Prevent Propagation Functionality
    Given User in the Droppable Page
    When User performs prevent propagation of drag and drop action
    Then The acceptable item should be dropped inside droppable location