package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiccontrols {

	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	driver.manage().window().maximize();	
		driver.manage().window().minimize();
		driver.findElement(By.id("firstName")).sendKeys("pavan");
		
		driver.findElement(By.id("femalerb")).click();
	
	}
}
