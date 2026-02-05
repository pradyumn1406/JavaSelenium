package org.automation.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
	       Set<String> allWindows = driver.getWindowHandles();
	       String expectedChildWindowTitle = "New Window";
	       
	       for(String wi:allWindows)
	       {
	    	   driver.switchTo().window(wi);
	    	   if(driver.getTitle().equals(expectedChildWindowTitle))
	    	   {
	    		   break;
	    	   }  
	       }
		driver.close();
	}
}
