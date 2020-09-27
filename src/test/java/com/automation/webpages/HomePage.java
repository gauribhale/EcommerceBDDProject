package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.BaseClass.BasePage;
import com.automation.pagelocators.HomePageLocator;
import com.automation.util.ElementUtility;

public class HomePage extends BasePage {

	private WebDriver _driver;
	HomePageLocator homePageLoc;
	ElementUtility elementUtil;

	public HomePage(WebDriver driver) {
		this._driver = driver;
		homePageLoc = new HomePageLocator(_driver);
		elementUtil = new ElementUtility(_driver);
	}

}
