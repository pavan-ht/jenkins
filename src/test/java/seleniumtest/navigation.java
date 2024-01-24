package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("pa1.619.pavan@gmail.com");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.navigate().forward();
	driver.navigate().refresh();	 
	 }
}
