package org.automation.mouseActions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingMouseHoverEventInDWS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronicsDropDown = driver.findElement(By.partialLinkText("ELECTRONICS"));
		Actions action = new Actions(driver);
		
		//Move to cursor on Electronics
		action.moveToElement(electronicsDropDown).perform();
		
		//Moving from Electronics to Computer
		action.moveByOffset(456-585,288-288).perform();
		
		action.moveByOffset(787, 150).perform();

		
		//Not worked properly
		//action.moveToLocation(555, 290).perform();	
		
		
		
	}
}

//X: 585, Y: 286 = Electronic Location
//X: 456, Y: 288 = Computer Location



