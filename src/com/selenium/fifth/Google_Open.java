package com.selenium.fifth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Google_Open {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		// Get the title of the google page and print it on the console
		String title = driver.getTitle();
		System.out.println("the title of the page is :" + title);
		// Get the URL of the google page and print it on the console
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the URL of the page is :" + currentUrl);
		// Get the source code of the google page and print it on the console
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is :" + pageSource);// Halt the program execution for 2 seconds
		Thread.sleep(2000);
		// Close the browser
		driver.close();
	}
}
