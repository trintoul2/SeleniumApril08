package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutInfo extends basePage {
	
	
	public checkoutInfo(WebDriver driver) {
		super(driver);
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
	
	public void enterInfo() throws InterruptedException {
		sendText(fName,"Tom",3);
		sendText(lName,"Rintoul",3);
		sendText(pCode,"P6B6K3",3);
		Thread.sleep(2000);
		clickElement(cont,4);

	}
	
	
}
