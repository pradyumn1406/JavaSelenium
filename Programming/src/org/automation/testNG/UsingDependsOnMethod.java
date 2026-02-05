package org.automation.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingDependsOnMethod {
	
	@Test(dependsOnMethods = {"LaunchingSS","LaunchingPurple"})
	public void LaunchingKalki()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.kalkifashion.com/");
	}
	
	@Test
	public void LaunchingSS()
	{
	WebDriver driver1 = new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.get("https://www.thesouledstore.com/men");
	}
	
	@Test
	public void LaunchingPurple()
	{
	WebDriver driver2 = new ChromeDriver();
	driver2.manage().window().maximize();
	driver2.get("https://www.purplle.com/");
	}


}
