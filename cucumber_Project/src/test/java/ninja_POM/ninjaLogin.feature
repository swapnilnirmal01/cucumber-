
@ninjaLoginTest
Feature: user test to login functionality
  I want to use this template for my feature file

  @LoginNinja
  Scenario Outline: User test login page
    Given click on my account link
    And user click on login button to enter in login page
    And user enter on login page
    When user enter <username> and <password>
    And user click on login page to enter on home page
    Then validat the user on home page 
    

 

    Examples: 
      | username  | password |   
      | swapnilnirmal21@gmail.com | Swap@0989 |  
      
