
package com.automation.stepdefinition;

import org.testng.Assert;


import com.automation.util.TestBase;
import com.automation.webpages.HomePage;
import com.automation.webpages.LoginPage;
import com.automation.webpages.MyAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends TestBase {

	HomePage homepage;
	LoginPage loginpage;

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("my store"));
	}

	@When("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() {
		homepage = new HomePage();
		loginpage = homepage.clickOnSignInLink();
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_emailid_and_password(String emailid, String password) {

		loginpage.reg_email.sendKeys(emailid);
		loginpage.reg_password.sendKeys(password); 
	}

	@And("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() {
		MyAccountPage myaccountpage = loginpage.clickOnSignInButton();
	}

	@Then("^user is on my account page$")
	public void user_is_on_my_account_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("my account"));
	}

}
