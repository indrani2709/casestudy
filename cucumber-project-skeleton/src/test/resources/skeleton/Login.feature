Feature: My Validations on Mercury tours

Scenario: Login for Registered user
Given application url is working
When user enters username
And user enters password
Then he clicks on submit button
And verifies the login process
Then He chose to close the application