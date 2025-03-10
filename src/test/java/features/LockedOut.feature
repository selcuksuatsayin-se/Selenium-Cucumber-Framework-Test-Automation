
Feature: Locked Out User View

  Scenario: Validate user is able to view locked out after try Login
    Given User navigates to the Login page
    When User successfully enters the locked out user log in details
    Then User should be able to view locked out warning massage