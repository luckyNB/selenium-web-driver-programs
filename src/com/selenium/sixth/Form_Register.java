package com.selenium.sixth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Register {
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
		driver.get("http://www.practiceselenium.com/check-out.html");

		driver.findElement(By.id("email")).sendKeys("laxmanbhosale360@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Laxman Bhosale");
		Thread.sleep(1000);

		driver.findElement(By.id("address")).sendKeys("Hingoli,Maharashtra,India");
		Thread.sleep(1000);

		Select select = new Select(driver.findElement(By.id("card_type")));
		select.selectByVisibleText("Mastercard");
		Thread.sleep(1000);

		driver.findElement(By.id("card_number")).sendKeys("1111 2222 3333 4444");
		Thread.sleep(1000);

		driver.findElement(By.id("cardholder_name")).sendKeys("BHOSALE LAXMAN");

		Thread.sleep(1000);
		driver.findElement(By.id("verification_code")).sendKeys("007");

		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button"))
				.click();
	}
}
