package org.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCssPropertiesInFB {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginbutton = driver.findElement(By.xpath("//button[text ()='Log in']"));
	System.out.println(loginbutton.getCssValue("background-color"));
	System.out.println(loginbutton.getCssValue("color"));
	System.out.println(loginbutton.getCssValue("font-size"));
	System.out.println(loginbutton.getCssValue("line-height"));
}

}
