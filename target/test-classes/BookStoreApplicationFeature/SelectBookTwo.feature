Feature: Selection of Books from BookStore
  Scenario Outline: Selection of Second Book
    Given User is in BookStore after selection of First Book
    And User enters the second book name <bookname> in search field
    And User clicks on the second wanted book
    And User clicks on the add to your collection button
    When User clicks on  Back To Store Button
    Then User selected book should be found in the Profile Page
    Examples:
      |bookname|
      |"Speaking JavaScript"|