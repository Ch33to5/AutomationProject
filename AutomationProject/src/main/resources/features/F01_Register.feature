@smoke
Feature: Register with new account

  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    And user select gender type
    And user enter first name <firstName> and last name <lastName>
    And user enter date of birth "<bdDD>" and "<bdMM>" and "<bdYY>"
    And user enter email <email> field
    And user fills Password fields <pass1> <pass2>
    And user clicks on register button
    Then success message is displayed
    Examples:
      | firstName    | lastName    | email                 | pass1      | pass2      |bdDD|bdMM|bdYY|
      | "Ahmed" | "Salah" | "ahmedsalah@gmail.com" | "P@ssw0rd" | "P@ssw0rd" |10|11|1988|



