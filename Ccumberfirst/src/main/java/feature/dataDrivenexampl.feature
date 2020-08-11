Feature:Login
  Scenario Outline: demoTours login validation
    Given launch Application
    When input "<username>"
    Then enter "<password>"
    When click button
  
    
    Examples:
    
|username||password|
|tutorial||tutorial| 
|gopika  ||123     |