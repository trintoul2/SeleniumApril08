package day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MoreLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		WebElement footNote = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
		System.out.println(footNote);
		footNote = driver.findElement(By.xpath("//h4[contains(text(),'are:')]"));
		
		/* driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebElement Drop = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder' and text()='Select Option']"));
		Drop.click();
		driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue' and text()='Group 1, option 2']")); */
		
		//div[@class=' css-1uccc91-singleValue']
		
		
		/*
		Select Old_Menu = new Select(driver.findElement(By.id("oldSelectMenu")));
		Old_Menu.selectByVisibleText("Blue");
		driver.findElement(By.xpath("//option[@value='4']")).click();
		
		//driver.findElement(By.id("react-select-7-input"));
		// driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]/div[1]/div/div[1]")).click();
		//driver.findElement(By.cssSelector("div.css-12jo7m5")); */
		
		
		//WebElement element= driver.findElement(By.xpath("//*[text()='Select...']"));
		// element.click();
		
		/* Select Select_car = new Select(driver.findElement(By.id("cars")));
		Select_car.selectByValue("volvo");
		Select_car.selectByIndex(3);
		//#selectMenuContainer > div:nth-child(8) > div > div > div > div.css-1hwfws3 > div:nth-child(1) > div > div.css-12jo7m5
		//*[@id="selectMenuContainer"]/div[7]/div/div/div/div[1]/div[1]/div/div[1] */
	}

}
