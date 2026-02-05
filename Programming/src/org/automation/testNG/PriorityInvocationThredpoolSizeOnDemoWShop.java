package org.automation.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityInvocationThredpoolSizeOnDemoWShop {
	String url ="https://demowebshop.tricentis.com/";
	String gender = "Male";
	String firstName = "Pradyumn";
	String lastName = "Rudrawar";
	String email ="paddyrudra@gmail.com";
	String password = "Paddy@14";
	@Test(priority = 1)
	public void Register() {

		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(url);
		 
		 driver.findElement(By.linkText("Register")).click();
		 if(gender.equalsIgnoreCase("male")) 
		 {
			 driver.findElement(By.id("gender-male")).click();
		 }
		 else
		 {
			 driver.findElement(By.id("gender-female")).click(); 
		 }
		 driver.findElement(By.id("FirstName")).sendKeys(firstName);
		 driver.findElement(By.id("LastName")).sendKeys(lastName);
		 driver.findElement(By.id("Email")).sendKeys(email);
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		 
		 driver.findElement(By.id("register-button")).click();
		
	}
	@Test (invocationCount = 2, threadPoolSize = 5)
	public void Login() {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(url);
		 
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(email);
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		
	}
}
