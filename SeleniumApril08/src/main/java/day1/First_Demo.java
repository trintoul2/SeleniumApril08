package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First_Demo {
	public static void main(String[] args) {
		// step-1 open browser
		WebDriver driver = new ChromeDriver(); // Command to open browser
		driver.manage().window().maximize();
		driver.get("https://www.cnbc.com");
		driver.quit();
	}
}
