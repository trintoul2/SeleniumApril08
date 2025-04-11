package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverview extends basePage {
	

	
	public checkoutOverview(WebDriver driver) {
		super(driver);
	}
	
	
	// 1 elements
	
	@FindBy(name="finish")
	private WebElement finishBtn;

	
	// 2. actions
	
	public void clickFinish() {
		clickElement(finishBtn,4);
	}
	
}
