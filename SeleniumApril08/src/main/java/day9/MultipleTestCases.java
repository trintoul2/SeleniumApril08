package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;


public class MultipleTestCases {
	
    @Test (priority=2, groups={"High_Priority"})
	public void incognitoWindow() {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		WebDriver driver = new EdgeDriver(option);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.quit();
		
	}

	@Test (priority=1, dependsOnMethods= {"incognitoWindow"}, timeOut=20000, groups= {"High_Priority"})
	public void scroll() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		
		WebElement submit_Btn = driver.findElement(By.id("submitbtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submit_Btn);
		Thread.sleep(1000);
		driver.quit();
	}
		
	@Test (priority=3)
	public void HandleFrames() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame_element = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame_element);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567");
		driver.switchTo().defaultContent();	
		
	}	

}
