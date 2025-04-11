package day8;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class HandleScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		// 1. take a screenshot 2. save this screen to some location in some format
		TakesScreenshot screen_shot = (TakesScreenshot) driver;
		File source_file = screen_shot.getScreenshotAs(OutputType.FILE);
		
		//the destination for the screenshot
		File dest_file = new File("MyscreenShot.png");
		
		// Copy the screenshot to the destination
		FileUtils.copyFile(source_file, dest_file);
		        
		driver.quit();

	}

}
