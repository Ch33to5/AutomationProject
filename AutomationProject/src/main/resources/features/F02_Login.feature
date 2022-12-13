@smoke
Feature: Login functionality to use their accounts
  Background:
    Given user go to login page

  Scenario Outline: user login with valid email and pw
    And user login with valid <email>, <pw>
    And user press on login button
    Then user login to the system successfully
    Examples:
      | email            | pw      |
      | "ahmedsalah@gmail.com" | "P@ssw0rd" |


  Scenario Outline: user login with invalid email and pw
    And user login with invalid <invalidMail> and <invalidPW>
    And user press on login button
    Then user could not login to the system
    Examples:
      | invalidMail          | invalidPW        |
      | "invalidmail@gmail.com" | "invalidPW" |
