Feature:Registration page


  Scenario: New Registration
    Given launch the registerpage
    And click on register
    When I should enter contact information
    |gopika|prasad|8281379231|gopikacek14@gmail.com|
    Then I should enter mailing information
    |addrress|city|kerala|vazhoor||686504|
    Then I should enter user information
    |gopika|adhil|adhil|
   Then register completed

