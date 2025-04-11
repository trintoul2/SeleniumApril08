package day14;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWebTable {
	
	static WebDriver driver;

	@BeforeTest
	public void Before() {
		driver = new EdgeDriver(); // ClassName obj = new ClassName();
		driver.get("http://seleniumpractise.blogspot.com/"); //faster
	}	

	@Test
	public static void verifyHeaders() {
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th")); //5
		boolean b = false;
		for(WebElement e: headers) {     //for(dataType Temp: collections)
			if(e.getText().contains("Company"));
			b = true;
		}
		Assert.assertEquals(headers.size(), 5);
		Assert.assertTrue(b); 
	}
}
