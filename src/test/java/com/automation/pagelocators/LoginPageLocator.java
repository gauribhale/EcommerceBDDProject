package com.automation.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocator {

	@FindBy(how = How.ID_OR_NAME, using = "Email")
	public WebElement email;

	@FindBy(how = How.ID_OR_NAME, using = "Password")
	public WebElement password;

	@FindBy(how = How.ID_OR_NAME, using = "RememberMe")
	public WebElement rememberMe_checkBox;

	@FindBy(how = How.CSS, using = "input.button-1.login-button")
	public WebElement login_Btn;

	@FindBy(how = How.CSS, using = "span.forgot-password>a")
	public WebElement forgot_pass_link;

	@FindBy(how = How.CSS, using = "input.button-1.register-button")
	public WebElement register_Btn;

	@FindBy(how = How.CSS, using = "div.validation-summary-errors>span")
	public WebElement err_invalidLogin;

	private WebDriver _driver;

	public LoginPageLocator(WebDriver driver) {
		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}

}
