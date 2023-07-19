package com.ecommerce.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		demoTakingScreenshot(driver);

	}

	static void demoTakingScreenshot(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///C:\\Users\\rahul\\eclipse-workspace11\\hello-selenium\\src\\main\\resources\\test.html";
	    driver.get(baseUrl);
	    
	    
	}

}