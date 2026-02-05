package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddProductsinCart extends bestTest {
	
	@Test
	public void addProductCart() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Products")).click();
		WebElement sDress = driver.findElement(By.xpath("(//p[text() = 'Stylish Dress'])[1]"));
		 Actions act = new Actions(driver);
		 Thread.sleep(4000);
		 act.scrollToElement(sDress).perform();
		 Thread.sleep(4000);
		 act.moveToElement(sDress).perform();
		 driver.findElement(By.xpath("(//p[text() = 'Stylish Dress'])[1]/..//a[text()='Add to cart']")).click();
		 }

}
