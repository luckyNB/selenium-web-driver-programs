package com.selenium.xpath_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();

		FileInputStream inputStream = new FileInputStream(
				"/home/admin1/Documents/workspace-spring-tool-suite-4-4.4.0.RELEASE/Selenium/SeleniumWebDriver/src/com/selenium/xpath_example/config.properties");

		properties.load(inputStream);
		
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("age"));
		System.out.println(properties.getProperty("hobby")); 
	}
}
