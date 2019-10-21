package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://facebook.com");

		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Laxman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Bhosale");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("7030493048");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"u_0_y\"]")).sendKeys("Laxman@1Raja");

	}

}
