package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		/* driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();  // Pressing enter key
		driver.findElement(By.id("sb_form_q")).clear();
		// driver.quit();
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Hom")).click();
		driver.close();*/
		
		// driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name"));  //1.  tagname#id 2. tagname.className
		driver.findElement(By.cssSelector("div.login-box"));
		String title1 ="Blank";
		title1 = driver.findElement(By.tagName("title")).getText();
		title1 ="Blank";
		System.out.println(title1);
		System.out.println("title");
		
		// driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		//xpath Syntax: //tagname[@attributeName='Value']
		// example "//input[@type='tom' and @value='Cricket']"
		
		// driver.findElement(By.className("btn_action")).click();
	
		// driver.quit();

	}

}
