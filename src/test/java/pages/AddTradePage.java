package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AddTradePage {
	public AddTradePage(){
		PageFactory.initElements(Driver.getDriver(),this);
		
	}
	
	@FindBy(id="username")
	public WebElement Username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(css=".btn-lg ")
	public WebElement loginbtn;
	
/*	@FindBy(css=".btn-primary")
	public WebElement addTrade;*/
	
	@FindBy(css=".h4")
	public WebElement heading;
	
	@FindBy(id="longTrade")
	public WebElement dropDownbtn;
	
	@FindBy(xpath="//option[text()='Sell to Open']")
	public WebElement sto;
	
	@FindBy(xpath="//option[text()='Buy to Open']")
	public WebElement bto;
	
	@FindBy(id="symbol")
	public WebElement Symbol;
	
	@FindBy(id="openDate")
	public WebElement OpenDate;
	
	@FindBy(id="entry")
	public WebElement Entry;
	
	@FindBy(id="closeDate")
	public WebElement CloseDate;
	
	@FindBy(id="exit")
	public WebElement Exit;
	
	@FindBy(css = ".btn-info")
	public WebElement saveButton;
	
	/*@FindBy (xpath = "//td[contains(text(),'$175.21')]")
	public WebElement savedInDB;*/
	

}

