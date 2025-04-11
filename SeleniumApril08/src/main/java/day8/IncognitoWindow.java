package day8;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class IncognitoWindow {

	public static void main(String[] args) {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}

}
