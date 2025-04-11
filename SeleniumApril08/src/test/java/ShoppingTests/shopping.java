package ShoppingTests;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day11.cartPage;
import day11.checkoutComplete;
import day11.checkoutInfo;
import day11.checkoutOverview;
import day11.loginPage;
import day11.productDetailsPage;
import day11.productsPage;

public class shopping {
	
	WebDriver driver;
	
	@BeforeMethod
	public void before() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void after() {
		//driver.close();
	}
	
	@Test
	public void purchasebackPack() {
		
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
