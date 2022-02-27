package pages;


import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalPage {

	public TradeJournalPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = ".form-signin-heading")
    public WebElement pleaseSignInText;
	public WebElement username;
	public WebElement password;
	
	@FindBy (css =".btn-primary")
	public WebElement signInBtn;
	
	@FindBy (xpath = "//a[@href='/records/showFormForAdd']")
	public WebElement addTradeBtn;
	
	@FindBy (xpath="//div[@class='alert alert-danger']")
	public WebElement errorMessage;
	
	@FindBy (xpath = "//a[contains(text(), 'Update')]")
	public WebElement updateBtn;
	
	@FindBy (xpath = "//p[contains(text(), 'Save Trade')]")
	public WebElement saveTradeText;
	
	@FindBy (id = "symbol")
	public WebElement stockSymbol;
	
    public WebElement openDate;
	
	@FindBy (id = "entry")
	public WebElement stockEntryPrice;
	
	public WebElement closeDate;
	
	@FindBy (id = "longTrade")
	public WebElement buyOrSellDropdown;
	
	@FindBy (id = "exit")
	public WebElement stockExitPrice;
	
	@FindBy (xpath = "//button[text()='Save']")
	public WebElement saveBtn;
	
	@FindBy (xpath = "//table[@class='table table-bordered table-striped']/tbody/tr/td[2]")
    public List<WebElement> stockSymbols;
	
	@FindBy (xpath = "//table[@class='table table-bordered table-striped']/tbody/tr/td[4]")
    public List<WebElement> stockEntryPrices;
	
	@FindBy (name = "symbol")
	public WebElement searchBox;
	
	@FindBy (xpath = "//button[text()='Search']")
	public WebElement searchBtn;
	
	//delete function
	@FindBy (xpath = "//a[contains(text(), 'Delete')]")
	public WebElement deleteBtn;
	
	@FindBy (xpath = "//a[@linkText='Are you sure you want to delete this record?']")
	public WebElement alertMessage;
	public WebElement confirmbtn;
	
	
}
