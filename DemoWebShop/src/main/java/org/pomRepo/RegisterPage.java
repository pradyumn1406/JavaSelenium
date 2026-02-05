package org.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	//Declaration
	@FindBy(id = "gender-male") private WebElement maleRadioButton;
	@FindBy(id = "gender-female") private WebElement femaleRadioButton;
	@FindBy(id = "FirstName") private WebElement firstName;
	@FindBy(id = "Email") private WebElement lastName;
	@FindBy(id = "Password") private WebElement password;
	@FindBy(id = "ConfirmPassword") private WebElement confirmPassword;
	@FindBy(id = "register-button") private WebElement registerButton;
	
	//Initialization
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	
	//Utilization
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	

	
	
}
