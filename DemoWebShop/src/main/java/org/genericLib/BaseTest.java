package org.genericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomRepo.BasePage;
import org.pomRepo.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameworkConstraints {
	public static WebDriver driver;
	
	
	@BeforeClass
	public void browserSetup() {
		String browserValue =Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"chrome");
		String url =Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"url");
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void logIn() 
	{
		
		String email =Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"email");
		String password =Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"password");
		
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		
		 LoginPage lp = new LoginPage(driver);
		 lp.getLogInEmailTB().sendKeys(email);
		 lp.getLogInPassword().sendKeys(password);
		 lp.getLogInButton().click();
		
		/*driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();*/
	}
	
	@AfterMethod
	public void logOut()
	{
		 BasePage bp = new BasePage(driver);
		 bp.getLogOutLink().click();
		 
		//driver.findElement(By.linkText("Log out")).click();
	}
	
	
	@AfterClass
	public void browserTearDown() 
	{
		driver.quit();
	}	

}
