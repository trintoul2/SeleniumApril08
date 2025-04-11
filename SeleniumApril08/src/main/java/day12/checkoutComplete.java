package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class checkoutComplete extends basePage {
	
	
	public checkoutComplete(WebDriver driver) {
		super(driver);
	}
	
	
	// 1. elements

	@FindBy(className="complete-header")
	private WebElement successMsg;
	
	@FindBy(name="back-to-products")
	private WebElement backHomeBtn;
	
	
	//2. actions
	
	public String getSuccessMsg() {
		return getMsg(successMsg,4);
	}
	
	public void clickBackHome() {
		clickElement(backHomeBtn,4);
	}
}
