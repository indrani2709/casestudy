Feature: Testme Parameteisation
  I want to use this template for my feature file

  Scenario Outline: Testme login for multiple users
    Given I am launching testme application in chrome
    And I click on sign in link
    When I provide username "<Uname>"
    And I provide password "<Pwrd>"
    Then I click on login and verify login status

    Examples: 
      | Uname     | Pwrd        |
      | lalitha   | Password123 |
      | modedemo  | demo123     |
      | modedemo1 | demo123     |
      | asdfgh    | asdfgh      |
