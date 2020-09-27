$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/automation/features/CreateAccountFeature.feature");
formatter.feature({
  "name": "Create Account feature",
  "description": "  Register link provides create account feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create Account using register link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on register link",
  "keyword": "And "
});
formatter.step({
  "name": "user enters firstname \"\u003cfirstname\u003e\", lastname \"\u003clastname\u003e\", emailid \"\u003cemailid\u003e\" and password \"\u003cpassword\u003e\" and clicks on register button",
  "keyword": "When "
});
formatter.step({
  "name": "user should be successfully registered",
  "keyword": "Then "
});
formatter.step({
  "name": "user with email \"\u003cemailid\u003e\" should redirect to home page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "emailid",
        "password"
      ]
    },
    {
      "cells": [
        "Donald",
        "Trump",
        "dtrump0@gmail.com",
        "donaldtrump"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Account using register link",
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
  "name": "user clicks on register link",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_clicks_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname \"Donald\", lastname \"Trump\", emailid \"dtrump0@gmail.com\" and password \"donaldtrump\" and clicks on register button",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_enters_firstname_lastname_emailid_and_password_and_clicks_on_register_button(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_should_be_successfully_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user with email \"dtrump0@gmail.com\" should redirect to home page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_with_email_should_redirect_to_home_page(java.lang.String)"
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
  "name": "Login using login link (Successful login)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user with email \"\u003cemailid\u003e\" should redirect to home page",
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
        "gouribhale@gmail.com",
        "Gauri_6494"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login using login link (Successful login)",
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
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_navigates_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid \"gouribhale@gmail.com\" and \"Gauri_6494\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_enters_valid_emailid_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user with email \"gouribhale@gmail.com\" should redirect to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_with_email_should_redirect_to_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login using login link (Unsuccessful login)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters invalid \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "error message should be displayed as \"\u003cerror_msg\u003e\"",
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
        "password",
        "error_msg"
      ]
    },
    {
      "cells": [
        "",
        "Gauri_6494",
        "Login was unsuccessful. Please correct the errors and try again."
      ]
    },
    {
      "cells": [
        "gouribhale@gmail.com",
        "",
        "Login was unsuccessful. Please correct the errors and try again."
      ]
    },
    {
      "cells": [
        "gouribhale@gmail.com",
        "gauri",
        "Login was unsuccessful. Please correct the errors and try again."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login using login link (Unsuccessful login)",
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
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_navigates_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"\" and \"Gauri_6494\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_enters_invalid_emailid_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed as \"Login was unsuccessful. Please correct the errors and try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login using login link (Unsuccessful login)",
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
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_navigates_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"gouribhale@gmail.com\" and \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_enters_invalid_emailid_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed as \"Login was unsuccessful. Please correct the errors and try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login using login link (Unsuccessful login)",
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
  "name": "user navigates to login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_navigates_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"gouribhale@gmail.com\" and \"gauri\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.user_enters_invalid_emailid_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed as \"Login was unsuccessful. Please correct the errors and try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.LoginStepDefinition.error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});