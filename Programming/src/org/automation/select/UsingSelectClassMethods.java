package org.automation.select;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UsingSelectClassMethods {
	public static void main(String[] args) {
		 WebDriver	driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/r.php?entry_point=login");
		 WebElement dropDownElementDay = driver.findElement(By.id("day"));
		 
		 Select select = new Select(dropDownElementDay);
		 
		 //Verifying data drop down is single select and multi select
		 if (select.isMultiple()) {
			 System.out.println("Multi Select");
		 }else {
			 System.out.println("Single Select");
		 }
		 
		  //Fetching all the options of the data dropdown
		  List<WebElement> alloptions = select.getOptions();
		  

		  
		  //Select all the options 1 by 1 using selectByVisibleText() in loop 
		  for(WebElement allop : alloptions)
		     {
			  String text = allop.getText();
			  select.selectByVisibleText(text);
			  System.out.println(text);
			 }
		  
		  //Selecting all the options 1 by 1 using selectByIndex() in loop
		  for(int index = 0; index < alloptions.size();index++) {
			  select.selectByIndex(index);
		  }
		  
		  WebElement dropDownMonth = driver.findElement(By.id("month"));
		
		  Select selectMonth = new Select(dropDownMonth);
		  
		  //Fetching all the options of the data dropdown
		  List<WebElement> alloptionsM = selectMonth.getOptions();	
		  
		  //Selecting all the options 1 by 1 using selectByVisibleText() in loop
		  for(WebElement allopMonth : alloptionsM) 
		  {
			  String text = allopMonth.getText();
			  selectMonth.selectByVisibleText(text);
			  System.out.println(text);
		  }
		  

	}


}
