package day12;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class loginPage extends basePage {
	
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	//1. page elements	
	
	@FindBy(name="user-name")
	private WebElement username;

	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	//2 page actions
	
	public void enterusername() throws InterruptedException {
		sendText(username,"standard_user",3);
		Thread.sleep(2000);
		//username.sendKeys("standard_user");
	}
	
	public void enterpassword() {
		sendText(pwd,"secret_sauce",4);
		//pwd.sendKeys("secret_sauce");
	}
	
	public void clicklogin() {
		clickElement(loginBtn,3);
		//loginBtn.click();
	}

}
