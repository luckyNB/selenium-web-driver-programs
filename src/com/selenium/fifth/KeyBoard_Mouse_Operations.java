package com.selenium.fifth;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_Mouse_Operations {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//2. enter the url -
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
		driver.navigate().to("www.google.com");
		Thread.sleep(5000);
		//Creating an object of Robot Class
		Robot r = new Robot();
		//move the mouse by x and y coordinate
		r.mouseMove(300, 500);
		//press ALT key from keyboard
		r.keyPress(KeyEvent.VK_ALT);
		//press F key from keyboard
		r.keyPress(KeyEvent.VK_F);
		//Release F key from keyboard
		r.keyRelease(KeyEvent.VK_F);
		//Release Alt key from keyboard
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		//Press W key from keyboard to open a new private window
		r.keyPress(KeyEvent.VK_W);
		//Release W key from keyboard
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		// It will close only the current browser window
		//driver.close();
		// It will close all the browser windows opened by Selenium
		driver.quit();
	}

}
