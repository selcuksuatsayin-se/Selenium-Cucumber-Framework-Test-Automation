
Feature: LoggedOut User View

  Scenario: Validate user is able to view after Log out
    Given User is logged in and on the product page
    When User click on Logout button
    Then User should be able to view Log in page