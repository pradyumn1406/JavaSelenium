package org.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTheAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passTextBox = driver.findElement(By.id("passContainer"));
		
		//Fetching the size and location of both element
		Dimension emailTBSize = emailTextBox.getSize();
		Dimension passTBSize = passTextBox.getSize();
		Point emailTBLoc = emailTextBox.getLocation();
		Point passTBLoc = passTextBox.getLocation();
		
		
		//Verifying left alignment
		if(emailTBLoc.getX() == passTBLoc.getX())
			System.out.println("Left alignment is proper");
		else
			System.out.println("Left alignment is not proper");
		
		//Verifying Overlapping Issue
		if(passTBLoc.getY()-(emailTBLoc.getY()+emailTBSize.getHeight())>0)
			System.out.println("Element are not overlaped");
		else
			System.out.println("Element are overlaped");
		
		//Verifying Right alignment
		if(emailTBLoc.getX()+emailTBSize.getWidth() == passTBLoc.getX()+passTBSize.getWidth())
			System.out.println("Right alignment is proper");
		else
			System.out.println("Right alignment is not proper");


			
		 
		
		

	}

}
