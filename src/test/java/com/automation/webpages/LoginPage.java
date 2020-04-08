package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.pagelocators.SignInPageObjects;
import com.automation.util.TestBase;

public class LoginPage extends TestBase{

	@FindBy(how=How.XPATH,using=SignInPageObjects.createAc_email)
	public WebElement createAc_email;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.createAc_Btn)
	public WebElement createAc_Btn;

	@FindBy(how=How.XPATH,using=SignInPageObjects.firstName)
	public WebElement firstName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.lastName)
	public WebElement lastName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.password)
	public WebElement password;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.add_firstName)
	public WebElement add_firstName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.add_lastName)
	public WebElement add_lastName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.company)
	public WebElement company;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.address)
	public WebElement address;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.city)
	public WebElement city;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.state)
	public WebElement state;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.postalCode)
	public WebElement postalCode;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.country)
	public WebElement country;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.mobilePhone)
	public WebElement mobilePhone;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.address_alias)
	public WebElement address_alias;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.register_Btn)
	public WebElement register_Btn;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.reg_email)
	public WebElement reg_email;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.reg_password)
	public WebElement reg_password;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.signin_Btn)
	public WebElement signin_Btn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public MyAccountPage clickOnRegister() {
		register_Btn.click();
		return new MyAccountPage();
	}
	
	public MyAccountPage clickOnSignInButton() {
		signin_Btn.click();
		return new MyAccountPage();
	}
}
