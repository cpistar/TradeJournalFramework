package step_definitions;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.TradeJournalGlobalHeaderspage;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeJournalGlobalHeadersteps {
	TradeJournalGlobalHeaderspage Tpage = new TradeJournalGlobalHeaderspage();

	@Given("I am on the Trade App log in page")
	public void i_am_on_the_trade_app_log_in_page() {
		Driver.getDriver().get(PropertiesReader.getProperty("Tradeappurl"));
		Assert.assertTrue(Tpage.SigninBtn.isDisplayed());
		System.out.println("TradeApp webURL: " + Driver.getDriver().getCurrentUrl());
	}

	@When("I enter username {string} password {string}")
	public void i_enter_username_password(String username, String password) {
		Tpage.username.sendKeys(username);
		Tpage.password.sendKeys(password);
	}

	@When("I click on {string}")
	public void i_click_on(String SigninBtn) {
		Tpage.SigninBtn.click();
	}

	@Then("I should be on Trade homepage")
	public void i_should_be_on_trade_homepage() {
		Assert.assertTrue(Tpage.Home.isDisplayed());
		System.out.println("TradeApp Home page is : "+ Driver.getDriver().getTitle());
	}

	@Then("I should see the following Global headers in home page.")
	public void i_should_see_the_following_global_headers_in_home_page(DataTable dataTable) {

		List<List<String>> headers = dataTable.asLists();

		for (List<String> a : headers) {
			System.out.println(a);

		}
	}

}
