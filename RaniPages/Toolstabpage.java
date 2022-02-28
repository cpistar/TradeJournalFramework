package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
public class Toolstabpage {

	
public Toolstabpage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='navbarDropdown']")
	public WebElement toolstab;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	public WebElement dropdownmenu;
	
	@FindBy (xpath="//a[contains(text(),'Vol ETF/ETN Price Converter')]")
	public WebElement Volpriceconverter;
	
	
}

