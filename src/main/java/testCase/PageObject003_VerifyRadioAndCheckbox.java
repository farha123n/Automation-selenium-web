package testCase;

import java.time.Duration;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.P003_VerifycheckboxAndRadiobutton;

public class PageObject003_VerifyRadioAndCheckbox extends DriverSetup {
public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		
		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);
	
		P003_VerifycheckboxAndRadiobutton radio= new P003_VerifycheckboxAndRadiobutton(driver);
		
		radio.clickRadiobutton();
		Thread.sleep(200);
		
		P003_VerifycheckboxAndRadiobutton checkbox= new P003_VerifycheckboxAndRadiobutton(driver);
        checkbox.clickCheckbox();
		Thread.sleep(5000);
		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}

}
