package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

		@FindBy(partialLinkText = "Cell phones") private WebElement cellPhonesLink;
		@FindBy(partialLinkText = "Camera, photo") private WebElement camerPhotoLink;
		
		public ElectronicsPage(WebDriver driver) {
			PageFactory.initElements(driver,this );
		}

		public WebElement getCellPhonesLink() {
			return cellPhonesLink;
		}

		public WebElement getCamerPhotoLink() {
			return camerPhotoLink;
		}	
}
