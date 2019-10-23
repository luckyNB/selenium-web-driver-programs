package com.selenium.thirdPart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("u_0_15")).isDisplayed());
		System.out.println(driver.findElement(By.id("u_0_15")).isEnabled());
		
		//applicable for checkbox,radiobutton and dropdown
		System.out.println(driver.findElement(By.id("u_0_15")).isSelected());
		System.out.println(driver.findElement(By.id("u_0_6")).isSelected());
		
	}
}
