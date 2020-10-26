package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.pagelocators.HomePageLocator;
import com.automation.util.ElementUtility;

public class ContactsPage {
	private WebDriver _driver;
	HomePageLocator contactsPageLoc;
	ElementUtility elementUtil;

	public ContactsPage(WebDriver driver) {
		this._driver = driver;
		contactsPageLoc = new HomePageLocator(_driver);
		elementUtil = new ElementUtility(_driver);
	}

}
