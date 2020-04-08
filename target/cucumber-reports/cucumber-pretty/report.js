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
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters personal and address information and clicks on register button",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_enters_personal_and_address_information_and_clicks_on_register_button(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027customer_firstname\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WIN\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 80.0.3987.149, webStorageEnabled: true}\nSession ID: b3347623fb716c352a4a9231853a6c91\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027customer_firstname\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat com.automation.stepdefinition.CreateAccountStepDefinition.user_enters_personal_and_address_information_and_clicks_on_register_button(CreateAccountStepDefinition.java:47)\r\n\tat ✽.user enters personal and address information and clicks on register button(file:///D:/TestAutomationProjects/EcommerceProject/src/test/java/com/automation/features/CreateAccountFeature.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefinition.CreateAccountStepDefinition.user_is_on_my_account_page()"
});
formatter.result({
  "status": "skipped"
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
        "donald@gmail.com",
        "donaldtrump"
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
  "name": "user enters \"donald@gmail.com\" and \"donaldtrump\"",
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