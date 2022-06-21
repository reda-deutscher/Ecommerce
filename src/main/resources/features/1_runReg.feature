@smoke
Feature: Registration Page

  Scenario: registration with valid data

    Given open the registration page
    When enter valid data
    And click registration button
    Then message is displayed
    And  log out