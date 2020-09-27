package com.automation.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public Properties config;
	public WebDriverWait wait;

	public BasePage() {
		try {
			config = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\config.properties");
			config.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public WebDriver startBrowser() {

		if (driver == null) {
			String browser = config.getProperty("browser");
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
				driver = new ChromeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;

			default:
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(config.getProperty("testsite"));
		}
		return driver;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}

}
