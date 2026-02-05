package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepo.BasePage;
import org.pomRepo.CellPhonesPage;
import org.pomRepo.ElectronicsPage;
import org.pomRepo.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(org.genericLib.MyListner.class)
public class TC_RemoveProdFromCart_002_TC extends BaseTest {
	@Test
	public void removeProductFromCart() throws InterruptedException {
		 BasePage bp = new BasePage(driver);
		 bp.getElectronicsLink().click();
		 
		 ElectronicsPage ep= new ElectronicsPage(driver);
		 ep.getCellPhonesLink().click();
		 
		 CellPhonesPage cpp =new CellPhonesPage(driver);
		 cpp.getCellPhoneAddToCartButton().click();
		 
		 SoftAssert sa =new SoftAssert();
		 sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true ,"Product is not added to cart !");
		 
		 bp.getShoppingCartLink().click();
		 
		 ShoppingCartPage scp =new ShoppingCartPage(driver);
		 scp.removeSmartphone();
		 
		 try
		 {
			 if(scp.getSmartphoneLink().isDisplayed())
			 {
				 Reporter.log("Product is not remove from cart!", true);
			 }
		 }
		catch(Exception e) 
		 
			 {
				 Reporter.log("Product is remove from car! ", true);
			 }
		finally 
		 {
			Reporter.log("The Test case is executed Successfully!", true);
		 }
		 
		 sa.assertAll(); 	 
	}
}
