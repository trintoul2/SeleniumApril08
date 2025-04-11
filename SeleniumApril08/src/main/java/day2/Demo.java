package day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // step 1 open browser
		
		int x=100;  //cooker x = rice
		String name1="hirva";
		long  y = 400000000;
		float z = 5.4f;
		double d = 543.67;  //BSIL FD char
		char t = 'C';
		boolean b = true;
		byte bt = 44;  // 0 to 127
		byte bt2 = (byte) x;
		
		
		WebDriver driver = new EdgeDriver(); // Command to open browser
		WebDriver driver_chrome = new ChromeDriver(); // Command to open browser
		driver.manage().window().maximize();
		// driver.close();
		// driver.quit();
		driver.get("https://www.cnbc.com");
		driver_chrome.get("https://www.cnbc.com");
		
	}

}
