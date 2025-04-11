package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage {
	
	WebDriver driver;
	
	public productDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
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
		shoppingCart.click();
		
	}
	
}
