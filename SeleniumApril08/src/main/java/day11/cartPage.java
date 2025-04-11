package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	
	WebDriver driver;
	
	public cartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	// 1. elements
	
	@FindBy(name="checkout")
	private WebElement checkOutBtn;
	
	// 2. actions
	
	public void clickCheckout() {
		checkOutBtn.click();
	}

}
