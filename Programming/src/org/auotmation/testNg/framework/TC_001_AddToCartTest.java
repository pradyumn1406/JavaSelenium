package org.auotmation.testNg.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.auotmation.testNg.framework.MyListner.class)
public class TC_001_AddToCartTest extends BaseClass {
	
	@Test
	public void addToCart() {
		driver.findElement(By.partialLinkText("Electrn")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//span[text()='100.00']/../..//input[@value ='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text() = 'Shopping cart']")).click();
		
	WebElement smartPhn	= driver.findElement(By.linkText("Smartphone"));
	
    if (smartPhn.isDisplayed()) {
    	Reporter.log("PASS: Products is added to cart",true);
	} else {
    	Reporter.log("Fail: Products is added to cart",true);
	}

	}

}
