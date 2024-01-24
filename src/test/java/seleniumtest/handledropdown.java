package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
WebElement courseNameElement=driver.findElement(By.id("course"));
		
		Select courseName_dd =new Select(courseNameElement);
		courseName_dd.selectByIndex(1);
		driver.manage().window().maximize()
;		
	}
	
	
	
}
