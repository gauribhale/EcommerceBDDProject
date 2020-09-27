package com.automation.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageLocator {

	@FindBy(how = How.ID_OR_NAME, using = "FirstName")
	public WebElement firstName;

	@FindBy(how = How.ID_OR_NAME, using = "LastName")
	public WebElement lastName;

	@FindBy(how = How.ID_OR_NAME, using = "Email")
	public WebElement createAc_email;

	@FindBy(how = How.ID_OR_NAME, using = "Password")
	public WebElement createAc_password;

	@FindBy(how = How.ID_OR_NAME, using = "ConfirmPassword")
	public WebElement confirm_password;

	@FindBy(how = How.ID_OR_NAME, using = "register-button")
	public WebElement register_Btn;

	@FindBy(how = How.CSS, using = "div.result")
	public WebElement registerSuccessMsg;

	@FindBy(how = How.CSS, using = "div>input.button-1.register-continue-button")
	public WebElement continue_btn;
	
	private WebDriver _driver;

	public RegisterPageLocator(WebDriver driver) {
		this._driver = driver;
		PageFactory.initElements(_driver, this);

	}

}
