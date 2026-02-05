package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCart extends bestTest{
	@Test
	public void verifyProductQuantity() throws InterruptedException {

		driver.findElement(By.xpath("(//p[text() = 'Blue Top'])[1]/../../..//a[text() = 'View Product']")).click();
		driver.findElement(By.id("quantity")).click();
		
		Actions act = new Actions(driver);
		act.moveByOffset(1152,311).click().click().click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[normalize-space('Add to cart')])[2]")).click();
		driver.findElement(By.linkText("View Cart")).click();
		
		WebElement actQuantity = driver.findElement(By.xpath("//button[text() = 4]"));
		
		
		
	}

}
