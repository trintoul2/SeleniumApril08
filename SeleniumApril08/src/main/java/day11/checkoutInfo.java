package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutInfo {
	
	WebDriver driver;
	
	public checkoutInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	// 1. elements
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="postalCode")
	private WebElement pCode;
	
	@FindBy(name="continue")
	private WebElement cont;
	
	
	// 2. actions
	
	public void enterInfo() {
		fName.sendKeys("Tom");
		lName.sendKeys("Rintoul");
		pCode.sendKeys("P6B6K3");
		cont.click();


	}
	
	
}
