package org.automation.select;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingGetAllSelectedOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nares_321ks4m/Downloads/Bikes.html");
		WebElement dropdown = driver.findElement(By.id("Bikes"));
			Select select = new Select(dropdown);
			select.selectByIndex(4);
			select.selectByVisibleText("Hero Xpulse");
			select.selectByValue("yrx");
			//logic to fetch all options
			List<WebElement> allOptions = select.getOptions();
			System.out.println("========= Options ==========");
			for(WebElement option : allOptions)
			{
				System.out.println(option.getText());
			}
			
			//logic to fetch selected options
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			System.out.println();
			System.out.println("====== Selected Options =======");
			for( WebElement option : selectedOptions)
			{
				System.out.println(option.getText());
			}
			
			//logic to get unselected options
			allOptions.removeAll(selectedOptions);
			System.out.println();
			System.out.println("====== Unselected Options =======");
			for(WebElement option : allOptions)
			{
				System.out.println(option.getText());
			}
			
			System.out.println();
			
			//fetching first selected option
			System.out.print("First Selected Option : ");
			System.out.println(select.getFirstSelectedOption().getText());
	}

}
