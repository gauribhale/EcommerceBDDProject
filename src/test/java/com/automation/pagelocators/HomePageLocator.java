package com.automation.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocator {

	private WebDriver _driver;

	public HomePageLocator(WebDriver driver) {

		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}

}
