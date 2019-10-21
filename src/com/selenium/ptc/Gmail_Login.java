package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property
																													// is
																													// set
																													// to
																													// chromedriver

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
//	WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		String url = "https://accounts.google.com/signin";
		driver.get(url);// for gettin the URL of webpage on which we are testing
		driver.findElement(By.id("identifierId")).sendKeys("laxmanbhosale7374");// setting up value of input field
		driver.findElement(By.id("identifierNext")).click();// for clicking the button

		WebDriverWait wait = new WebDriverWait(driver, 20);// for taking wait of 20 milli sec
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("Laxman@2021"); // setting up value of input field
		driver.findElement(By.id("passwordNext")).click();// for clicking the button

		// driver.findElement(By.linkText("))

	}

}
