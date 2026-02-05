package org.automation.modularFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	public void  selectByVisibleTextM(WebElement Dropdownelement, String visibleText) 
	
	{
		
	Select sel= new Select(Dropdownelement);
	sel.selectByVisibleText(visibleText);
	
	}

}
