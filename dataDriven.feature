
Feature: Login functionality in demotours
  
  
  Scenario Outline:Login
  Given need to navigate the app
  When user need to enter< username>
  Then user need to enter<password>
  Then user need to login successfully
  
  Examples:
| username  | password  | 
| gopika    | 12345     | 
| Arun      | arun234   |
  
  
 