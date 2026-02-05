package org.automation.testNG.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jawa {
	@Test
	public void launchingJawa42() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/products/jawa-42");
		org.testng.Reporter.log("Launched Jawa42", true);
		
	}
	@Test
	public void launchingJawa350() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/products/jawa-350-legacy-edition");
		org.testng.Reporter.log("Launched Jawa350", true);
		driver.quit();
	}

}
