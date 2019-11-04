package com.selenium.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		// 2. enter the url -
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/?firstname=&photo=&continents=AS&submit=");

		driver.findElement(By.name("firstname")).sendKeys("Laxman");
		Thread.sleep(2000);
		driver.findElement(By.id("lastname")).sendKeys("Bhosale");
		// driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("exp-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("07-07-1998");
		Thread.sleep(2000);
		driver.findElement(By.id("profession-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("photo"))
				.sendKeys("/home/admin1/Desktop/main-qimg-793cfd24ad2c1d352cd3fe4b2940341d.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.id("tool-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tool-2")).click();
		Thread.sleep(2000);
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Africa");
		Thread.sleep(2000);
		Select selenium_commands = new Select(driver.findElement(By.id("selenium_commands")));
		selenium_commands.selectByVisibleText("Navigation Commands");
		driver.close();
	}

}
