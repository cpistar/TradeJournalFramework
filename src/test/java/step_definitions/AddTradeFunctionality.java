package step_definitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddTradePage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.PropertiesReader;

public class AddTradeFunctionality {
	AddTradePage addtrade = new AddTradePage();
	BrowserUtils utils = new BrowserUtils();

	String stockSymbol;

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		Driver.getDriver().get(PropertiesReader.getProperty("TJUrl"));
	}

	@Given("I enter the {string} into username box and {string} password box")
	public void i_enter_the_vaild_user_name_and_password(String username, String password) {
		addtrade.Username.sendKeys(username);
		addtrade.Password.sendKeys(password);

	}

	@Then("I click the login button")
	public void i_click_the_login_button() {
		addtrade.loginbtn.click();
	}

	@Then("the {string} heading should be displayed")
	public void the_heading_should_be_displayed(String string) {
		Assert.assertTrue(addtrade.heading.isDisplayed());
	}

	@When("I click the drow down box")
	public void i_click_the_drow_down_box() {
		addtrade.dropDownbtn.click();
	}

	@Then("sell to open should be selected by default")
	public void sell_to_open_should_be_selected_by_default() {
		Assert.assertTrue(addtrade.sto.isDisplayed());
	}

	@Then("by to open should be displayed")
	public void by_to_open_should_be_displayed() {
		Assert.assertTrue(addtrade.bto.isDisplayed());

	}

	@Then("symbol textbox should accept a string {int} characters in length")
	public void symbol_textbox_should_accept_a_string_characters_in_length(Integer expaectedText) {
		String actualText = addtrade.Symbol.getText();
		Assert.assertTrue(actualText.length() <= 10);

	}

	@Then("I enter {string} to open date picker")
	public void i_enter_to_open_date_picker(String date) {
		utils.clearValueOnTheField(addtrade.OpenDate);
		addtrade.OpenDate.sendKeys(date);

	}

	@Then("I enter a floating point {double} number in the entry price box")
	public void entry_price_textbox_should_take_number_value_that_is_a_double(Double entryPrice) {
		addtrade.Entry.sendKeys(String.valueOf(entryPrice));
	}

	@Then("I enter {string} to close date picker")
	public void i_enter_to_close_date_picker(String date) {
		utils.clearValueOnTheField(addtrade.OpenDate);
		addtrade.CloseDate.sendKeys(date);
	}

	@Then("I enter a floating point {double} number in the exit price box")
	public void exit_price_textbox_should_take_number_value_that_is_a_double(Double exitPrice) {
		addtrade.Exit.sendKeys(String.valueOf(exitPrice));

	}

//vaild tests start

	@When("I click the By  to Open")
	public void i_click_the_by_to_open() {
		addtrade.bto.click();
	}

	@Then("I enter {string} to then symbol textbox")
	public void i_enter_to_then_symbol_textbox(String validStockName) {
		stockSymbol = validStockName;
		addtrade.Symbol.sendKeys(validStockName);
	}

	@When("I enter a valid date {string} to open date picker")
	public void i_enter_a_valid_date_to_open_date_picker(String validDate) {
		utils.clearValueOnTheField(addtrade.OpenDate);
		addtrade.OpenDate.sendKeys(validDate);
	}

	@When("I enter a valid {double} number in the entry price box")
	public void i_enter_a_valid_number_in_the_entry_price_box(Double validEntryPrice) {
		addtrade.Entry.sendKeys(String.valueOf(validEntryPrice));
	}

	@Then("I enter a valid date{string} to close date picker")
	public void i_enter_a_valid_date_to_close_date_picker(String validDate) {
		utils.clearValueOnTheField(addtrade.CloseDate);
		addtrade.CloseDate.sendKeys(validDate);
	}

	@Then("I enter avalid {double} number in the exit price box")
	public void i_enter_avalid_number_in_the_exit_price_box(Double validClosePrice) {
		addtrade.Exit.sendKeys(String.valueOf(validClosePrice));
	}

	@Then("I click the Save button")
	public void i_click_the_save_button() {
		addtrade.saveButton.click();
	}

	@Then("The trade is displayed on the trade table")
	public void the_trade_is_displayed_on_the_trade_table() {
		Assert.assertTrue(addtrade.addTrade.isDisplayed());

		for (WebElement singleSymbol : addtrade.stockSymbols) {
			if (singleSymbol.getText().equals(singleSymbol))
				Assert.assertEquals(singleSymbol.getText(), stockSymbol);

		}

	}
