package org.automation.webElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysToPerform {
	public static void main(String[] args) throws InterruptedException {

	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.findElement(By.linkText("Log in")).click();
	       WebElement emailTextbox = driver.switchTo().activeElement();
	       //emailTextbox.sendKeys("admin02@gmail.com", Keys.TAB, "Admin02", Keys.ENTER);
	       emailTextbox.sendKeys("admin02@gmail.com", Keys.CONTROL+"a");
	       Thread.sleep(2000);
	       emailTextbox.sendKeys(Keys.CONTROL+"c");	 
	       Thread.sleep(2000);
	       emailTextbox.sendKeys(Keys.TAB);
	       Thread.sleep(2000);
	       emailTextbox.sendKeys(Keys.CONTROL+"v");
	       
	}
}
