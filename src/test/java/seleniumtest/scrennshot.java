package seleniumtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrennshot {
public static void main(String[] args) throws IOException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File file=ts.getScreenshotAs(OutputType.FILE);
	
   FileUtils.copyFile(file,new File("./screen/image1.png"));
   
   driver.quit();
	
}
	
	
}
