package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserWithCorrectEmailandPassword {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://automationexercise.com/");
		 driver.findElement(By.partialLinkText("Signup / Login")).click();
		 driver.findElement(By.name("email")).sendKeys("paddy.14.rudra@gmail.com" , Keys.TAB , "123456789");
		 driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		 
		 
	}

}
