Feature: To validate the search of TestMeApp

  Scenario Outline: validate search
    Given user launches the application
    Then user clicks on SignIn link
    Then user enters username "<uname>"
    And user enetrs password "<pswrd>"
    Then Click on login button
    Then user searches for the item from search bar "<search>"

    Examples: 
      | uname  | pswrd  | search |
      | asdfgh | asdfgh | Head   |
