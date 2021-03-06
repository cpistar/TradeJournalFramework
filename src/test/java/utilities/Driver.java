package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class Driver {
	
	private static final String sauceURL = "https://https://oauth-halidan.tuerxun-0e197:17632475-f050-496d-8b45-7a26b6cd0518@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	private static WebDriver driver;
	public static WebDriver getDriver() {
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = PropertiesReader.getProperty("browser");
		}
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			switch (browser) {
			case "firefox":
				FirefoxDriverManager.firefoxdriver().setup();
				FirefoxBinary ffBiary = new FirefoxBinary();
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary(ffBiary);
				options.setHeadless(true);
				driver = new FirefoxDriver(options);
				break;
			case "ie":
				InternetExplorerDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "chrome":
				ChromeDriverManager.chromedriver().setup();
				ChromeOptions chromeoptions = new ChromeOptions();
				chromeoptions.addArguments("--disable-gpu");
				chromeoptions.addArguments("--no-sandbox");
				driver = new ChromeDriver(chromeoptions);
				break;
			case "sauceLabs":
				sauceConfig();
				break;				
		
			}
		}
		return driver;
	}
	
	public static void sauceConfig() {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		browserOptions.setCapability("sauce:options", sauceOptions);
		try {
			driver = new RemoteWebDriver(new URL(sauceURL), browserOptions);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}



