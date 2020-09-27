package com.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtility {

	private WebDriver _driver;
	private WebDriverWait wait;

	public ElementUtility(WebDriver driver) {
		this._driver = driver;
	}

	// CLICK METHODS
	public void click(WebElement element) {
		element.click();
	}

	public void waitAndClick(WebElement element, int time) {
		wait = new WebDriverWait(_driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		click(element);
	}

	// ENTER TEXT METHODS
	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void waitAndSendText(WebElement element, String text, int time) {
		wait = new WebDriverWait(_driver, time);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		sendText(element, text);
	}

	// METHODS TO GET CURRENT PAGE TITLE
	public String getPageTite() {
		return _driver.getTitle();
	}

	// METHODS TO GET TEXT FROM ELEMENT
	public String getText(WebElement element) {
		return element.getText();
	}

	public String waitAndGetText(WebElement element, int time) {
		wait = new WebDriverWait(_driver, time);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return getText(element);
	}
}
