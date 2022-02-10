
Feature: Create Add a Trade Funcationality
  I want to be able to navigate to the Save Trade page with click the Add a Trade button
  I want to be able to add a trade with valid Save Functionality
  I should not be able to add a trade with invalid Save Funcationality
  I want to be able to back to the Home Page with Back to Transaction Functionality

  @AddTradeFieldsValidTest
  Scenario: User should be direct to the Save Trade page
  Given I am on the login page
  And  I enter the "gulpari" into username box and "SuperGulpari123!" password box
  Then I click the login button
    Then the "save trade" heading should be displayed
    When I click the drow down box 
    Then sell to open should be selected by default
    And by to open should be displayed
    Then symbol textbox should accept a string 10 characters in length
    When I enter "09/24/2027" to open date picker
    And I enter a floating point 123.01 number in the entry price box
    Then I enter "09/29/2027" to close date picker
    And  I enter a floating point 125.15 number in the exit price box
   


