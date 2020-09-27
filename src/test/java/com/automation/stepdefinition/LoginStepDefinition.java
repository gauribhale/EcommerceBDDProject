
package com.automation.stepdefinition;

import org.testng.Assert;

import com.automation.BaseClass.BaseTest;
import com.automation.util.PageTitles;
import com.automation.webpages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseTest {

	LoginPage loginpg;

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		Assert.assertEquals(topNavigation.getCurrentPageTitle(), PageTitles.HomePageTitle, "Home Page is not loaded");
	}

	@And("^user navigates to login page$")
	public void user_navigates_to_login_page() {
		loginpg = topNavigation.goToLoginPage();
		Assert.assertEquals(topNavigation.getCurrentPageTitle(), PageTitles.LoginPageTitle, "Login Page is not loaded");
	}

	@When("^user enters valid emailid \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_emailid_and_password(String emailid, String password) {
		homepg = loginpg.successfulLogin(emailid, password);

	}

	@Then("^user with email \"([^\"]*)\" should redirect to home page$")
	public void user_with_email_should_redirect_to_home_page(String emailid) {

		Assert.assertEquals(topNavigation.getCurrentPageTitle(), PageTitles.HomePageTitle, "Home page is not loaded");
		Assert.assertEquals(topNavigation.getUserEmail(), emailid, "Invalid email");
	}

	@When("^user enters invalid emailid \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_invalid_emailid_and_password(String emailid, String password) {
		loginpg = loginpg.unsuccessfulLogin(emailid, password);

	}

	@Then("^error message should be displayed as \"([^\"]*)\"$")
	public void error_message_should_be_displayed_as(String error_msg) {

		Assert.assertEquals(topNavigation.getCurrentPageTitle(), PageTitles.LoginPageTitle, "Login page is not loaded");
		Assert.assertEquals(loginpg.getErrorMessageOnInvalidCred(), error_msg, "Error message displayed is incorrect");
	}

}
