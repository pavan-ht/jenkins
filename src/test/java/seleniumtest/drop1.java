package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class drop1 {

	public static void main(String[] args) throws Exception {
	ChromeOptions options=new ChromeOptions();
	
	options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement dropdown= driver.findElement(By.id("first"));
		
		Select productdd=new Select(dropdown);
		Thread.sleep(2000);
		productdd.selectByIndex(3);
	}
	
}
