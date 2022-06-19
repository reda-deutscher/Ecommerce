@smoke
Feature: Follow Us
  Scenario: open  facebook

    Given user navigates to login page
    When user can login with valid email and valid password
    Then user could login successfully
    And user in home page
    Then user click icon link
    And user go to facebook
