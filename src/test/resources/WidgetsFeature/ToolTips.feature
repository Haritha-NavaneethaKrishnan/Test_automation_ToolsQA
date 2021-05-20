Feature: Validation of Widgets Section
  Scenario: Tool Tips functionality
    Given User is in Tool Tips Page
    When User hovers over the element
    Then User should see the hover message
