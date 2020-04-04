package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.pagelocators.HomePageObjects;
import com.automation.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(how=How.XPATH,using=HomePageObjects.signin_Btn)
	public WebElement signin_Btn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
		
	public LoginPage clickOnSignInLink() {
		clickOn(signin_Btn);
		return new LoginPage();
	}
	
	
	
	
	
	
}
