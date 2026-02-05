package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifySubscriptioninCartPage {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/");
	driver.findElement(By.partialLinkText("Cart")).click();
	
	WebElement scroll = driver.findElement(By.xpath("//p[text() = 'Copyright © 2021 All rights reserved']"));
	
	Actions act = new Actions(driver);
	act.scrollToElement(scroll).perform(); 
	driver.findElement(By.id("susbscribe_email")).sendKeys("pradyumnrudrawar14@gmail.com" , Keys.ENTER);
	}

}
