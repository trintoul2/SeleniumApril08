package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutComplete {
	
	WebDriver driver;
	
	public checkoutComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	// 1. elements

	@FindBy(className="complete-header")
	private WebElement successMsg;
	
	@FindBy(name="back-to-products")
	private WebElement backHomeBtn;
	
	
	//2. actions
	
	public String getSuccessMsg() {
		return successMsg.getText();
	}
	
	public void clickBackHome() {
		backHomeBtn.click();
	}
}
