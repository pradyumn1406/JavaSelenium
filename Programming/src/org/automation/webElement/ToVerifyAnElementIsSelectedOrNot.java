package org.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsSelectedOrNot {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement penCB = driver.findElement(By.xpath("//input[@value=\"Pen\" and @name]"));
	WebElement bookCB = driver.findElement(By.xpath("//input[@value=\"Book\" ]"));
	
	System.out.println(penCB.isSelected()? "pen checkbox is selected":"pen checkbox is not selected");
	System.out.println(bookCB.isSelected()? "pen checkbox is selected":"pen checkbox is not selected");

	
	
	}

}
