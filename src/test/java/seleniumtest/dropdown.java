package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws Exception {
		
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
	
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement courseelement= driver.findElement(By.id("course"));
		
		Select coursedd=new Select(courseelement);
		
		coursedd.selectByIndex(3);
		
		Thread.sleep(3000);
		
		coursedd.selectByValue("net");
		
		
	}
	
	
}
