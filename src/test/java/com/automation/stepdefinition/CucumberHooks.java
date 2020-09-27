package com.automation.stepdefinition;

import com.automation.BaseClass.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

	public BaseTest basetest;
	@Before	
	public void BeforeScenario() {
		basetest=new BaseTest();
		basetest.setUp();
	}

	@After
	public void AfterScenario() {
		basetest.tearDown();
	}
}
