package org.automation.modularFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_TC extends BaseClass {
	@Test 
	public void buyProduct() throws EncryptedDocumentException, IOException {
		
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true, "Product is not added to cart");
		
		bp.getShoppingCartLink().click();
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartphoneItem().click();
		scp.getTermsOfService().click();
		scp.getCheckoutButton().click();
		
		String city = Flib.getWorkbookCellValue("buyproductcreds", 1, 0);
		String address1 = Flib.getWorkbookCellValue("buyproductcreds",1, 1);
		String pincode = Flib.getNumericCellValue("buyproductcreds", 1, 2);
	    String contact	= Flib.getNumericCellValue("buyproductcreds", 1, 3);
	     
	    int rn = Flib.generateRandomNo();
	    String phoneNUm = contact+rn;
	    
	    CheckoutPage cop = new CheckoutPage(driver);
	    cop.buyProduct(city, address1, pincode, phoneNUm);
	    
	    OrderCompletedPage ocp = new OrderCompletedPage(driver);
	    ocp.getOrderPlacedMsg();
	     
		
	
		}

}
