package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletedPage {
	//Declarization
	@FindBy(xpath = "//strong[contains(text(), 'Your order has beensuccessfully processed!')]")private WebElement orderPlacedMsg;
	
	
	//Initialization
	public OrderCompletedPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	//Utilization
	public WebElement getOrderPlacedMsg() {
		return orderPlacedMsg;
	}
	
}
