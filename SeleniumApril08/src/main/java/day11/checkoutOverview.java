package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverview {
	
	WebDriver driver;
	
	public checkoutOverview(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	// 1 elements
	
	@FindBy(name="finish")
	private WebElement finishBtn;

	
	// 2. actions
	
	public void clickFinish() {
		finishBtn.click();
	}
	

}
