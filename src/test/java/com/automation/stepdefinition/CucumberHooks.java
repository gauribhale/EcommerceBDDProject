package com.automation.stepdefinition;

import com.automation.util.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends TestBase {

	@Before
	public void setUp() {
		initialize();
	}

	@After
	public void tearDown() {
		close();
	}
}
