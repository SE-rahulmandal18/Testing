package com.ecommerce.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProcessExternalLocator {

	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
		WebDriver driver = new ChromeDriver();

		//demo Alerts
//		demoExternalElements(driver);
		
//		demo Tabs
//		demoExternalElementsNewTab(driver);
		
//		demo Iframe
		demoExternalElementsIFrame(driver);
		
	}

	static void demoExternalElements(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///C:\\Users\\rahul\\eclipse-workspace11\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(By.linkText("See an example alert")).click();

		// alert will appear now, may be in 10 secs
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the alert to be displayed
		wait.until(ExpectedConditions.alertIsPresent());

		// Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		System.out.printf("\n alert text is %s \n", alert.getText());

		Thread.sleep(10000);

		alert.accept();

	}

	static void demoExternalElementsNewTab(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///C:\\Users\\rahul\\eclipse-workspace11\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com?q=flowers");
	}
	
	static void demoExternalElementsIFrame(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///C:\\Users\\rahul\\eclipse-workspace11\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.switchTo().frame("myframe");

		driver.findElement(By.cssSelector("#docsearch > button > span.DocSearch-Button-Container > span")).click();
		driver.findElement(By.cssSelector("#docsearch-input")).sendKeys("hello");

	}
	
	
	
	
	
	
	
	

}
