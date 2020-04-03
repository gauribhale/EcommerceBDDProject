$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/automation/features/CreateAccountFeature.feature");
formatter.feature({
  "name": "Create Account feature",
  "description": "  Sign in link provides create account feature",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create Account using sign in link",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_clicks_on_sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter emailid",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_enter_emailid(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Create Account button",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_clicks_on_create_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters personal information of firstname, lastname and password",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_enters_personal_information_of_firstname_lastname_and_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters address information",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_enters_address_information(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on My Account page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_is_on_my_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/com/automation/features/LoginFeature.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Sign in link provides login feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login using sign in link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on sign in link",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "user is on my account page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ]
    },
    {
      "cells": [
        "gouri_bhale@yahoo.com",
        "jamesbond"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login using sign in link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on sign in link",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_clicks_on_sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"gouri_bhale@yahoo.com\" and \"jamesbond\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_enters_emailid_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on my account page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_is_on_my_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});