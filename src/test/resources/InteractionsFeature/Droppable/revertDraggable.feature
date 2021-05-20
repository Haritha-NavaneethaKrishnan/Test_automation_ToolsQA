Feature: Validation of Interactions section
  Scenario: Revert Draggable Functionality
    Given User in Droppable Page
    When User performs revert drag action
    Then The revertable item is reverted back
    And Non-revertable item is dropped