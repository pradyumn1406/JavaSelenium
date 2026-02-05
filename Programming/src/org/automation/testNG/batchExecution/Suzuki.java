package org.automation.testNG.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Suzuki {
	@Test
	public void launchinghayabusa(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		org.testng.Reporter.log("Launched Hayabusa", true);
		driver.quit();
	}

}
