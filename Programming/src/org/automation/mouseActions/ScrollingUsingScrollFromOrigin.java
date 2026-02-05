package org.automation.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingUsingScrollFromOrigin {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver	driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com/");
		  Thread.sleep(5000);
		  WebElement target =  driver.findElement(By.xpath("//span[text() = 'Resume writing']"));  
		  Actions actions = new Actions(driver);
		  // Method 1 -> actions.scrollToElement(target).scrollByAmount(0,250).perform();
		  ScrollOrigin so = ScrollOrigin.fromElement(target);
		  actions.scrollFromOrigin(so, 0, 200).perform();
		  target.click();

}
}