package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BridgeLab_RegistrationF_Form {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
//WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window

		driver.get("https://reg.bridgelabz.com/registerByCode");

		driver.findElement(By.id("mat-input-0")).sendKeys("Laxman Bhosale");
		driver.findElement(By.id("mat-input-1")).sendKeys("laxmanbhosale7374@gmail.com");
		driver.findElement(By.id("mat-input-2")).sendKeys("7030493048");

		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]/span")));

		select.selectByVisibleText("Pune");

		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")));

		select.selectByVisibleText("Online");

		driver.findElement(By.cssSelector("/html/body/app-root[1]/app-walkin-register/div/div/form/div[8]/button"))
				.click();

	}
}
