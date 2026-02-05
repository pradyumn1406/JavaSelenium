package org.automation.takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenShotOfAWebPage {
	public static void main(String[] args) throws IOException {
		//For Fetching the date and time so we can change the ss name of folder
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/feed/");
		
		//Step 1
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Step 2
		File src = ts.getScreenshotAs(OutputType.FILE);
		 
		//Step 3
		File dest = new File("C:\\Users\\Public\\Pictures\\SS"+timestamp+".png");
		FileHandler.copy(src, dest);
	}

}
