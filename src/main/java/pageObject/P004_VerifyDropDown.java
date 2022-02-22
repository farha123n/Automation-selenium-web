package pageObject;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class P004_VerifyDropDown {
       
	WebDriver driver =null;
	
	public P004_VerifyDropDown(WebDriver driver)
	{
		this.driver= driver;
	}
	By name= By.name("cars");
	
	public WebElement select1() {
		
		return driver.findElement(name);
	}
}
