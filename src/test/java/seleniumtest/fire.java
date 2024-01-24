package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class fire {
public static void main(String[] args) {
	
	ChromeOptions options=new ChromeOptions();
options.setHeadless(true);
	WebDriver driver =new ChromeDriver(options);
	
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.name("email")).sendKeys("pa1.619.pavan@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("zackryder");
	driver.findElement(By.name("login")).click();
	System.out.println(driver.getTitle());
}
	
	
	
	
}
