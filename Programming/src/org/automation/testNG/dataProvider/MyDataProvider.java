package org.automation.testNG.dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataProvider {
	
	@DataProvider(name = "credentials")
	public String [] [] data() {
		String [] [] data = { {"paddy@gmail.com","1234"},{"daddy@gmail.com","5678"},{"teddy@gmail.com","910123"} };
		return data;
		
	}
	
	
	@Test(dataProvider = "credentials" ,dataProviderClass = org.automation.testNG.dataProvider.MyDataProvider.class)
	public void login(String Email, String Password) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
	}

}
