package practiceAutomatioTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://automationexercise.com");
	  driver.findElement(By.partialLinkText("Signup / Login")).click();
	  driver.findElement(By.name("name")).sendKeys("Pradyumn");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("paddy.14.rudra@gmail.com");
	  driver.findElement(By.xpath("//button[text()='Signup']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("id_gender1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@data-qa=\"password\"]")).sendKeys("123456789");
	  
	  WebElement daysDropdown = driver.findElement(By.id("days"));
	  Select selectdd= new Select(daysDropdown);
	  selectdd.selectByVisibleText("14");
	  
	  Select selectmm = new Select(driver.findElement(By.id("months")));
	  selectmm.selectByVisibleText("June");
	  
	  Select selectyy= new Select(driver.findElement(By.id("years")));
	  selectyy.selectByVisibleText("2002");
	  
	  //driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	  driver.findElement(By.name("newsletter")).click();
	  
	  //driver.findElement(By.xpath("//input[@name='optin']")).click();
	  driver.findElement(By.name("optin")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("Pradyumn",Keys.ENTER , "Rudrawar" , Keys.ENTER, "Snehagan Residency" , 
			  Keys.ENTER, "Maharshtra",Keys.ENTER, "Pune" , Keys.ENTER, "411057" , Keys.ENTER,"9075554715");
	  
	  driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
	  
	  driver.findElement(By.partialLinkText("Continue")).click();
	  driver.findElement(By.partialLinkText("Delete Account")).click(); 	
	  driver.findElement(By.partialLinkText("Continue")).click();

	}
}
