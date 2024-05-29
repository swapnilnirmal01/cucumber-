
@tag
Feature: Test Login Functionality
  

  @LoginTest
  Scenario Outline: Check login is successful with valid credientials
    Given I open browser
    And User click on My Account link
    And User is on login page
    When User enter valid <username> and <password>
    And User click on login button
    Then User navigate to Home page
    
    Examples:
    
    | username |  password |
    | swapnilnirmal21@gmail.com | Swap@0989 |
    

