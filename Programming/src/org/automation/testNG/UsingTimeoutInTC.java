package org.automation.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTimeoutInTC {

	@Test(timeOut = 6000)
	public void launchTrimphTiger() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcycles.in/");
	}
}
