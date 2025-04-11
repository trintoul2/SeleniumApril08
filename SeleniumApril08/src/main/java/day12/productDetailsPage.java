package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends basePage {
	
	
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	//1. Page Elements

	@FindBy(id="add-to-cart")
	private WebElement addtoCart;
	
	@FindBy(css="a.shopping_cart_link")
	private WebElement shoppingCart;
	
	//2. Page Actions
	
	public void clickAddtoCart() {
		addtoCart.click();
	}
		
	public void clickCartLink() {
		clickElement(shoppingCart,3);
		
	}
	
}
