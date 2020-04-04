package com.automation.stepdefinition;

import java.util.Map;

import org.testng.Assert;

import com.automation.util.TestBase;
import com.automation.webpages.HomePage;
import com.automation.webpages.LoginPage;
import com.automation.webpages.MyAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends TestBase {

	HomePage homepage;
	LoginPage loginpage;

	@Given("^user is on Home Page$")
	public void user_is_on_home_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my store"));
	}

	@When("^user clicks on Sign In link$")
	public void user_clicks_on_sign_in_link() {
		homepage = new HomePage();
		loginpage = homepage.clickOnSignInLink();
	}

	@Then("^user is on Login Page$")
	public void user_is_on_login_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("login"));
	}

	@Then("^user enters personal and address information and clicks on register button$")
	public void user_enters_personal_and_address_information_and_clicks_on_register_button(DataTable information) {

		for (Map<Object, Object> data : information.asMaps(String.class, String.class)) {
			typeIn(LoginPage.createAc_email, (String) data.get("emailid"));
			clickOn(LoginPage.createAc_Btn);

			typeIn(LoginPage.firstName, (String) data.get("firstname"));
			typeIn(LoginPage.lastName, (String) data.get("lastname"));
			typeIn(LoginPage.password, (String) data.get("password"));

			typeIn(LoginPage.add_firstName, (String) data.get("firstname"));
			typeIn(LoginPage.add_lastName, (String) data.get("lastname"));
			typeIn(LoginPage.company, (String) data.get("company"));
			typeIn(LoginPage.address, (String) data.get("address"));
			typeIn(LoginPage.city, (String) data.get("city"));
			selectDropdown(LoginPage.state, (String) data.get("state"));
			typeIn(LoginPage.postalCode, (String) data.get("postalcode"));
			selectDropdown(LoginPage.country, (String) data.get("country"));
			typeIn(LoginPage.mobilePhone, (String) data.get("mobilephone"));
			typeIn(LoginPage.address_alias, (String) data.get("aliasaddress"));

			MyAccountPage myaccountpage = loginpage.clickOnRegister();
		}
	}

	@Then("^user is on My Account page$")
	public void user_is_on_my_account_page() {
		String title = checkPageTitle();
		Assert.assertTrue(title.toLowerCase().contains("my account"));
	}

}
/*
 * List<List<String>> data = table.asLists(); typeIn(LoginPage.firstName,
 * data.get(0).get(0)); typeIn(LoginPage.lastName, data.get(0).get(1));
 * typeIn(LoginPage.password, data.get(0).get(2));
 */
