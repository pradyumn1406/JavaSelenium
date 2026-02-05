package org.automation.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragD {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/DragDrop.html");
		driver.manage().window().maximize();
 		Actions actions = new Actions(driver);
//==============With using loop===============================================
 		
 		for(int i =1 ; i<=7 ; i++) {
 			WebElement drag =  driver.findElement(By.id("box"+i));
 			WebElement drop = driver.findElement(By.id("box10"+i));
 			actions.dragAndDrop(drag, drop).perform();
 			
 		}		
//============================Without using loop==============================	
		
//		WebElement drag1 =  driver.findElement(By.id("box1"));
//		WebElement drop1 = driver.findElement(By.id("box106"));
//		
//		WebElement drag2 =  driver.findElement(By.id("box2"));
//		WebElement drop2 = driver.findElement(By.id("box101"));
//		
//		WebElement drag3 =  driver.findElement(By.id("box3"));
//		WebElement drop3 = driver.findElement(By.id("box102"));
//
//		WebElement drag4 =  driver.findElement(By.id("box4"));
//		WebElement drop4 = driver.findElement(By.id("box103"));
//
//		WebElement drag5 =  driver.findElement(By.id("box5"));
//		WebElement drop5 = driver.findElement(By.id("box104"));
//
//		WebElement drag6 =  driver.findElement(By.id("box6"));
//		WebElement drop6 = driver.findElement(By.id("box105"));
//
//		WebElement drag7 =  driver.findElement(By.id("box7"));
//		WebElement drop7 = driver.findElement(By.id("box107"));
//
//		
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(drag1, drop1).perform();
//		actions.dragAndDrop(drag2, drop2).perform();
//		actions.dragAndDrop(drag3, drop3).perform();
//		actions.dragAndDrop(drag4, drop4).perform();
//		actions.dragAndDrop(drag5, drop5).perform();
//		actions.dragAndDrop(drag6, drop6).perform();
//		actions.dragAndDrop(drag7, drop7).perform();		
	}
}
