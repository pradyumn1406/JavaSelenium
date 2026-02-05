package org.automation.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAndHoldAndReleaseEvent {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/DragDrop.html");
		driver.manage().window().maximize();
 		Actions actions = new Actions(driver);
 		WebElement drag = driver.findElement(By.xpath("//div[text()='Washington']"));
 		WebElement drop = driver.findElement(By.xpath("//div[text()='United States']"));
 		
 		//Method 1
 		//actions.clickAndHold(drag).release(drop).perform();
 		
 		//Method 2
 		actions.moveToElement(drag).clickAndHold().moveToElement(drop).release().perform();   
 		
	}
}
