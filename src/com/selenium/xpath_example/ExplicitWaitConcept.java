package com.selenium.xpath_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		clickOn(driver, driver.findElement(By.id("u_0_b"))	, 20);

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeouts) {
		new WebDriverWait(driver, timeouts).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));

		locator.click();
	}

}
