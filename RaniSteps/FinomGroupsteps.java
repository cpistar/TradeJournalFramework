package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FinomGrouppage;
import utilities.Driver;

public class FinomGroupsteps {
FinomGrouppage Fpage = new FinomGrouppage();
	
	@When("I click on Trade login button")
	public void i_click_on_trade_login_button() {
		Fpage.SigninBtn.click();
	}
	@When("I click on FinomGroup tab")
	public void i_click_on_finom_group_tab() {
	    Fpage.Finomtab.click();
	}
	

	@Then("I should be directed to Finom Group homepage {string}")
	public void i_should_be_directed_to_finom_group_homepage(String FinomGroupurl) {
		 Assert.assertEquals(FinomGroupurl, "https://www.finomgroup.com");
		 System.out.println(Driver.getDriver().getCurrentUrl());
	}

}
}
