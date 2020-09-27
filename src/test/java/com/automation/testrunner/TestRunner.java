package com.automation.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/automation/features", 
glue = {"com.automation.stepdefinition"}, 
monochrome = true, 
plugin = { "pretty",
			"html:target/cucumber-reports/cucumber-pretty", 
			"json:target/CucumberTestReport.json",
			"rerun:target/cucumber-reports/rerun.txt" }, 
dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

}

