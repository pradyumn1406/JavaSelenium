package org.automation.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildPopupInSBI {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//Fetching parent windowID
		String parentWindowId= driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		
		//Fetching all the Windows Id
		Set<String> allWindowsId = driver.getWindowHandles();
		
		//Removing parent window id from all window id's
		//So only child window id will be available in the set
		allWindowsId.remove(parentWindowId);
		
		for(String childWindow : allWindowsId) 
		{
			driver.switchTo().window(childWindow);
		}
		driver.findElement(By.id("nextStep")).click();
	}
}
