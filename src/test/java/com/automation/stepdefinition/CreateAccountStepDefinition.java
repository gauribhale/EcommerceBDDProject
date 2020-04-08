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
		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("my store"));
	}

	@When("^user clicks on Sign In link$")
	public void user_clicks_on_sign_in_link() {
		homepage = new HomePage();
		loginpage = homepage.clickOnSignInLink();
	}

	@Then("^user is on Login Page$")
	public void user_is_on_login_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("login"));
	}

	@Then("^user enters personal and address information and clicks on register button$")
	public void user_enters_personal_and_address_information_and_clicks_on_register_button(DataTable information) {

		for (Map<Object, Object> data : information.asMaps(String.class, String.class)) {
			loginpage.createAc_email.sendKeys((String) data.get("emailid"));
			loginpage.createAc_Btn.click();

			loginpage.firstName.sendKeys((String) data.get("firstname")); 
			loginpage.lastName.sendKeys((String) data.get("lastname"));
			loginpage.password.sendKeys((String) data.get("password")); 

			loginpage.company.sendKeys((String) data.get("company"));
			loginpage.address.sendKeys((String) data.get("address"));
			loginpage.city.sendKeys((String) data.get("city")); 
			selectDropdown(loginpage.state, (String) data.get("state"));
			loginpage.postalCode.sendKeys((String) data.get("postalcode")); 
			selectDropdown(loginpage.country, (String) data.get("country"));
			loginpage.mobilePhone.sendKeys((String) data.get("mobilephone")); 
			loginpage.address_alias.sendKeys((String) data.get("aliasaddress"));

			MyAccountPage myaccountpage = loginpage.clickOnRegister();
			
		}
	}

	@Then("^user is on My Account page$")
	public void user_is_on_my_account_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("my account"));
	}

}
/*
 * List<List<String>> data = table.asLists(); typeIn(LoginPage.firstName,
 * data.get(0).get(0)); typeIn(LoginPage.lastName, data.get(0).get(1));
 * typeIn(LoginPage.password, data.get(0).get(2));
 */
