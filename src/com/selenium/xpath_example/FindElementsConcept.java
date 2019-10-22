package com.selenium.xpath_example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list=	 driver.findElements(By.tagName("a"));

	System.out.println("Number of links available::==>"+list.size());
	
	
	for(WebElement element:list) {
		System.out.println("\t"+element.getText());
	}
	
	
	}

}
