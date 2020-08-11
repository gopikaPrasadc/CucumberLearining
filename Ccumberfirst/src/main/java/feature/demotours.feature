Feature: 

  Scenario: Mapss Login
    Given naviagte homepage
    Then clik reg
    When select gender
    Then enter your personal details
    
    |name  |lastname|mail id              |password|confirmpass|
    |gopika|prasad  |gopikacek14@gmail.com|adhil   |adhil      |
    Then I should click on Register button
    Then I should close browser
