Feature: Validation of Modal Dialogs under Alerts , Frames and Windows
  Scenario: Large Modal Dialog Functionality
    Given User in Modal Dialogs Page
    When User clicks on the large modal button
    Then User should see a large dialog box
