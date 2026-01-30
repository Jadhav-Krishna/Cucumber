Feature: User Login
    As a registered user
    I want to log in to the application
    So that I can access my account

    Scenario: Successful login with valid credentials
        Given the user is on the login page
        When the user enters valid username and password
        And clicks the login button
        Then the user should be redirected to the dashboard

    Scenario: Unsuccessful login with invalid credentials
        Given the user is on the login page
        When the user enters invalid username or password
        And clicks the login button
        Then an error message should be displayed indicating invalid credentials

    Scenario: Login attempt with empty fields
        Given the user is on the login page
        When the user leaves the username and password fields empty
        And clicks the login button
        Then an error message should be displayed indicating required fields