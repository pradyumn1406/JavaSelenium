package org.automation.locatorStrategies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishlistIcon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[name()='svg' and @height = '24']")).click();
		driver.findElement(By.xpath("//div[contains(text() , 'IQOO Z10X 5G (Titanium, 128 GB)')]/../../..//*[name() = 'svg' and @width = '16']")).click();		
		
	}

}
