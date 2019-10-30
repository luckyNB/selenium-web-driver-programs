package com.selenium.fifth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Example {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 2. enter the url -
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		// Enter the URL of your own created sample web page
		driver.get("file:/home/admin1/UN.html");
		// Used “id” locator to find USERNAME text box
		WebElement unTB = driver.findElement(By.id("user"));
		// Clear the existing value present in the text box
		unTB.clear();
		// Enter value into the USERNAME text box
		unTB.sendKeys("ajit.biswas@gmail.com");
		// Used “name” locator to find Password text box
		WebElement passTB = driver.findElement(By.name("n1"));
		// Clear the existing value present in the text box
		passTB.clear();
		// Halt the program execution for 2 seconds
		Thread.sleep(2000);
		// Enter value into the Password text boxpassTB.sendKeys("Qspiders123");
		// Find the address of ActiTIME Link and click
		driver.findElement(By.linkText("Click ActiTIME link")).click();
		Thread.sleep(2000);
	}
}
