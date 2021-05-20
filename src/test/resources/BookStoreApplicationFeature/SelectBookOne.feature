Feature: Selection of Books from BookStore
  Scenario Outline: Selection of First Book
    Given User is in BookStore after successful Login
    And User enters the book name <bookname> in search field
    And User clicks on the first wanted book
    And User clicks on add to your collection button
    When User clicks on the Back To Store Button
    Then User selected book should be found in Profile Page
    Examples:
      |bookname|
      |"Git Pocket Guide"|
