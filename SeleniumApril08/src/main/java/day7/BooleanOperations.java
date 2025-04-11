package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BooleanOperations {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		boolean visible = driver.findElement(By.id("checkbox1")).isDisplayed();
		System.out.println(visible);
		
		visible= driver.findElement(By.id("checkbox2")).isSelected();  //checkbox or radio button
		System.out.println(visible);
		
		boolean isEnabled = driver.findElement(By.id("checkbox3")).isEnabled();
		System.out.println(isEnabled);
		
	}

}
