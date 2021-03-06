package step_definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TradeJournalPage;
import utilities.BrowsersUtils;
import utilities.DBUtils;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeJournalSteps {
	
	TradeJournalPage tradePage = new TradeJournalPage();
	BrowsersUtils utils = new BrowsersUtils();
	DBUtils dbUtils = new DBUtils();

	String stockSymbol;
	String stockEntryPrice;
	String buyOrsell;
	String username;
	String password;
	String confirmBtn;
	List<String> addTradeData;	
	

	@Given("I am on the Trade Journal log in page")
	public void i_am_on_the_trade_journal_log_in_page() {
       Driver.getDriver().get(PropertiesReader.getProperty("TradeJournalUrl"));
       Assert.assertTrue(tradePage.pleaseSignInText.isDisplayed());
	}

	@When("I enter valid username {string} password {string}")
	public void i_enter_valid_username_password(String username, String password) {
         tradePage.username.sendKeys(username);
         tradePage.password.sendKeys(password);
	}

	@When("I click on Trade login button")
	public void i_click_on_trade_login_button() {
	     tradePage.signInBtn.click();
	}

	@Then("I should be on Trade homepage")
	public void i_should_be_on_trade_homepage() {
        Assert.assertTrue(tradePage.addTradeBtn.isDisplayed());
	}

	@When("I click on update Trade button")
	public void i_click_on_update_trade_button() {
		tradePage.updateBtn.click();        
	}

	@Then("I should be on Save Trade page")
	public void i_should_be_on_save_trade_page() {
		Assert.assertTrue(tradePage.saveTradeText.isDisplayed());
	}

	@When("I select symbol {string}")
	public void i_select_symbol(String United) {
	    tradePage.stockSymbol.isDisplayed();
	    tradePage.stockSymbol.clear();
	}
	
	@When("I select {string} and I enter symbol {string} entryDate {string} entryPrice {string} exitDate {string} exitPrice {string}")
	public void i_select_and_i_enter_symbol_entry_date_entry_price_exit_date_exit_price(String buyOrsell, String symbol, String entryDate, String entryPrice, String exitDate, String exitPrice) {
		stockSymbol = symbol;
		stockEntryPrice = entryPrice;
		// select from the dropdown
		utils.selectByVisibleText(tradePage.buyOrSellDropdown, buyOrsell);

		tradePage.stockSymbol.sendKeys(symbol);
		tradePage.openDate.sendKeys(entryDate);
		tradePage.stockEntryPrice.sendKeys(entryPrice);
		tradePage.closeDate.sendKeys(exitDate);
		tradePage.stockExitPrice.sendKeys(exitPrice);
	}

	@When("I click Save button")
	public void i_click_save_button() {
		tradePage.saveBtn.click();
	}

	@Then("The trade is displayed on the trade table")
	public void the_trade_is_displayed_on_the_trade_table() {
		Assert.assertTrue(tradePage.addTradeBtn.isDisplayed());

		for (WebElement singleSymbol : tradePage.stockSymbols) {
			if (singleSymbol.getText().equals(stockSymbol)) {
				Assert.assertEquals(singleSymbol.getText(), stockSymbol);
	}

}
	}
	
	// Delete a trade

	@When("I click on delete Trade button")
	public void i_click_on_delete_trade_button() {
         tradePage.deleteBtn.click();
	}

	@Then("a alert message {string} will appear")
	public void a_alert_message_will_appear(String alertMessage) {
       Assert.assertTrue(tradePage.alertMessage.isDisplayed());
	}

	@Then("I click on {string} button")
	public void i_click_on_button(String confirmbtn) {
		try {
			((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click()",  tradePage.deleteBtn);
			Alert confirmationAlert = Driver.getDriver().switchTo().alert();
			  String alertText = confirmationAlert.getText();
			  System.out.println("Alert text is " + alertText);
			  confirmationAlert.accept();
			  Assert.assertEquals(confirmBtn, alertText);
			BrowsersUtils wait = null;
			wait.alertAccept();}catch(UnhandledAlertException e) {
				e.printStackTrace();
			}
	}

	@Then("The Trade will disappear from the trade table")
	public void the_trade_will_disappear_from_the_trade_table() {
	   Assert.assertTrue(tradePage.deleteBtn.isDisplayed());
   	}

	
}
