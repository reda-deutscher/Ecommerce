@smoke
Feature: F10_Wishlist user could add product to Wishlist

  Scenario: user could add product to Wishlist
    Given user navigates to login page
    When user can login with valid email and valid password
    And  user selects his favorite product
    When  user adds a product to the Wishlist

