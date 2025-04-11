package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
 
public class HandleMultiFrames {

	WebDriver driverF;

	
	public static void main(String[] args) throws InterruptedException {

		HandleMultiFrames Framer = new HandleMultiFrames();
		Framer.driverF = new EdgeDriver();
		Framer.driverF.get("https://demo.automationtesting.in/Frames.html");
		// driver.manage().window().maximize();
		Framer.driverF.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		// WebElement frame = driver.findElement(By.id("singleframe"));
		Framer.driverF.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement Parent_frame = Framer.driverF.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		Framer.driverF.switchTo().frame(Parent_frame);

		Framer.Switch_frame(Framer.driverF);
		
		Framer.driverF.switchTo().frame(Parent_frame);
		Framer.Switch_frame_B(Framer.driverF);
				
		//driver.quit();
	}

		void Switch_frame(WebDriver driver) throws InterruptedException {
			WebElement Child_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(Child_frame);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).clear();
			driver.switchTo().defaultContent();

			//driver.close();
		}
		
		void Switch_frame_B(WebDriver driver) {
			// driver.findElement(By.linkText("Iframe with in an Iframe")).click();
			//WebElement Parent_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			// driver.switchTo().frame(Parent_frame);
			WebElement Child_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(Child_frame);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDERFGTY");
			driver.switchTo().defaultContent();
		}


}
