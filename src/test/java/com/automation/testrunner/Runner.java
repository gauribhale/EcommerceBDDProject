package com.automation.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/com/automation/features", 
		glue = {"com.automation.stepdefinition" }, 
		monochrome = true, 			
		plugin = { "pretty", 
				"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "json:target/cucumber-reports/CucumberTestReport.json"},
		dryRun = false
		
		)
public class Runner extends AbstractTestNGCucumberTests {

	
}
