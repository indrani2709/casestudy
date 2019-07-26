Feature: To validate to proceed without product

@Smoke
  Scenario Outline: To proceed to checkout without any items in cart
    Given user launches the app
    When user clicks on sign in
    Then user enter username "<uname>"
    And user enters password "<pwrd>"
    And user clicks on login
    Then user clicks on cart and proceeds to check out

    Examples: 
      | uname  | pwrd   |
      | asdfgh | asdfgh |