//Valid tests end

//Invalid tests start
	@When("I click the Sell  to Open")
	public void i_click_the_sell_to_open() {
		addtrade.sto.click();
	}

	@Then("I enter an emty space {string} to then symbol textbox")
	public void i_enter_an_emty_space_to_then_symbol_textbox(String invalidSymbol) {
		addtrade.Symbol.sendKeys(invalidSymbol);

	}

	@When("I enter a  date {string} to open date picker")
	public void i_enter_a_date_to_open_date_picker(String openDate) {
		addtrade.OpenDate.sendKeys(openDate);

	}

	@When("I enter a  {string}  in the entry price box")
	public void i_enter_a_in_the_entry_price_box(String entryPrice) {
		addtrade.Entry.sendKeys(entryPrice);
	}

	@Then("I enter a  date {string} to close date picker")
	public void i_enter_a_date_to_close_date_picker(String closeDate) {
		addtrade.CloseDate.sendKeys(closeDate);
	}

	@Then("I enter {string}  number in the exit price box")
	public void i_enter_number_in_the_exit_price_box(String exitPrice) {
		addtrade.Exit.sendKeys(exitPrice);
		;
	}

	@Then("I click the stock save button")
	public void i_click_the_stock_save_button() {
		addtrade.saveButton.click();
	}

	@Then("The error message {string} shows up")
	public void the_error_message_shows_up(String errorMessage) {

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		boolean isValidInput = (Boolean) js.executeScript("return arguments[0].required;", addtrade.Symbol);
		System.out.println(isValidInput);
		String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", addtrade.Symbol);
		System.out.println(validationMessage);
		
		if(isValidInput){
			
		}
		/*
		 * String validationMessage = addtrade.error.getAttribute("validationMessage");
		 * boolean required =
		 * Boolean.parseBoolean(addtrade.error.getAttribute("required"));
		 */
		Assert.assertEquals(errorMessage, validationMessage);
		// To Do
	}

	// Back to transaction functionality test #Starts

	@When("I click on the Back to Transaction button")
	public void i_click_on_the_back_to_transaction_button() {
		addtrade.backtoHomePageBtm.click();
	}

	@Then("I should be directed to the Home Page")
	public void i_should_be_directed_to_the_home_page() {
		Assert.assertTrue(addtrade.homepage.isDisplayed());
	}

	@Then("I should see the following data entered in the table")
	public void i_should_see_the_following_data_entered_in_the_table(DataTable dataTable) {
		List<String> tradeHeader = dataTable.transpose().asList();

		String ActualAction = tradeHeader.get(0);
		String ActualSymbol = tradeHeader.get(1);
		String ActualOpenDate = tradeHeader.get(2);
		String AcyualEtry = tradeHeader.get(3);
		String ActualCloseDate = tradeHeader.get(4);
		String ActualExit = tradeHeader.get(5);
		String ActualGainLose = tradeHeader.get(6);

		Assert.assertEquals(ActualAction, addtrade.action.getText());
		Assert.assertEquals(ActualSymbol, addtrade.symbol.getText());
		Assert.assertEquals(ActualOpenDate, addtrade.opendate.getText());
		Assert.assertEquals(AcyualEtry, addtrade.entry.getText());
		Assert.assertEquals(ActualCloseDate, addtrade.closedate.getText());
		Assert.assertEquals(ActualExit, addtrade.exit.getText());
		Assert.assertEquals(ActualGainLose, addtrade.gainLose.getText());

	}

	@Then("I should see the Action Column with following button")
	public void i_should_see_the_action_column_with_following_button(DataTable dataTable) {
		List<String> updateDelete = dataTable.transpose().asList();
		String Update = updateDelete.get(0);
		String Delete = updateDelete.get(1);

		Assert.assertEquals(Update, addtrade.updatebtn.getText());
		Assert.assertEquals(Delete, addtrade.deletebtn.getText());

	}

}
