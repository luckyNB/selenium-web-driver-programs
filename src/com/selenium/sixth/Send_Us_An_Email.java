package com.selenium.sixth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Us_An_Email {

	public static void main(String[] args) throws InterruptedException {

		// 2. enter the url -
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");

		driver.findElement(By.name("name")).sendKeys("Laxman Bhosale");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("laxmanbhosale7374@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.name("subject")).sendKeys("Polity and History");
		Thread.sleep(1000);

		driver.findElement(By.name("message")).sendKeys("I love my country as well as my peoples");
		Thread.sleep(1000);

		driver.findElement(By.className("form-submit")).click();
		System.out.println(driver.findElement(By.className("form-submit")).getText());
		driver.close();
	}
	

}
