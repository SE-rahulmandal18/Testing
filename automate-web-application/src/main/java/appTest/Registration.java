package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create new account']"));
		SignUp.click();
	

		WebElement firstNameTF = driver.findElement(By.name("firstname"));
		firstNameTF.sendKeys("Rahul");
		WebElement lastNameTF = driver.findElement(By.name("lastname"));				
		lastNameTF.sendKeys("Mandal");
		
		WebElement number = driver.findElement(By.name("reg_email__"));				
		number.sendKeys("1234567890");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		Password.sendKeys("man@123");
		
		//Select day
		WebElement Day = driver.findElement(By.id("day"));
	
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("23");
		

		//Dynamic xpath for gender
		String GenVal = "Male";
		WebElement DynamicGen = driver.findElement(By.xpath("//label[text()='" + GenVal + "']/following-sibling::input"));
		DynamicGen.click();
		

	}

}

