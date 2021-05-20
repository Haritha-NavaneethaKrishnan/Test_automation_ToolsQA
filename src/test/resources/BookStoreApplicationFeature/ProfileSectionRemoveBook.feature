Feature: Profile section validation in Book Store Application
  Scenario: Delete all Books in profile page
    Given User is in Profile page
    When User clicks on Delete All Books Button
    Then All the books in Book Store gets deleted