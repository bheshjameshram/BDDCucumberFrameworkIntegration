Feature: products order End to End feature

  Background:
    Given user is on SwagLab login
    When user enter username on swagLab login page "standard_user"
   And wait for 2 seconds
    And user enter password on swagLab login page "secret_sauce"
    And wait for 3 seconds
   And user click on login btn on swagLab login page
   And wait for 3 seconds

  Scenario: S6-order place E2E
    And user click on Add to cart option for product SwagLabsBackpack
    And user click on cart option
    And user click on checkout button
    And user enter firstname as "abc"
    And user enter lastname as "xyz"
    And user enter pin code as 123456
    And user click on continue button
    And user click on finish button
    Then order place message "Thank you for your order!" should be visible


