package seltestqspider;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitwait {
   @Test
	      void test() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.quit();
		
	}
	
	
	
}
