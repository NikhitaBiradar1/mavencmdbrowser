package com.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriverUtility wLib = new WebDriverUtility();
	ExcelUtility eLib = new ExcelUtility();
	FileUtility fLib = new FileUtility();
	JavaUtility jLib = new JavaUtility();
	
	public WebDriver driver = null;
	public static WebDriver sdriver;

	@BeforeSuite(groups = { "ST", "RT" })
	public void configBS() {
		System.out.println(".....Connect to the database.....");
	}

	@BeforeClass(groups = { "ST", "RT" })
	public void configBC() throws Throwable {
		System.out.println(".....Launch the browser.....");
		String browser = fLib.getPropertyKeyValue("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		wLib.waitForElementInDOM(driver);
		driver.get("https://www.facebook.com/");
		sdriver = driver;

	}

	@BeforeMethod(groups = { "ST", "RT" })
	public void configBM() {
		System.out.println(".....Login to the application.....");
	}

	@AfterMethod(groups = { "ST", "RT" })
	public void configAM() {
		System.out.println(".....Logout of the application.....");
	}

	@AfterClass(groups = { "ST", "RT" })
	public void configAC() {
		System.out.println(".....Close the browser.....");
		driver.close();
	}

	@AfterSuite(groups = { "ST", "RT" })
	public void configAS() {
		System.out.println(".....Close the database connection.....");
	}
}
