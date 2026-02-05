package org.automation.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightClickAction {
public static void main(String[] args) {
	WebDriver driver = 	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/");
	WebElement compressPDF= driver.findElement(By.linkText("COMPRESS PDF"));
	Actions actions = new Actions(driver);
	//actions.contextClick(compressPDF).perform();
	actions.moveToElement(compressPDF).contextClick().perform();
	
	
	
}
}
