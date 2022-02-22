package pageObject;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class P006_Scroll {

	WebDriver driver=null;
	public P006_Scroll(WebDriver driver) {
		
		this.driver=driver;
		
	}
	By name= By.xpath("//body/div[1]/main[1]/div[3]/div[2]/a[1]/img[1]");
	
	public WebElement Scroll_In()
	{
		
		 return  driver.findElement(name);
	}
	
}
