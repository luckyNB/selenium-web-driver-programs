package com.selenium.fourth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSearchSpiceJet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(
				"https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetbrandexact&gclid=Cj0KCQjwl8XtBRDAARIsAKfwtxDdEV9YnX8e9V4oTNBS_WX2ln6jvygyLwKRmSwtm7X_hMmi90mjMxkaApCGEALw_wcB");

		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "20-11-2019";
		selectDateByJs(date, driver, dateVal);

	}

	public static void selectDateByJs(WebElement element, WebDriver driver, String dateVal) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);

		executor.executeScript("arguments[0].setAttribute(value,'" + dateVal + "')", element);
	}

}
//*[@id="ui"]/div/div/form/div/div[3]
 	