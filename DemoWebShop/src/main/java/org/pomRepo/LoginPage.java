package org.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(partialLinkText = "Log in")private WebElement logInLink;
	@FindBy(id = "Email")private WebElement logInEmailTB;
	@FindBy(id = "Password")private WebElement logInPassword;
	@FindBy(xpath = "//input[@value = 'Log in']")private WebElement logInButton;
	
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogInLink() {
		return logInLink;
	}

	public WebElement getLogInEmailTB() {
		return logInEmailTB;
	}

	public WebElement getLogInPassword() {
		return logInPassword;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}	
	

	
	
	

}
