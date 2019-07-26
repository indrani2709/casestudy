Feature: Validations for registering in Testme APP

  Scenario Outline: To register to TestmeApp
    Given Launch the app
    When User clicks on SignUp link
    Then User enters username "<Uname>"
    And user enters Firstname "<fname>"
    And user enters lastname "<lname>"
    And enters password "<Pwrd>"
    And enters Confirmpassword "<CPwrd>"
    And enters gender
    And enters E-Mail "<mail>"
    And enters Mobile Number "<MNo>"
    And enters DOB "<DOB>"
    And enters Address "<Address>"
    # And enters Security Question "<Sec>"
    And enters Answer "<Answer>"
    Then click on register

    Examples: 
      | Uname    | fname | lname | Pwrd    | CPwrd   | mail           | MNo        | DOB        | Address   | Answer |
      | demodemo | demof | demol | demo123 | demo123 | demo@gmail.com | 9876543210 | 17/07/2019 | Hyderabad | ASDFG  |
