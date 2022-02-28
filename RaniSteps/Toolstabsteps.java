package step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Toolstabpage;

public class Toolstabsteps {
	Toolstabpage Toolspage = new Toolstabpage();
	WebDriver driver;
	
	
	
	@When("I click {string}")
	public void i_click(String Toolstab) {
		Assert.assertTrue(Toolspage.toolstab.isDisplayed());
		Toolspage.toolstab.click();
	}

	@Then("I should see following lists from dropdown")
	public void i_should_see_following_lists_from_dropdown(DataTable dataTable) {
		List<List<String>> obj = dataTable.asLists();
	    for(List<String> list : obj) {
	    	System.out.println(list);
	    }
	}

	@Then("I should be directed to Options calculator home page {string}")
	public void i_should_be_directed_to_options_calculator_home_page(String OptionsCalculatorurl) {
		Assert.assertEquals(OptionsCalculatorurl,"https://www.optionseducation.org/toolsoptionquotes/optionscalculator");
	    System.out.println(OptionsCalculatorurl);
	    
	}

	@Then("I should be directed to Todays Market Info home page {string}")
	public void i_should_be_directed_to_todays_market_info_home_page(String TodaysMarketInfourl) {
		Assert.assertEquals(TodaysMarketInfourl,"https://finviz.com");
	}

	@Then("I should be directed to new page of {string}")
	public void i_should_be_directed_to_new_page_of(String VolETFETNpriceconverter) {
		
		Assert.assertTrue(Toolspage.Volpriceconverter.isDisplayed());
		Toolspage.Volpriceconverter.click();
		String currenturl=driver.getCurrentUrl();		
			System.out.println("I'm still on the Trader app home page"+ currenturl);
		
	}
}
