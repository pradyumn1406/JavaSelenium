package org.pomRepo;

import org.genericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	// Declaratization
	@FindBy(id = "billing-address-select")
	private WebElement newAddressDD;
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryID;
	@FindBy(id = "billing-address-select")
	private WebElement newAddress;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement adress1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@value='Continue' and @onclick=\"Billing.save()\"]")
	private WebElement adressContinue;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingAdressContinue;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethod;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethod;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfo;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;

	// Initiallization
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getCountryID() {
		return countryID;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAdress1TB() {
		return adress1TB;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAdressContinue() {
		return adressContinue;
	}

	public WebElement getShippingAdressContinue() {
		return shippingAdressContinue;
	}

	public WebElement getShippingMethod() {
		return shippingMethod;
	}

	public WebElement getPaymentMethod() {
		return paymentMethod;
	}

	public WebElement getPaymentInfo() {
		return paymentInfo;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getNewAddress() {
		return newAddress;
	}

	// Operational Method/Business Logic
	public void buyProduct(String city, String adress1, String pinCode, String phoneNo) {
		SelectUtility su = new SelectUtility();
		try {
			if (newAddressDD.isDisplayed()) {
				su.selectByVisibleTextM(newAddressDD, "New Address");
			}
		} catch (Exception e) {
			su.selectByVisibleTextM(countryID, "India");
		}
		su.selectByVisibleTextM(countryID, "India");
		cityTB.sendKeys(city);
		adress1TB.sendKeys(adress1);
		zipCode.sendKeys(pinCode);
		phoneNumber.sendKeys(phoneNo);
		adressContinue.click();
		shippingAdressContinue.click();
		shippingMethod.click();
		paymentMethod.click();
		paymentInfo.click();
		confirmOrder.click();

	}

}
