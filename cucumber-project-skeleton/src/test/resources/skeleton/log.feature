Feature: Validations for logging into testme app

  Scenario Outline: Log in the existing user
    Given launch the application
    When user clicks on signin
    Then user enters the username "<uname>"
    And user enters the password "<pwrd>"
    And user clicks on login button

    Examples: 
      | uname    | pwrd    |
      | demodemo | demo123 |
