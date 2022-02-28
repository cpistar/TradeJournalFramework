
Feature: Using Stock Trade Tracking application.

 Background: 
    Given I am on the Trade App log in page
    When I enter username "Rani" password "SuperRani123!"
    And I click on "Trade login button"
    Then I should be on Trade homepage

@SlackChanneltab @SmokeTests @Regression
Scenario: As a user after I login to Stock Trading application successfully.
    I should see the Slack channel headers in home page.  
         
   
   When I click on Slackchannel tab
   Then I should be directed to Slack channel homepage "https://primetech-sdet-batch1.slack.com"   
   Then I should be directed to the default slack page If I am not logged in.