package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SlackChannelpage;
import utilities.Driver;

public class SlackChannelsteps {

SlackChannelpage Spage = new SlackChannelpage();
	
	@When("I click on Slackchannel tab")
	public void i_click_on_slackchannel_tab() {
		Assert.assertTrue(Spage.slacktab.isDisplayed());
		Spage.slacktab.click();
	    
	}

	@Then("I should be directed to Slack channel homepage {string}")
	public void i_should_be_directed_to_slack_channel_homepage(String slackurl) {
	    Assert.assertEquals(slackurl, "https://primetech-sdet-batch1.slack.com");
		System.out.println("Slackchannel Homepage:"+ Driver.getDriver().getCurrentUrl());
		
	}
	

	@Then("I should be directed to the default slack page If I am not logged in.")
	public void i_should_be_directed_to_the_default_slack_page_if_i_am_not_logged_in() {
		String slackcurrenturl = Driver.getDriver().getCurrentUrl();
		
		System.out.println("I'm on the slackchannel page "+ slackcurrenturl);
	}
	    
	}
