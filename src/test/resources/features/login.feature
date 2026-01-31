Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters invalid username or password
    Then an error message should be displayed indicating invalid credentials

  Scenario: Login attempt with empty fields
    Given the user is on the login page
    When the user leaves the username and password fields empty
    Then an error message should be displayed indicating required fields
