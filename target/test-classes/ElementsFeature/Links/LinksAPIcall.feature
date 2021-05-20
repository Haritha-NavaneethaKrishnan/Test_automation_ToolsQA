Feature: Validation of Links that send api call under Elements Section
  Scenario: Links that send api call
    Given User in Links Page
    When User clicks on any option under Links will send api call
    Then The status for the particular option should be displayed