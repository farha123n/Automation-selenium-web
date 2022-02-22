package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public static WebDriver driver;
   

	@BeforeSuite
	public static void setDriver() 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\farhan\\Downloads\\chromedriver_win32");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterSuite
	public static void close() 
	{
		driver.close();
		//driver.quit();
	}
}
