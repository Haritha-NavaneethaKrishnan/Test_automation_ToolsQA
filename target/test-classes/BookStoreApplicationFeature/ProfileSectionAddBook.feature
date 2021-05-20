Feature: Profile section validation in Book Store Application
  Scenario: Add of book in Profile section
    Given User is in Book Store Page
    And User navigates to Profile page
    And User clicks on Go To Book Store button
    And User enters the third book name "Learning JavaScript Design Patterns" in search field
    And User clicks on the third wanted book
    And User clicks on add to your collection button
    And User clicks on Back to book store button
    When User navigates to the Profile Page
    Then User should be able to view the selected book in Profile Page

