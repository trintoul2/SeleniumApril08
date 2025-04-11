package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropDowns {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		/*driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select dropDown = new Select(skills);
		dropDown.selectByValue("Art Design");
		dropDown.selectByIndex(13);
		dropDown.selectByVisibleText("AutoCAD");*/
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select selection = new Select(driver.findElement(By.id("cars")));
		selection.selectByVisibleText("Audi");
		// selection.selectByIndex(0);
		// selection.selectByIndex(1);
		//selection.deselectByValue("audi");
		//selection.deselectAll();
		
		boolean ismulti = selection.isMultiple();
		System.out.println(ismulti);
		
		List<WebElement> getallselect = selection.getAllSelectedOptions();
		System.out.println(getallselect);
		System.out.println("   ");
		List<WebElement> getAllOptions = selection.getOptions();
		System.out.println(getAllOptions);
		
		// driver.quit();
		
		

	}

}
