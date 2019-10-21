package com.selenium.ptc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();

	driver.get("http://www.twitter.com");

	
	System.out.println(driver.getTitle());
	
	//Get the URL of the google page and print it on the console
	String currentUrl = driver.getCurrentUrl();
	System.out.println("the URL of the page is :"+ currentUrl);
	//Get the source code of the google page and print it on the console
	String pageSource = driver.getPageSource();
	
	System.out.println( driver.getPageSource());
//	System.out.println("the source code of the page is=====> :"+ pageSource);
	
	
	
	}

}
