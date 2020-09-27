package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.BaseClass.BasePage;
import com.automation.pagelocators.TopNavigationLocator;
import com.automation.util.ElementUtility;

public class TopNavigation extends BasePage {

	ElementUtility elementUtil;
	TopNavigationLocator topNavigationLoc;
	private WebDriver _driver;

	public TopNavigation(WebDriver driver) {
		this._driver = driver;
		elementUtil = new ElementUtility(_driver);
		topNavigationLoc = new TopNavigationLocator(_driver);
	}

	public String getCurrentPageTitle() {
		return elementUtil.getPageTite();
	}

	public LoginPage goToLoginPage() {
		elementUtil.click(topNavigationLoc.login_link);
		return new LoginPage(_driver);
	}

	public RegisterPage goToRegisterPage() {
		elementUtil.click(topNavigationLoc.register_link);
		return new RegisterPage(_driver);
	}

	public String getUserEmail() {
		return elementUtil.getText(topNavigationLoc.userEmail);
	}

}
