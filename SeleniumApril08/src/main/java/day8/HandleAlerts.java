package day8;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Thread.sleep(1500);
		
		driver.findElement(By.id("OKTab")).click();
		Thread.sleep(1500);
		//driver.switchTo().alert().accept();
		Alert simple = driver.switchTo().alert();
		simple.dismiss(); // its like clicking OK
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Thread.sleep(1200);
		Alert confirmation = driver.switchTo().alert();
		confirmation.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Thread.sleep(1200);
		Alert inputAlert = driver.switchTo().alert();
		inputAlert.sendKeys("Hirva, Tom, Anisha");
		Thread.sleep(1200);
		inputAlert.accept();
		
		// driver.quit();
		

	}

}
