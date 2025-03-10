
Feature: User Purchase View

  Scenario: Validate user is able to view purchase is successfully happen
    Given User is logged in and on the product page
    When User adds the product to the cart, makes the payment and completes the purchase
    Then User should be able to view that the order has been completed successfully