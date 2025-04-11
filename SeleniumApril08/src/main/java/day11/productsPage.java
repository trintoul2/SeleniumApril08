package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	
	WebDriver driver;
	
	public productsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		// this.driver.findElement(By.id("item_4_title_link"));
		System.out.println("This is productsPage constructor");
	}
	//1. Page Elements
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	//2. Page Actions
	
	public void clickBackPack() {
		backPack.click();
	}
	

}
