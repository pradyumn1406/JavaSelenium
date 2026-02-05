package org.automation.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingImplicitMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password =  driver.findElement(By.name("password"));
		
		Actions action = new Actions(driver);
		//Method 1 Most used
		action.sendKeys(username,"Admin").sendKeys(password, "admin123").keyDown(Keys.ENTER).perform();
		
		//Method 2
		//action.moveToElement(username).sendKeys("Admin").moveToElement(password).click().sendKeys("admin123").keyDown(Keys.ENTER).perform();
		
		
		
	}

}
