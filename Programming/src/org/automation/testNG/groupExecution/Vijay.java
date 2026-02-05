package org.automation.testNG.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vijay {

	
	@Test(groups = {"Tamil","PanIndia", "Bollywood"})
	public void launchVijay() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Vijay_(actor)");
	}

}
