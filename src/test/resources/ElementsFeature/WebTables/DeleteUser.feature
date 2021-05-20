Feature: Validation of Web Table in Elements Section
  Scenario: Delete user from Web Table
    Given User in the Web page Table
    When User clicks on the delete icon
    Then User deleted row should not be viewed in the Table