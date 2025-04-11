package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends basePage {
	
	
	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	// 1. elements
	
	@FindBy(name="checkout")
	private WebElement checkOutBtn;
	
	// 2. actions
	
	public void clickCheckout() {
		clickElement(checkOutBtn,4);
	}

}
