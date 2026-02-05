package org.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
	@FindBy(xpath = "//span[text()='100.00']/../..//input[@value ='Add to cart']") private WebElement cellPhoneAddToCartButton;
	@FindBy(xpath = "//p[contains(text(), 'The product has been added to your ')]") private WebElement prodaddedToCartMsg; 

	public CellPhonesPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCellPhoneAddToCartButton() {
		return cellPhoneAddToCartButton;
	}

	public WebElement getProdaddedToCartMsg() {
		return prodaddedToCartMsg;
	}
}
