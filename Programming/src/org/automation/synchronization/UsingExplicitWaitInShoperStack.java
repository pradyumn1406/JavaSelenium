package org.automation.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWaitInShoperStack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/57");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411057");
		
		WebElement check = driver.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
		
	}

} 