package testCase;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.P001_LocatorLearning;

public class PageObject001_LocatorLearing extends DriverSetup {

static String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void  locatorLearning() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		P001_LocatorLearning locator= new P001_LocatorLearning(driver);
		 locator.username1("mohosi");
		Thread.sleep(2000);
		
	     locator.password1("passwordField");
		Thread.sleep(2000);
		
		locator.signinbutton1();
		Thread.sleep(2000);
		String getText=(String) locator.getText();
		System.out.println(getText);
		
		
		Thread.sleep(2000);
		locator.forgetpassword1();
        
		Thread.sleep(2000);
		
		locator.giveName("papel");
		locator.giveEmail("papel.gmail.com");
		locator.givePhonenumber("01788074113");
		Thread.sleep(2000);
		
		
        locator.resetpassword();
		Thread.sleep(2000);
		locator.f_p_c();

		
		String password=getPassword(driver);
			
	
		Thread.sleep(2000);
		
		locator.username1("mohosi");
		Thread.sleep(2000);
		
		locator.password1(password);
		Thread.sleep(2000);
		
		locator.submit();
		
		locator.chbox();
		Thread.sleep(2000);
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] passwordArray=passwordText.split("'");
		//String [] passwordArray2=passwordArray[1].split("'");
		//String password=passwordArray2[0];
		
		String password=passwordArray[1].split("'")[0];
		
		return password;
		
	}
	
}
