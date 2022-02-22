package pageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class P003_VerifycheckboxAndRadiobutton
{
	WebDriver driver = null;

	public P003_VerifycheckboxAndRadiobutton(WebDriver driver)
	{
		this.driver = driver;
	}

	By radio = By.xpath("//body/div[1]/fieldset[1]/label[3]");
	
	 public void clickRadiobutton()
	 {
		 driver.findElement(radio).click();
	 }
	 By checkbox = By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");
	 
	 public void clickCheckbox() 
	 {
		 driver.findElement(checkbox).click();
		 
	 }

}
