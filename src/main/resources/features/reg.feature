@@firstTest
Feature: Registration Page

  Scenario: registration with valid data

    Given open the registration page
    When enter valid data
    And click registration button
    Then a success message is displayed
    And click log out

