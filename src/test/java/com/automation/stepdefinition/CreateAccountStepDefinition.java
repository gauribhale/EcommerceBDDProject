package com.automation.stepdefinition;

import org.testng.Assert;

import com.automation.BaseClass.BaseTest;
import com.automation.util.PageTitles;
import com.automation.webpages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends BaseTest {

	RegisterPage registerpg;

	@And("^user clicks on register link$")
	public void user_clicks_on_register_link() {
		registerpg = topNavigation.goToRegisterPage();
		Assert.assertEquals(topNavigation.getCurrentPageTitle(), PageTitles.RegisterPageTitle,
				"Registration page is not loaded");
	}

	@When("^user enters firstname \"([^\"]*)\", lastname \"([^\"]*)\", emailid \"([^\"]*)\" and password \"([^\"]*)\" and clicks on register button$")
	public void user_enters_firstname_lastname_emailid_and_password_and_clicks_on_register_button(String firstname,
			String lastname, String emailid, String password) {
		registerpg.registerNewUser(firstname, lastname, emailid, password);

	}

	@Then("^user should be successfully registered$")
	public void user_should_be_successfully_registered() {
		Assert.assertEquals(registerpg.getSuccessfullRegistrationMessage(), "Your registration completed",
				"User is not registered successfully");
		homepg = registerpg.clickOnContinueButton();
	}

}
