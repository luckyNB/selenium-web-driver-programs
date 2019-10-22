package com.selenium.xpath_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_xpath_creation_concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

		driver.findElement(By.id("gh-ac")).sendKeys("Java");

		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Books");

		driver.findElement(By.id("gh-btn")).click();

	}

}
