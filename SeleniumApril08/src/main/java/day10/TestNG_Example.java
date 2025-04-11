package day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_Example extends TestNG_rem {

	/* WebDriver driver;
	
	@BeforeMethod or  @BeforeTest
	public void remove_dubs() {
		driver = new EdgeDriver(); //1
		driver.get("https://demo.automationtesting.in/Alerts.html"); //2
		driver.manage().window().maximize(); //3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));// 4
	}
	
	@AfterMethod or  @AfterTest
	public void Done() {
		driver.quit();
	}
	*/

	@Test
	public void Alerts() throws InterruptedException {
		driver.findElement(By.id("OKTab")).click();
		Thread.sleep(1500);
		//driver.switchTo().alert().accept();
		Alert simple = driver.switchTo().alert();
		simple.accept(); // its like clicking OK
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Thread.sleep(1200);
		Alert conf = driver.switchTo().alert();
		conf.dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Thread.sleep(1200);
		Alert input = driver.switchTo().alert();
		input.sendKeys("Hirva, Tom, Anisha");
		Thread.sleep(1200);
		input.accept(); // 5
		driver.quit();

		
	}
	
	@Test
	public void Incognito() throws InterruptedException {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		driver = new EdgeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        
	}	

}
