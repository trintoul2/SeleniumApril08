package ShoppingTests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day12.cartPage;
import day12.checkoutComplete;
import day12.checkoutInfo;
import day12.checkoutOverview;
import day12.loginPage;
import day12.productDetailsPage;
import day12.productsPage;


public class shoppingChild extends baseTest {
	
	
	@Test
	public void purchasebackPack() throws InterruptedException {
		
		loginPage logintoSite = new loginPage(driver);
		productsPage selectbackPack = new productsPage(driver);
		productDetailsPage productDetails = new productDetailsPage(driver);
		cartPage checkoutCart = new cartPage(driver);
		checkoutInfo enterOrderInfo = new checkoutInfo(driver);
		checkoutOverview finishOrder = new checkoutOverview(driver);
		checkoutComplete successMessage = new checkoutComplete(driver);
		
		logintoSite.enterusername();
		logintoSite.enterpassword();
		logintoSite.clicklogin();
		selectbackPack.clickBackPack();
		productDetails.clickAddtoCart();
		productDetails.clickCartLink();
		checkoutCart.clickCheckout();
		enterOrderInfo.enterInfo();
		finishOrder.clickFinish();
		String confirmationMsg;
		confirmationMsg = successMessage.getSuccessMsg();
		System.out.println(confirmationMsg);
		successMessage.clickBackHome();
		assertEquals(confirmationMsg,"Thank you for your order!");
		
		
	}
	
}

