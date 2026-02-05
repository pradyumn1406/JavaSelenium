package org.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCustomeTextBoxIsDisplayedOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		 WebElement customeGenderbutton = driver.findElement(By.id("custom_gender"));
		 if(!customeGenderbutton.isDisplayed()) {
			 driver.findElement(By.xpath("//label[text()='Custom']/input")).click();
		 }
		 customeGenderbutton.sendKeys("Other");
	}

}
