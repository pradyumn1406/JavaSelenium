package org.automation.webElement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnteredInFB {
	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 String email = "paddy.14.rudra@gmail.com";
	 WebElement emailTextbox = driver.switchTo().activeElement();
	 emailTextbox.clear();
	 emailTextbox.sendKeys(email);
	 String enteredEmail = emailTextbox.getAttribute("value");
	 
	 if (email.equals(enteredEmail)) {
		 System.out.println("Email has been entered sucessfully");
		}else {
			System.out.println("Email has not entered properly");
		}
	}

}
