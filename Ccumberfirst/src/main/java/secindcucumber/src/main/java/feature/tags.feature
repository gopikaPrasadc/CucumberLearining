  
Feature: Tags


@smokeTest
Scenario: Verify valid login in demowebshop
Given loginpage enter
Then username entered
Then password entered
And user click on loginbutton

@InvalidTest @featureTest
Scenario: Verify invalid login in demowebshop with Invalid email and valid password
Given User navigated to login page of demowebshop for invalid login
Then please enter invalid email id
Then Please enter valid password
And user click on login button
    
@InvalidTest 
Scenario: Verify invalid login in demowebshop with valid email and invalid password
Given Launch to home page of demowebshop for another invalid login
Then I should enter valid email 
Then User entered invalid password
And User should click on login button 

@InvalidTest @featureTest
Scenario: Verify invalid login with blank email and password
Given please launch login page
Then I should enter blank email 
Then I should enter blank password
And click on login button 