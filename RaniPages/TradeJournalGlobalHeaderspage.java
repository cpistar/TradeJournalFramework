package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalGlobalHeaderspage {


	public TradeJournalGlobalHeaderspage() {	
	PageFactory.initElements(Driver.getDriver(), this);

}
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	public WebElement SigninBtn;
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(tagName="title")
	public WebElement homeTitle;
	
	@FindBy(css=".navbar-brand")
	public WebElement appLogo;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement Home;
	
	@FindBy(partialLinkText="Finom Group")
	public WebElement Finomgroup;
	
	@FindBy (partialLinkText="Slack Channel")
	public WebElement Slacktab;
	
	@FindBy (id="navbarDropdown")
	public WebElement toolsTab ;
	
	@FindBy (css=".form-control")
	public WebElement symbol;
	
	@FindBy (xpath="//input[@name='date']")
	public WebElement date;
	
	@FindBy (xpath="//button[contains(text(),'Search')]")
	public WebElement search;
	
	@FindBy (xpath="//button[contains(text(),'Logout')]")
	public WebElement logout;
	
	@FindBy(linkText="Add trade")
	public WebElement addtrade;
	
	
		
	}
		
