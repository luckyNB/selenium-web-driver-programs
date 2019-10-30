package com.selenium.fifth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation_Example {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

	WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
	// WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();// for maximizing the window
	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.navigate().to("http://www.gmail.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.close();
}
}
