package com.automation.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopNavigationLocator {

	@FindBy(how = How.CSS, using = "a.ico-login")
	public WebElement login_link;

	@FindBy(how = How.CSS, using = "a.ico-register")
	public WebElement register_link;

	@FindBy(how = How.CSS, using = "a.account")
	public WebElement userEmail;

	private WebDriver _driver;

	public TopNavigationLocator(WebDriver driver) {
		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}

}
