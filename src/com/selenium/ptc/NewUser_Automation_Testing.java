package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewUser_Automation_Testing {

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
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("New User")).click();
		
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.id("cphBody_txtFirstName")).sendKeys("Laxman");
		driver.findElement(By.id("cphBody_txtMiddleName")).sendKeys("Narayan");
		driver.findElement(By.id("cphBody_txtLastName")).sendKeys("Bhosale");
		driver.findElement(By.id("cphBody_txtDob")).click();
		Select select = new Select(driver.findElement(By.id("select2-cphBody_ddlGender-container\n" + "")));
		select.selectByVisibleText("Male");

		Select select2 = new Select(driver.findElement(By.id("select2-cphBody_ddlCountry-container\n" + "")));
		select2.selectByVisibleText("India");

		driver.findElement(By.id("cphBody_txtPhone")).sendKeys("7030493048");

		driver.findElement(By.id("cphBody_txtPhoneExt")).sendKeys("999 7030493048");

		driver.findElement(By.id("cphBody_txtEmail")).sendKeys("laxmanbhosale7374@gmail.com");

		driver.findElement(By.id("cphBody_txtUsername")).sendKeys("lucky");
		driver.findElement(By.id("cphBody_txtPassword")).sendKeys("Laxman@2021");
		driver.findElement(By.id("cphBody_txtConfirmPassword")).sendKeys("Laxman@2021");

		Select select3 = new Select(driver.findElement(By.id("cphBody_ddlUserRole")));

		select3.selectByVisibleText("Admin");

		driver.findElement(By.id("cphBody_btnSubmit")).click();
	}
}
