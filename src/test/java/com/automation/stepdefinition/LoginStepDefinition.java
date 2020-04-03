
package com.automation.stepdefinition;

import org.testng.Assert;

import com.automation.util.TestBase;
import com.automation.webpages.HomePage;
import com.automation.webpages.MyAccountPage;
import com.automation.webpages.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends TestBase {

	HomePage homepage;
	SignInPage signinpage;

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my store"));
	}

	@When("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() {
		homepage = new HomePage();
		signinpage = homepage.clickOnSignInLink();
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_emailid_and_password(String emailid, String password) {

		typeIn(SignInPage.reg_email, emailid);
		typeIn(SignInPage.reg_password, password);
	}

	@And("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() {
		MyAccountPage myaccountpage = signinpage.clickOnSignInButton();
	}

	@Then("^user is on my account page$")
	public void user_is_on_my_account_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my account"));
	}

}
