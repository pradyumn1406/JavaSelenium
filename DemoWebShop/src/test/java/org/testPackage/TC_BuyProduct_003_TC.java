package org.testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.genericLib.BaseTest;
import org.genericLib.Flib;
import org.pomRepo.BasePage;
import org.pomRepo.CellPhonesPage;
import org.pomRepo.CheckoutPage;
import org.pomRepo.ElectronicsPage;
import org.pomRepo.OrderCompletedPage;
import org.pomRepo.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(org.genericLib.MyListner.class)
public class TC_BuyProduct_003_TC extends BaseTest {
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
		
		String city = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds",0, 1);
		String address1 = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds",1,1);
		String pincode = Flib.getNumericCellValue(EXCEL_PATH_TEST,"buyproductcreds",1,2);
	    String contact	= Flib.getNumericCellValue(EXCEL_PATH_TEST,"buyproductcreds",1,3);
	     
	    int rn = Flib.generateRandomNo();
	    String phoneNUm = contact+rn;
	    
	    CheckoutPage cop = new CheckoutPage(driver);
	    cop.buyProduct(city, address1, pincode, phoneNUm);
	    
	    OrderCompletedPage ocp = new OrderCompletedPage(driver);
	    ocp.getOrderPlacedMsg();
	     
		
	
		}

}
