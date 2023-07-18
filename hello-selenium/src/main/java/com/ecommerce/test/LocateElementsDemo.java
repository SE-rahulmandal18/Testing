package com.ecommerce.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
				WebDriver driver = new ChromeDriver();
				
				String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
				
				driver.get(baseUrl);
				
				// Locate the first name field using id 
				WebElement firstNameTF = driver.findElement(By.id("firstName"));
				//System.out.println("firstname text feild details "+firstNameTF);
				firstNameTF.sendKeys("fname");
				
				// Locate the last name field using name 
				WebElement lastNameTF = driver.findElement(By.name("lastName"));				
				lastNameTF.sendKeys("lastname");
				
				//Locate the button using class
				WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
				nextButton.click();
				
				// Locate by XPath
//				String xPathOfMonth = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div/div/div[2]/select";
//				WebElement monthSelectElement = driver.findElement(By.xpath(xPathOfMonth));
			
				Thread.sleep(5000);
				
				driver.close();

	}

}