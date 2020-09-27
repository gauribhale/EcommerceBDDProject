package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.util.ElementUtility;

public class ContactUsPage {

	private WebDriver _driver;
	ElementUtility elementUtil;
	
	public ContactUsPage(WebDriver driver) {
		this._driver=driver;
		elementUtil=new ElementUtility(_driver);
		
	}
}
