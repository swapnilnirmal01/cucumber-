

Feature: check login functinality
  

  @validCredentials
  Scenario: test valid login functionality
    Given user is on login page
    And user enter valid username 
    And user enter password
    When user click on login button 
    Then user navigate to home page
    
    @InvalidCredentials
  Scenario: test Invalid login functionality
    Given user is on login page
    And user enter Invalid username 
    And user enter invalid password
    When user click on login button 
    Then user get eeror message
    But user do not naviagte to home page

  

   
