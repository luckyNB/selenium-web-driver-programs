package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginFirst_Automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
//	WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window

		driver.get("https://usermgmt.ittutorials.in/users/newuser.aspx");

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("pwd123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

	}
}
