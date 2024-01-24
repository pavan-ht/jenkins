package seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerts {

	public static void main(String[] args) throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage()
.window().maximize();		
	
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("alertBox")).click();

		
		
		Alert simplealert=driver.switchTo().alert();
		
		simplealert.accept();
	}
	
}
