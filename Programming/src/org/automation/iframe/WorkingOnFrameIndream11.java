package org.automation.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFrameIndream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://dream11.com/fantasy-sports");
		
		//1. driver.switchTo().frame(0);
		
		//2. driver.switchTo().frame("send-sms-iframe");
		
		//3. Using frame(WebElement frameElement)
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("regEmail")).sendKeys("9075554715");
		driver.findElement(By.linkText("GET APP LINK")).click();
		
		//4. Default defaultContent()
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
		
		
		
		
		
		
		
		
	}

}
