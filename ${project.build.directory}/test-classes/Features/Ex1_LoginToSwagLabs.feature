Feature: Login functionality
  Background:
    Given user is on SwagLab login
  Scenario: TC1-Login with valid credentials

    When user enter username on swagLab login page "standard_user"
    And wait for 2 seconds
    And user enter password on swagLab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swagLab login page
    And wait for 3 seconds
    Then home page visible with logo text "Swag Labs"
    And wait for 2 seconds

  Scenario: TC2-Login with invalid credentials

    When user enter username on swagLab login page "abc"
    And wait for 2 seconds
    And user enter password on swagLab login page "xyz"
    And wait for 3 seconds
    And user click on login btn on swagLab login page
    And wait for 3 seconds
    Then user can see error messgae "Epic sadface: Username and password do not match any user in this service"


