package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage {
	
	//WebDriver driver;

	public productsPage(WebDriver driver) {
		// PageFactory.initElements(driver, this);
		// this.driver=driver;
		//System.out.println("This is productsPage constructor");
		super(driver);
	}
	
	//1. Page Elements
	
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	//2. Page Actions
	
	public void clickBackPack() {
//		WebElement backPack;
//		backPack = driver.findElement(By.id("item_4_title_link"));
		clickElement(backPack,3);
	}
	

}
