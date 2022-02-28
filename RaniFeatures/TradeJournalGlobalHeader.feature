@Regression
Feature: Using Stock Trade Tracking application.

  Background: 
    Given I am on the Trade App log in page
    When I enter username "Rani" password "SuperRani123!"
    And I click on "Trade login button"
    Then I should be on Trade homepage

  @TradeJournalGlobalHeader @SmokeTests
  Scenario: As a user after I login to Stock Trading application succesfully
    And I should see the following Global headers in home page.
      | application logo |
      | Home             |
      | Finom Group      |
      | Slack Channel    |
      | Tools            |
      | Symbol           |
      | mm/dd/yyyy       |
      | Search           |
      | Logout           |
      | Add trade        |
      | Action           |
      | Symbol           |
      | Open date        |
      | Entry            |
      | Close date       |
      | Exit             |
      | Gain/Loss        |
      | Action           |