package seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandles {

	
	public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		
		String parenthandle= driver.getWindowHandle();
		System.out.println("parent-"+parenthandle);
		
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles= driver.getWindowHandles();
		 for (String handle : handles) {
			System.out.println(handle);
		}
	Thread.sleep(3000);
	driver.quit();
	}
	
	
}
