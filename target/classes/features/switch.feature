@smoke
Feature: switch between currencies

  Scenario: Logged user could switch currency
    Given user navigates to login page
    When user can login with valid email and valid password



    Then user could login successfully
   When user selects a currency


