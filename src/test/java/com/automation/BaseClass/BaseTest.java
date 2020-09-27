package com.automation.BaseClass;

import org.openqa.selenium.WebDriver;

import com.automation.webpages.HomePage;
import com.automation.webpages.TopNavigation;

public class BaseTest {

	public static WebDriver driver;
	public static HomePage homepg;
	public static BasePage basepg;
	public static TopNavigation topNavigation;

	public void setUp() {
		basepg = new BasePage();
		driver = basepg.startBrowser();
		homepg = new HomePage(driver);
		topNavigation = new TopNavigation(driver);
	}

	public void tearDown() {
		basepg.closeBrowser();
	}

}
