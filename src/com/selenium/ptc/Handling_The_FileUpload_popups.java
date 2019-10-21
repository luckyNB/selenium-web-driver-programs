package com.selenium.ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_The_FileUpload_popups {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

	WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
//WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();// for maximizing the window

	driver.get("https://html.com/input%20type%20file/");
	
	driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("/home/admin1/InventoryDemo.json");
	
	
}
}
