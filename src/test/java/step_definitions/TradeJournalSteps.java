package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TradeJournalPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeJournalSteps {
	
	TradeJournalPage tradeJLP = new TradeJournalPage();

@Given("I am an external user on the login page of the trade application")
public void i_am_an_external_user_on_the_login_page_of_the_trade_application() {
	 Driver.getDriver().get(PropertiesReader.getProperty("tradeUrl"));
	 
}
@Given("I enter a valid username {string} and password {string}")
public void i_enter_a_valid_username_and_password(String username, String password) {
	tradeJLP.username.sendKeys(username);
	tradeJLP.password.sendKeys(password);
	
}


@When("I click on the sign in button")
public void i_click_on_the_sign_in_button() {
	tradeJLP.signInBtn.click();
   
}
@Then("I should be directed to the Home page of the Stock Trade Tracking application.")
public void i_should_be_directed_to_the_home_page_of_the_stock_trade_tracking_application() {
	 Assert.assertTrue(tradeJLP.tradeIconImage.isDisplayed());
	 Assert.assertTrue(tradeJLP.addTradeBtn.isDisplayed());
	//end of valid testing
}
//start of invalid testing


@Given("I am on the login page of the trade application")
public void i_am_on_the_login_page_of_the_trade_application() {
	 Driver.getDriver().get(PropertiesReader.getProperty("tradeUrl"));
}
@When("I enter an invalid username {string} and invalid password  {string}")
public void i_enter_an_invalid_username_and_invalid_password(String invalidUsername, String invalidPassword) {
	tradeJLP.username.sendKeys(invalidUsername);
	tradeJLP.password.sendKeys(invalidPassword);
}
@When("I click on the log in button")
public void i_click_on_the_log_in_button() {
	tradeJLP.signInBtn.click();
    
}
@Then("I should see the following error message displayed {string} displayed in Red.")
public void i_should_see_the_following_error_message_displayed_displayed_in_red(String errorMessage) {
	Assert.assertTrue(tradeJLP.errorMessage.isDisplayed());
	//end of invalid testing
}


//start of logout testing

@Given("I am logged in succesfully with username {string} and password {string}")
public void i_am_logged_in_succesfully_with_username_and_password(String username, String password) {
	 Driver.getDriver().get(PropertiesReader.getProperty("tradeUrl"));
		tradeJLP.username.sendKeys(username);
		tradeJLP.password.sendKeys(password);
		tradeJLP.signInBtn.click();
	 
}
	 
@Given("I am on the homepage")
public void i_am_on_the_homepage() {
	 Assert.assertTrue(tradeJLP.tradeIconImage.isDisplayed());
}


@When("I click on the Logout button")
public void i_click_on_the_logout_button() {
tradeJLP.logoutBtn.click();
    
}
@Then("I should be prompted to a new page with the following message: {string}")
public void i_should_be_prompted_to_a_new_page_with_the_following_message(String promptMessage) {
	Assert.assertTrue(tradeJLP.promptMessage.isDisplayed());
}
@Then("I click on the button")
public void i_click_on_the_button() {
	tradeJLP.logOutButton.click();
  
}
@Then("I should be directed to the LOGIN page with the following message: {string}")
public void i_should_be_directed_to_the_login_page_with_the_following_message(String successMessage) {
	Assert.assertTrue(tradeJLP.successMessage.isDisplayed());

    //end of logout testing
}

//Start of search 

@Given("I am logged in using username {string} and password {string}")
public void i_am_logged_in_using_username_and_password(String username, String password) {
	 Driver.getDriver().get(PropertiesReader.getProperty("tradeUrl"));
		tradeJLP.username.sendKeys(username);
		tradeJLP.password.sendKeys(password);
		tradeJLP.signInBtn.click();
}
@Given("I am on the Home Page")
public void i_am_on_the_home_page() {
	 Assert.assertTrue(tradeJLP.tradeIconImage.isDisplayed());
}

@When("I enter a value for symbol {string}")
public void i_enter_a_value_for_symbol(String symbol) {
	tradeJLP.symbolField.sendKeys(symbol);
}
@When("Or ￼I enter a value for date {string}")
public void or_i_enter_a_value_for_date(String date) {
	tradeJLP.dateField.sendKeys(date);
}
@When("I click on the Search button")
public void i_click_on_the_search_button() {
	 tradeJLP.searchlBtn.click();
}
@Then("The system should filter the existing list of trades associated with the symbol {string}")
public void the_system_should_filter_the_existing_list_of_trades_associated_with_the_symbol(String symbol) {
	Assert.assertEquals(symbol, tradeJLP.actualSymbolResult.getText());

}
@Then("Or date {string}")
public void or_date(String dateResult) {
	Assert.assertEquals(dateResult, tradeJLP.actualDateResult.getText());
	}

@When("I enter another value for symbol {string}")
public void i_enter_another_value_for_symbol(String ATM) {
	tradeJLP.symbolField.sendKeys(ATM);
}
@When("click the Search button")
public void click_the_search_button() {
	 tradeJLP.searchlBtn.click();
}



@When("No records are found the system should display an empty table")
public void no_records_are_found_the_system_should_display_an_empty_table() {
	Assert.assertSame(tradeJLP.updateBtn.isDisplayed(), false);
}



}