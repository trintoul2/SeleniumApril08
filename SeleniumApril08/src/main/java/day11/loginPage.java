package day11;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
	
	WebDriver driver;

	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
		System.out.println("This is loginPage constructor");

	}
	
	//1. page elements
	
	@FindBy(name="user-name")
	private WebElement username;

	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	//2 page actions
	
	public void enterusername() {	
		//WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
	}
	
	public void enterpassword() {
		pwd.sendKeys("secret_sauce");
	}
	
	public void clicklogin() {
		loginBtn.click();
		System.out.println("This is clicklogin");
	}

}
