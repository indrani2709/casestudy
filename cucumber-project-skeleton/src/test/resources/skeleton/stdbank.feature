Feature: My Standard Chartered Bank Account

Background: Launching of the bank loading page
Given Indu is done with browser configuration
Then she launches the application in chrome browser

Scenario: Sign In for indu
Given user clicks on sign in link
Then user enters valid cred
And user clicks on submit button

Scenario: Sign In for the guest user
Given Guest user clicks on sign in link
When user provides all the mandatory data
Then user clicks on submit button and id is generated

Scenario: Indu wants to reset the password
Given user clicks on forgot password link
Then user enters the mobile number
And user receives otp and provides the same

