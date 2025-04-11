package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class fileUpload {

	@Test
	public void upload() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); // page loading will take 
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement e = driver.findElement(By.xpath("//input[@type='file']"));
		e.sendKeys("C:\\Users\\trint\\OneDrive\\Pictures\\Saved Pictures\\20210807_100256.jpg"); // Modify this path before running this program
		//driver.quit();
	}

}
