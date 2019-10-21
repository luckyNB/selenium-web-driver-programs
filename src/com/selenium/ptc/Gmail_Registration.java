package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Registration {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
//	WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.id("firstName")).sendKeys("Laxman");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Bhosale");
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("LaxmanRajaBhosale007@gmail.com");
		Thread.sleep(2000);

		driver.findElement(
				By.cssSelector("#passwd > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"))
				.sendKeys("Laxman@7Raja");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(
				"#confirm-passwd > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)\n" + ""))
				.sendKeys("Laxman@7Raja");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".CwaK9 ")).click();

	}
}
