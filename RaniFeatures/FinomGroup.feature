Feature: Using Stock Trade Tracking application.
Background:
   Given I am on the Trade App log in page
   When I enter username "Rani" password "SuperRani123!"
   And  I click on Trade login button
   Then I should be on Trade homepage 
@FinomGrouptab @SmokeTests @Regression
Scenario: As a user after I login to Stock Trading application successfully.
    I should see the Finom Group headers in home page.       
   
   When I click on FinomGroup tab
   Then I should be directed to Finom Group homepage "https://www.finomgroup.com"
