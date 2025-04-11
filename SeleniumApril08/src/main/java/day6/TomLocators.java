  package day6;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TomLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement Skip_Sign = driver.findElement(By.id("btn2"));
		Skip_Sign.click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rintoul");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("899 Lake Street");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("trintoul2@gmail.com");
		
		driver.findElement(By.cssSelector("input.ng-valid-pattern")).sendKeys("7059872388");
		// driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7059872341");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.xpath("//option[@value='Art Design']")).click();
		
		WebElement select_element = driver.findElement(By.cssSelector("select#country"));
		Select select_options = new Select(select_element);
		select_options.selectByValue("Denmark");
		
		driver.findElement(By.xpath("//option[@value='1925']")).click();
		driver.findElement(By.xpath("//option[@value='February']")).click();
		driver.findElement(By.xpath("//option[@value='11']")).click();
		
		driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("password");
		driver.findElement(By.cssSelector("input#secondpassword")).sendKeys("wrongpassword");
		
		driver.findElement(By.id("submitbtn")).click();
		
		//driver.quit();
		
		 
	

	}

}
 