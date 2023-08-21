package appTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
		//Add email
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("rahul@gmail.com");
		
		//Add password
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("man@123");
		
		//Click button to login
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		LoginBtn.click();
	}
}
