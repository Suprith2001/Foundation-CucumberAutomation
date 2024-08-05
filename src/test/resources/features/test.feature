Feature: login feature

  Scenario: verify user is able to login successfully

    Given user is on website
    When user enter username "standard_user" and password "secret_sauce"
    And click on login button
    Then verify user is on home page