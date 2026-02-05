package org.automation.testNG.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HarleyDavidson {
	@Test
	public void launchingHDX() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/motorcycles/2025/x-440.html?color=f41b");
		org.testng.Reporter.log("Launched HDX", true);
		driver.quit();
		
	}

}
	