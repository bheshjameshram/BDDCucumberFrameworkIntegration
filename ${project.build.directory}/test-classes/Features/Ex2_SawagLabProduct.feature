Feature: products feature

  Background:
    Given user is on SwagLab login
    When user enter username on swagLab login page "standard_user"
    And wait for 2 seconds
    And user enter password on swagLab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swagLab login page
    And wait for 3 seconds

   Scenario: S3-verify home page contains 6 products
    Then user can see 6 products on home page

   Scenario: S4-verify price of specific product
    Then price of the SauceLabBackPack product should 29.99

   Scenario: S5-verify total price of all products
    Then total price of the products should 129.94

