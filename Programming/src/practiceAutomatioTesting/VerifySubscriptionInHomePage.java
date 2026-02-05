package practiceAutomatioTesting;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifySubscriptionInHomePage {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://automationexercise.com/");
		WebElement scroll = driver.findElement(By.xpath("//p[text() = 'Copyright © 2021 All rights reserved']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(scroll).perform(); 
		driver.findElement(By.id("susbscribe_email")).sendKeys("pradyumnrudrawar14@gmail.com" , Keys.ENTER);
	}

}
