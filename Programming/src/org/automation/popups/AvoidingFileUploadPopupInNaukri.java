package org.automation.popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingFileUploadPopupInNaukri {
	public static void main(String[] args) throws IOException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[contains(text(),'experience')]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\Downloads\\Pradyumn_Rudrawar_CV-1.pdf");
		
	}

}