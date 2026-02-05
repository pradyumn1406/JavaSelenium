package org.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerfyAnElementIsEnabledOrNot {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement tb1 = driver.findElement(By.id("textbox1"));
	System.out.println(tb1.isEnabled()?"tb1 is Enabled":"tb1 is disabled");
	WebElement tb2 = driver.findElement(By.id("tb2"));
	System.out.println(tb2.isEnabled()?"tb2 is Enabled":"tb2 is disabled");
}
}
