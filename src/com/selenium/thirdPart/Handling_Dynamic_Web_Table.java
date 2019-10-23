package com.selenium.thirdPart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dynamic_Web_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.name("email")).sendKeys("laxmanbhosale7374@gmail.com");
		;
		driver.findElement(By.name("password")).sendKeys("Laxman@2019");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]")).click();

	}

}
