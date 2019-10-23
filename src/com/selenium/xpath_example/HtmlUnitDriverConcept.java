package com.selenium.xpath_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new HtmlUnitDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		// HtmlUnitDriver is not available 3.x version

		// advantages
		// 1. Testing is done behind the scene - no browser is launched
		// 2. Very fast -- excecution of test cases --performance of test cases
		// 3. Not available for Action class --user actions
		// --mousemovement,doubleClick,drag n drop
		// 4. Ghost Driver- Headless browser

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();
		System.out.println("Before login Title::" + driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");

		driver.findElement(By.name("email")).sendKeys("laxmanbhosale7374@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Laxman@2019");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		System.out.println("After Login Title" + driver.getTitle());
	}

}
