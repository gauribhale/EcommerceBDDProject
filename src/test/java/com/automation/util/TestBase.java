package com.automation.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;

	public static void initialize() {
		if (driver == null) {
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\src\\test\\resources\\Executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (config.getProperty("browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "\\src\\test\\resources\\Executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

	}

	public static void clickOn(WebElement locator) {
		locator.click();
	}

	public static void typeIn(WebElement locator, String value) {
		locator.sendKeys(value);
	}
	
	public static void selectDropdown(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByVisibleText(value);
	}

	public static String checkPageTitle() {
		return driver.getTitle();
	}
	public static void close() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}

}
