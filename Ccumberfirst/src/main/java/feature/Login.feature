
Feature: Loginpage


  Scenario: Able to login
    Given go to app
    When with username
    Then enter password
    And user needs to login
    

  