package day13;

import java.time.Duration;
import day12.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class expedia {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/offers/go-esc-sale/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement bookNow = driver.findElement(By.xpath("//p[contains(text(),'on Hotels & Homestays')]//following::input[1]"));;
		basePage waiting = new basePage(driver);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",bookNow);
		waiting.waitForElement(bookNow,10);
		//driver.wait(2000);
		bookNow.click();
 
		}
	}
/*
Basic Syntax: //tagname[@attributeName='Value']

xpath Operators OR/AND: //input[@type='submit' or @name='login-button']

xpath function: text(): //tagname[text()='text']

Example: //h4[text()='Accepted usernames are:']

Contains() function: //h4[contains(text(),'are')]
*/

