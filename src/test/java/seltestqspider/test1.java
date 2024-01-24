package seltestqspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test1 {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/pavan.ht");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	}
	
	
}
