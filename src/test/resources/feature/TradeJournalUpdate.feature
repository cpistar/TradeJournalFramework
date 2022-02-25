#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: As a user I am able to perform update a trade, delete a trade and save a trade functionalities.

  @TradeJournalUpdate
  Scenario: As a user, I want to update a trade
    Given I am on the Trade Journal log in page
    When I enter valid username "halida" password "SuperHalida123!"
    And I click on Trade login button
    Then I should be on Trade homepage
    When I click on update Trade button
    Then I should be on Save Trade page
    When I select symbol "United"
    And I enter symbol "ABC" and select entryDate "04/04/2021" entryPrice "10.0" exitDate "01/11/2022" exitPrice "18"
    And I click Save button
    Then The trade is displayed on the trade table

  @TradeJournalDelete
  Scenario: As a user, I want to delete a trade.
    Given I am on the Trade Journal log in page
    When I enter valid username "halida" password "SuperHalida123!"
    And I click on Trade login button
    Then I should be on Trade homepage
    When I click on delete Trade button
    Then a alert message "Are you sure you want to delete this record?" will appear
    And I click on "OK" button
    Then The Trade will disappear from the trade table
