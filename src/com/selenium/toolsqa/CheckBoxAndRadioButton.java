package com.selenium.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form");

		driver.findElement(By.name("firstname")).sendKeys("LaxmanRao");

		Thread.sleep(2000);
		driver.findElement(By.id("lastname")).sendKeys("Bhosale");
		Thread.sleep(2000);

		WebElement sex = driver.findElement(By.id("sex-0"));
		sex.click();
		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).sendKeys("04-11-2019");
		Thread.sleep(2000);

		driver.findElement(By.id("exp-2")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("profession-0")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("profession-1")).click();

	}
}
