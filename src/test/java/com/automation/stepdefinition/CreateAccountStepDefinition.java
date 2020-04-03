package com.automation.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.util.TestBase;
import com.automation.webpages.HomePage;
import com.automation.webpages.MyAccountPage;
import com.automation.webpages.SignInPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends TestBase {

	HomePage homepage;
	SignInPage signinpage;
	JavascriptExecutor js;

	@Given("^user is on Home Page$")
	public void user_is_on_home_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my store"));
	}

	@When("^user clicks on Sign In link$")
	public void user_clicks_on_sign_in_link() {
		homepage = new HomePage();
		signinpage = homepage.clickOnSignInLink();
	}

	@Then("^user enter emailid$")
	public void user_enter_emailid(DataTable table) {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("login"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", SignInPage.createAc_email);
		clickOn(SignInPage.createAc_email);
		List<List<String>> data = table.asLists();
		typeIn(SignInPage.createAc_email, data.get(0).get(0));

		// Map<String, String> data = (Map<String, String>) table.asMaps(String.class,
		// String.class);

	}

	@And("^user clicks on Create Account button$")
	public void user_clicks_on_create_account_button() {
		clickOn(SignInPage.createAc_Btn);
	}

	@Then("^user enters personal information of firstname, lastname and password$")
	public void user_enters_personal_information_of_firstname_lastname_and_password(DataTable table) {
		// Map<String, String> data = (Map<String, String>) table.asMaps(String.class,
		// String.class);
		List<List<String>> data = table.asLists();
		typeIn(SignInPage.firstName, data.get(0).get(0));
		typeIn(SignInPage.lastName, data.get(0).get(1));
		typeIn(SignInPage.password, data.get(0).get(2));
	}

	@And("^user enters address information$")
	public void user_enters_address_information(DataTable table) {
		// Map<String, String> data = (Map<String, String>) table.asMaps(String.class,
		// String.class);
		List<List<String>> data = table.asLists();
		typeIn(SignInPage.add_firstName, data.get(0).get(0));
		typeIn(SignInPage.add_lastName, data.get(0).get(1));
		typeIn(SignInPage.company, data.get(0).get(2));
		typeIn(SignInPage.address, data.get(0).get(3));
		typeIn(SignInPage.city, data.get(0).get(4));
		selectDropdown(SignInPage.state, data.get(0).get(5));
		typeIn(SignInPage.postalCode, data.get(0).get(6));
		selectDropdown(SignInPage.country, data.get(0).get(7));
		typeIn(SignInPage.mobilePhone, data.get(0).get(8));
		typeIn(SignInPage.address_alias, data.get(0).get(9));
	}

	@Then("^user clicks on Register button$")
	public void user_clicks_on_register_button() {
		MyAccountPage myaccountpage = signinpage.clickOnRegister();
	}

	@And("^user is on My Account page$")
	public void user_is_on_my_account_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my account"));

	}

}
