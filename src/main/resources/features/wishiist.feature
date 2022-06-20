@smoke
Feature: F10_Wishlist user could add product to Wishlist

  Scenario: user could add product to Wishlist
    Given user navigates to login page
    When user can login with valid email and valid password
    And  selects his favorite product
    When  adds a product to the Wishlist

