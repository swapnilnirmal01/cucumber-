Feature: User login
  Resisterd user should be able to access account details 

  @Login @validcredentials
  Scenario: Login with valid credentials
    Given User navigates to Login Page
    And check for landing on login page or not 
    When User enter valid username
    And Enter valid Password 
    And click on login button
    Then User should login successfully
    

  
  Scenario: Login with invalid credentials
    Given User Navigates to Login Page
    When User enter invalid username
    And User enter invalid password 
    And click on Login button
    
    Scenario: Login with valid Username and Invalid password
    Given User Navigate to Login Page 
    When User enter valid username
    And User enter invalid password
    And click on Login button 
    Then User should get proper warning message
    
    @validcredentials
    Scenario: Login with invalid username and valid password
    Given User navigate to Login page
    When User enter invalid username
    And User enter valid password
    And User click on Login Button
    Then User get Proper warning message 
