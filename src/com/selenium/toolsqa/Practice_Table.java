package com.selenium.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Table {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/home/admin1/Downloads/chromedriver_linux64/chromedriver");// Property

		WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();// for maximizing the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://toolsqa.com/automation-practice-table");
		 String sRow = "1";
		 String sCol = "2";
		 
		 //Here we are locating the xpath by passing variables in the xpath
		 String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
		 System.out.println(sCellValue);
		 String sRowValue = "Clock Tower Hotel";
		 
		 //First loop will find the 'ClOCK TWER HOTEL' in the first column
		 for (int i=1;i<=5;i++){
		 String sValue = null;
		 sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
		 if(sValue.equalsIgnoreCase(sRowValue)){
		 // If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
		 for (int j=1;j<=5;j++){
		 String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
		 System.out.println(sColumnValue);
		 }
		 break;
		 }
		 }
		// driver.close();
		
	}

}
