package org.automation.testNG.crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarization {
	@Parameters("bname")
	@Test
	public void launchAndNavigate(@Optional("edge") String browserName)
	{
		WebDriver driver = null;
			if (browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();	
		}else if(browserName.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get("https://in.kalkifashion.com/");
		
	}

}
