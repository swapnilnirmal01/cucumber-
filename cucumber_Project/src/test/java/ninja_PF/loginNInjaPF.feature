

Feature: test Login page
  

  
  Scenario Outline: test login functinality
    Given user is on login page
    And user click on my account button
    And user click on login button
    When user enter on login page
    And enter <username> and <password>
    And click on login button
    Then click on logout button
    And validate user is on login page


    Examples: 
      | username  | password | 
      | swapnilnirmal21@gmail.com |  Swap@0989 | 
      
