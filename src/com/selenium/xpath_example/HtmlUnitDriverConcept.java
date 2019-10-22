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

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		
		
		System.out.println("Before login Title::"+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("laxmanbhosale7374@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Laxman@2019");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		System.out.println("After Login Title"+driver.getTitle());
	}

}
