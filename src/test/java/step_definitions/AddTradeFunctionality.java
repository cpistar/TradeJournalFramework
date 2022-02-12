package step_definitions;

import org.junit.Assert;

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
		Assert.assertTrue(actualText.length()<=10);
	    
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
	public void exit_price_textbox_should_take_number_value_that_is_a_double(Double exitPrice){
		addtrade.Exit.sendKeys(String.valueOf(exitPrice));
	   
	}
	

//vaild tests start
	
	@When("I click the By  to Open")
	public void i_click_the_by_to_open() {
	   addtrade.bto.click();
	}
	@Then("I enter {string} to then symbol textbox")
	public void i_enter_to_then_symbol_textbox(String validStockName) {
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
//Valid tests end
}

