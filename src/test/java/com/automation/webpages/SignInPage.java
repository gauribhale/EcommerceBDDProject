package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.pagelocators.SignInPageObjects;
import com.automation.util.TestBase;

public class SignInPage extends TestBase{

	@FindBy(how=How.XPATH,using=SignInPageObjects.createAc_email)
	public static WebElement createAc_email;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.createAc_Btn)
	public static WebElement createAc_Btn;

	@FindBy(how=How.XPATH,using=SignInPageObjects.firstName)
	public static WebElement firstName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.lastName)
	public static WebElement lastName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.password)
	public static WebElement password;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.add_firstName)
	public static WebElement add_firstName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.add_lastName)
	public static WebElement add_lastName;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.company)
	public static WebElement company;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.address)
	public static WebElement address;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.city)
	public static WebElement city;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.state)
	public static WebElement state;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.postalCode)
	public static WebElement postalCode;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.country)
	public static WebElement country;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.mobilePhone)
	public static WebElement mobilePhone;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.address_alias)
	public static WebElement address_alias;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.register_Btn)
	public static WebElement register_Btn;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.reg_email)
	public static WebElement reg_email;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.reg_password)
	public static WebElement reg_password;
	
	@FindBy(how=How.XPATH,using=SignInPageObjects.signin_Btn)
	public static WebElement signin_Btn;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public MyAccountPage clickOnRegister() {
		clickOn(register_Btn);
		return new MyAccountPage();
	}
	
	public MyAccountPage clickOnSignInButton() {
		clickOn(signin_Btn);
		return new MyAccountPage();
	}
}
