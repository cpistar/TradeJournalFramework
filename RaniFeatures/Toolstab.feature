Feature: Using Stock Trade Tracking application.

  Background: 
    Given I am on the Trade App log in page
    When I enter username "Rani" password "SuperRani123!"
    And I click on Trade login button
    Then I should be on Trade homepage

  @TradeAppToolstab @Smoketests @Regression
  Scenario: As a user after I login to Stock Trading application succesfully
    I should be able to see following lists from dropdown

    When I click "Tools dropdown tab"
    Then I should see following lists from dropdown
      | Options Calculator          |
      | Todays Market Info          |
      | Vol ETF/ETN Price Converter |
    When I click "Options Calculator tab"
    Then I should be directed to Options calculator home page "https://www.optionseducation.org/toolsoptionquotes/optionscalculator"
    When I click "Todays Market Info tab"
    Then I should be directed to Todays Market Info home page "https://finviz.com"
    When I click "Vol ETF/ETN Price Converter tab"
    Then I should be directed to new page of "Vol ETF/ETN Price Converter"