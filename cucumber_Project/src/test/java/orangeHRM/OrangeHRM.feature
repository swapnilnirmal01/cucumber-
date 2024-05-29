@OrangeHRM
Feature: I want to test the login functionality of HRM
  

  @LoginHRM
  Scenario:login senario for HRM
    Given I navigates to HRM
    And I enter correct username and password
    When I click on submit button
    Then I logged out from HRM
    

  @LogoutHRM
  Scenario Outline: Logout scenario for OrangeHRM
    Given I navigate to HRM
    And I enter correct username and password
    When I click on submit button
    Then I am on inside the home page
    And I validate the logout link 
