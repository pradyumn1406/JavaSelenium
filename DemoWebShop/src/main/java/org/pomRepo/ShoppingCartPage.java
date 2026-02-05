package org.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//Declarization
	@FindBy(xpath = "//a[text()='Smartphone' ]/../..//input[@type=\"checkbox\"]") private WebElement smartphoneItem;
	@FindBy (name = "updatecart") private WebElement updateCartButton;
	@FindBy(name = "continueshopping") private WebElement continueShopping;
	@FindBy(name = "termsofservice") private WebElement termsOfService;
	@FindBy(id = "checkout") private WebElement checkoutButton;
	@FindBy(xpath = "(//a[text()='Smartphone'])[2]") private WebElement smartphoneLink;
	
	//Initialization
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getSmartphoneItem() {
		return smartphoneItem;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getTermsOfService() {
		return termsOfService;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getSmartphoneLink() {
		return smartphoneLink;
	}
	
	
	public void removeSmartphone() throws InterruptedException{
		smartphoneItem.click();
		Thread.sleep(5000);
		updateCartButton.click();
		
	}
}
