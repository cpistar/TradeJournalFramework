Feature: Create Add a Trade Funcationality
  I want to be able to navigate to the Save Trade page with click the Add a Trade button
  I want to be able to add a trade with valid Save Functionality
  I should not be able to add a trade with invalid Save Funcationality
  I want to be able to back to the Home Page with Back to Transaction Functionality

  Background: 
    Given I am on the login page
    And I enter the "gulpari" into username box and "SuperGulpari123!" password box
    Then I click the login button

  @AddTradeFields @Regression @SmokeTests 
  Scenario: User should be direct to the Save Trade page
    Then the "save trade" heading should be displayed
    When I click the drow down box
    Then sell to open should be selected by default
    And by to open should be displayed
    Then symbol textbox should accept a string 10 characters in length
    When I enter "09/24/2027" to open date picker
    And I enter a floating point 123.01 number in the entry price box
    Then I enter "09/29/2027" to close date picker
    And I enter a floating point 125.15 number in the exit price box

  @AddTradeFieldsValidTest @Regression @SmokeTests 
  Scenario: User should be direct to the Save Trade page
    When I click the drow down box
    And I click the By  to Open
    Then I enter "AAPL" to then symbol textbox
    When I enter a valid date "02/24/2022" to open date picker
    And I enter a valid 172.01 number in the entry price box
    Then I enter a valid date"02/25/2022" to close date picker
    And I enter avalid 175.15 number in the exit price box
    Then I click the Save button
    Then The trade is displayed on the trade table
    
    @AddTradeFieldsInvalidTest @Regression @SmokeTests 
    Scenario: User should be direct to the Save Trade page
    When I click the drow down box
    And I click the Sell  to Open
    Then I enter an emty space "" to then symbol textbox
    When I enter a  date "05/24/2019" to open date picker
    And I enter a  "abc"  in the entry price box
    Then I enter a  date "08/25/2020" to close date picker
    And I enter "175.15"  number in the exit price box
    Then I click the stock save button
    Then The error message "Please fill out this field." shows up
    
    @BackToTransactionFunctionality @Regression @SmokeTests 
    Scenario: User should be direct to the Save Trade page
    When I click on the Back to Transaction button
    Then I should be directed to the Home Page
    And I should see the following data entered in the table
    |Action|Symbol|Open date|Entry|Close date|Exit|Gain/Loss|
    And I should see the Action Column with following button
    |Update|Delete|
    
    
    
    
    
    
    
    
    
    
