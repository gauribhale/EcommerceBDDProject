package com.automation.webpages;

import org.openqa.selenium.WebDriver;

import com.automation.BaseClass.BasePage;
import com.automation.pagelocators.LoginPageLocator;
import com.automation.pagelocators.RegisterPageLocator;
import com.automation.util.ElementUtility;

public class RegisterPage extends BasePage {

	private WebDriver _driver;
	RegisterPageLocator registerPageLoc;
	ElementUtility elementUtil;

	public RegisterPage(WebDriver driver) {
		this._driver = driver;
		registerPageLoc = new RegisterPageLocator(_driver);
		elementUtil = new ElementUtility(_driver);
	}

	public void registerNewUser(String firstname, String lastname, String emailid, String password) {

		elementUtil.sendText(registerPageLoc.firstName, firstname);
		elementUtil.sendText(registerPageLoc.lastName, lastname);
		elementUtil.sendText(registerPageLoc.createAc_email, emailid);
		elementUtil.sendText(registerPageLoc.createAc_password, password);
		elementUtil.sendText(registerPageLoc.confirm_password, password);
		elementUtil.click(registerPageLoc.register_Btn);

	}

	public String getSuccessfullRegistrationMessage() {
		return elementUtil.getText(registerPageLoc.registerSuccessMsg);
	}

	public HomePage clickOnContinueButton() {
		elementUtil.click(registerPageLoc.continue_btn);
		return new HomePage(_driver);
	}
}
