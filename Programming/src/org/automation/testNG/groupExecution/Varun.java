package org.automation.testNG.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Varun {
	@Test(groups = {"Bollywood"})
	public void launchVarun() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Varun_Dhawan");
	}

}
