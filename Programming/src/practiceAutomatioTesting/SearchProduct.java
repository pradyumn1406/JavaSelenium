package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchProduct {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.partialLinkText("Products")).click();
		driver.findElement(By.name("search")).sendKeys("Blue Top");
		driver.findElement(By.id("submit_search")).click();
		 
		Actions act = new Actions(driver);
		WebElement sc= driver.findElement(By.xpath("//p[text()='Blue Top']/../../..//a[text()='View Product']"));
		act.scrollToElement(sc).perform();
		
		WebElement product =  driver.findElement(By.xpath("//p[text() = 'Blue Top']"));
		if (product.isDisplayed()) {
			System.out.println("Pass: Searched product is displayed");
		}else {
			System.out.println("Fail: Searched product is not displayed");
		}
	}

}
