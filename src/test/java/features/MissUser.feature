
Feature: Miss User View

  Scenario: Validate user is able to view miss user after try Login
    Given User navigates to the Login page
    When User enter information for a non-user account
    Then User should be able to view the miss user warning massage