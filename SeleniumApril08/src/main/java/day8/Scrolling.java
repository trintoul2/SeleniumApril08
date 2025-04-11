package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		// driver.get("https://demo.automationtesting.in/Register.html");
		driver.get("https://www.amazon.ca");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		WebElement submitBtn = driver.findElement(By.id("navBackToTop"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);
		Thread.sleep(1000);
		
		
		

	}

}
