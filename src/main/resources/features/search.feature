@smoke
Feature: search for any product on the website

  Scenario: Logged user could search by product name
    Given user navigates to login page
    And user can login with valid email and valid password
    When user clicks on search field
    And user searches with name of product
    Then user could find relative results