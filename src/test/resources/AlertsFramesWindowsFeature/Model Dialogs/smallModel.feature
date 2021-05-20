Feature: Validation of Modal Dialogs under Alerts , Frames and Windows
  Scenario: Small Modal Dialog Functionality
    Given User is in Modal Dialogs Page
    When User clicks on the small modal button
    Then User should see a small dialog box
