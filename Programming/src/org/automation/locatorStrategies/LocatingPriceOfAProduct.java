package org.automation.locatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfAProduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		//Thread.sleep(40000);
//		driver.findElement(By.name("q")).sendKeys("best phone under 5000", Keys.ENTER);
//		WebElement price = driver.findElement(By.xpath(("//div[contains(text(),'I Kall I1 NEW TOU')]/../..//div[contains(text(), '₹')])[1]")));
//		String rs = price.getText();
//		System.out.println(rs);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("best phone under 5000", Keys.ENTER);
		WebElement price= driver.findElement(By.xpath("//span[contains(text(),'Nokia 105 Classic | Single SIM Keypad Ph')and contains(text(), 'Charcoal')]/../../../..//span[@class='a-price-whole']"));
		String rs= price.getText();
		System.out.println(rs);
		
	}

}
