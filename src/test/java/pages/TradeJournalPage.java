package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalPage {
	public TradeJournalPage(){
		
		 PageFactory.initElements(Driver.getDriver(), this);
	}
		@FindBy (id = "username")
		public WebElement username;
		
		@FindBy (id = "password")
		public WebElement password;
	
		
		@FindBy (css = ".btn-primary")
		public WebElement signInBtn;
		
		@FindBy (xpath = "//img[contains(@src, '.png')]")
		public WebElement tradeIconImage;
		
		@FindBy (xpath = "//a[contains(text(), 'Add trade')]")
		public WebElement addTradeBtn;
		
		@FindBy (css = ".alert")
		public WebElement errorMessage;
		
		@FindBy (xpath = "//h2[contains(text(), 'Are you')]")
		public WebElement promptMessage;
	
		@FindBy (xpath = "//button[text()='Logout']")
		public WebElement logoutBtn;
		
		@FindBy (css = ".alert")
		public WebElement successMessage;
		
		@FindBy (xpath = "//button[text()='Log Out']")
		public WebElement logOutButton;
		
		@FindBy (name = "symbol")
		public WebElement symbolField;
		
		@FindBy (name = "date")
		public WebElement dateField;
		
		@FindBy (xpath = "//button[text()='Search']")
		public WebElement searchlBtn;
		
		@FindBy (css = "//a[contains(@href, 'Update')]")
		public WebElement updateBtn;
		
		@FindBy (xpath="//td[text()='AMZNAPPL']")
		public WebElement actualSymbolResult;
		
		@FindBy (xpath="//td[text()='2022-10-22']")
		public WebElement actualDateResult;
		
		@FindBy (xpath="//tr")
		public List <WebElement> ListOfAllRows;
		
		@FindBy (id = "username")
		public WebElement invalidUsername;
		
		@FindBy (id = "password")
		public WebElement invalidPassword;

		
}