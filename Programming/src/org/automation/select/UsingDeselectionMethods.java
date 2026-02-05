package org.automation.select;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement multiDropdown = driver.findElement(By.id("multiselect1"));
		
		Select select =  new Select(multiDropdown);
		if(select.isMultiple()) 
		{
			System.out.println("Is a multi select");
		}else 
		{
			System.out.println("It is a single select");
		}
		
		  List<WebElement> allOptions = select.getOptions();
		  
		  for(WebElement option : allOptions) 
		  {
			  String text =option.getText();
			  select.selectByVisibleText(text);
		  }
		  
		  Thread.sleep(2000);
		  //Deselect an option based on index
		  select.deselectByIndex(1);
		  Thread.sleep(2000);
		  //Deselect an option based on ByVisibleText
		  select.deselectByVisibleText("Audi");
		  Thread.sleep(2000);
		  //Select an option based on ByVisibleText
		  select.selectByVisibleText("Volvo");
		  Thread.sleep(2000);
		  //Deselect an option based on ByValue
		  select.deselectByValue("volvox");
		  Thread.sleep(2000);
		  //Deselecting all the options
		  select.deselectAll();
		
		
	}

}
