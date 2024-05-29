  As a user
  I want to perform arithmetic operations
  So that I can calculate results

  Scenario: Addition
    Given I have entered {int} into the calculator
    And I have entered {int} into the calculator
    When I press add
    Then the result should be {int} on the screen