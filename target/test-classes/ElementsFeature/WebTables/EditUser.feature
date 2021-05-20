Feature: Validation of Web Table in Elements Section
  Scenario: Edit user details in Web Table
    Given User is in the Web page Table
    And User clicks on the edit icon
    And User makes changes in any field
    When User clicks the submit button
    Then User updated changes should be visible in the table