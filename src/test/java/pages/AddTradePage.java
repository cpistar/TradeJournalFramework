package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AddTradePage {
	public AddTradePage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(id = "username")
	public WebElement Username;

	@FindBy(id = "password")
	public WebElement Password;

	@FindBy(css = ".btn-lg ")
	public WebElement loginbtn;

	/*
	 * @FindBy(css=".btn-primary") public WebElement addTrade;
	 */

	@FindBy(css = ".h4")
	public WebElement heading;

	@FindBy(id = "longTrade")
	public WebElement dropDownbtn;

	@FindBy(xpath = "//option[text()='Sell to Open']")
	public WebElement sto;

	@FindBy(xpath = "//option[text()='Buy to Open']")
	public WebElement bto;

	@FindBy(id = "symbol")
	public WebElement Symbol;
	@FindBy(name = "symbol")
	public WebElement error;

	@FindBy(id = "openDate")
	public WebElement OpenDate;

	@FindBy(id = "entry")
	public WebElement Entry;

	@FindBy(id = "closeDate")
	public WebElement CloseDate;

	@FindBy(id = "exit")
	public WebElement Exit;

	@FindBy(css = ".btn-info")
	public WebElement saveButton;

	@FindBy(xpath = "//a[contains(text(),\"Add trade\")]")
	public WebElement addTrade;

	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/tbody/tr/td[2]")
	public List<WebElement> stockSymbols;

	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/tbody/tr/td[3]")
	public List<WebElement> stockEntryPrices;

	@FindBy(xpath = "//a[contains(text(),'Back to Transactions')]")
	public WebElement backtoHomePageBtm;

	@FindBy(xpath = "//a[contains(text(),'Home ')]")
	public WebElement homepage;

	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[1]")
	public WebElement action;

	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[2]")
	public WebElement symbol;
	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[3]")
	public WebElement opendate;
	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[4]")
	public WebElement entry;
	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[5]")
	public WebElement closedate;
	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[6]")
	public WebElement exit;
	@FindBy(xpath = "//table[@class ='table table-bordered table-striped']/thead/tr/th[7]")
	public WebElement gainLose;

	@FindBy(xpath = "//a[@href='/records/showFormForUpdate?recordId=45713']")
	public WebElement updatebtn;

	@FindBy(xpath = "//a[@href='/records/delete?recordId=45713']")
	public WebElement deletebtn;

}
