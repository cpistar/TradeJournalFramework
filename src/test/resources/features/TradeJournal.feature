Feature: Trade Journal Login and Logout
  I want to be able to login with valid credentials.
  I should not be able to login with invalid credentials.
  I should be able to logout with clicking logout button



 @TradeJournalLogin @SmokeTests @Regression
  Scenario: User should be directed to the Home page of the Stock Trade Tracking application
    Given I am an external user on the login page of the trade application
    And I enter a valid username "Cana" and password "SuperCana123!"
    When I click on the sign in button
    Then I should be directed to the Home page of the Stock Trade Tracking application.


  @TradeJournalInvalidLogin @SmokeTests @Regression
  Scenario Outline: User should not be able to login to trade account
   Given I am on the login page of the trade application
    When I enter an invalid username "canna" and invalid password  "password_invalid"
    And I click on the log in button
    Then I should see the following error message displayed "Bad credentials" displayed in Red.



  @TradeJournalLogout @SmokeTests @Regression
  Scenario: User should be able to logout successfully
  	Given I am logged in succesfully with username "Cana" and password "SuperCana123!"
  	And I am on the homepage
    When I click on the Logout button
    Then I should be prompted to a new page with the following message: "Are you sure you want to log out?"
    And I click on the button
    Then I should be directed to the LOGIN page with the following message: "You have been signed out"
    
    
  @TradeJournalSearch @SmokeTests @Regression
  Scenario Outline: User should be able to search by date and/or symbol
  	Given I am logged in using username "Cana" and password "SuperCana123!"
    And I am on the Home Page
    When I enter a value for symbol "AMZNAPPL"
    And Or ￼I enter a value for date "10/22/2021"
    When I click on the Search button
    Then The system should filter the existing list of trades associated with the symbol "AMZNAPPL"
    And Or date "2021-10-22"
    When I enter a value for symbol "ATM"
    And click the Search button
    Then No records are found the system should display an empty table
    
  
     
    