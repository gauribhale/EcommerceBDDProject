package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.BaseClass.BasePage;
import com.automation.pagelocators.LoginPageLocator;
import com.automation.util.ElementUtility;

public class LoginPage extends BasePage {

	private WebDriver _driver;
	LoginPageLocator loginPageLoc;
	ElementUtility elementUtil;

	public LoginPage(WebDriver driver) {
		this._driver = driver;
		loginPageLoc = new LoginPageLocator(_driver);
		elementUtil = new ElementUtility(_driver);

	}

	public HomePage successfulLogin(String email, String password) {

		elementUtil.sendText(loginPageLoc.email, email);
		elementUtil.sendText(loginPageLoc.password, password);
		elementUtil.click(loginPageLoc.login_Btn);
		return new HomePage(_driver);
	}

	public LoginPage unsuccessfulLogin(String email, String password) {
		elementUtil.sendText(loginPageLoc.email, email);
		elementUtil.sendText(loginPageLoc.password, password);
		elementUtil.click(loginPageLoc.login_Btn);
		return new LoginPage(_driver);
	}

	public String getErrorMessageOnInvalidCred() {
		return elementUtil.getText(loginPageLoc.err_invalidLogin);

	}
}
