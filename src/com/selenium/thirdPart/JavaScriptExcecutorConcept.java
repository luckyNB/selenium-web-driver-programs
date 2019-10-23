package com.selenium.thirdPart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.name("email")).sendKeys("laxmanbhosale7374@gmail.com");
		;
		driver.findElement(By.name("password")).sendKeys("Laxman@2019");

		WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]"));
		flash(loginbtn, driver);// highlight the specific element
		drawBorder(loginbtn, driver);// for drawing border around the button element

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"/home/admin1/Documents/workspace-spring-tool-suite-4-4.4.0.RELEASE/Selenium/SeleniumWebDriver/element.png"));

		// generate alerts
		generateAlerts(driver, "There is an issue login on the login page");

		clickElementByJs(loginbtn, driver);
		// refreshBrowswerByJs(driver);
		driver.navigate().refresh();
		//System.out.println(getTitleByJs(driver));
		System.out.println(getPageInnerText(driver));
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public static void generateAlerts(WebDriver driver, String message) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].click()", element);
	}

	public static void refreshBrowswerByJs(WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("history.go(0)");
	}

	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		String title = executor.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		return executor.executeScript("return document.documentElement.innerText;").toString();
	}
}
