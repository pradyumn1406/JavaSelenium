package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepo.BasePage;
import org.pomRepo.CellPhonesPage;
import org.pomRepo.ElectronicsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListner.class)
public class TC_AddToCart_001_TC extends BaseTest {
	
	@Test
	public void addToCartMethod() 
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true, "Product is not added to cart");
	}

}
