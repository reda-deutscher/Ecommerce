@smoke
Feature: user could select different Categories
  Scenario: Logged user could select random category then hover and open sub-Category




Given user navigates to login page
When user can login with valid email and valid password
    Given user select random category
    Then user should redirected to the page of the selected category