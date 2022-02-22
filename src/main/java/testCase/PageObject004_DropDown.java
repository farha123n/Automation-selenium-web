package testCase;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.P004_VerifyDropDown;

public class PageObject004_DropDown extends DriverSetup  {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void selectingValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebDriverWait wait =new WebDriverWait(driver, 2000);
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		P004_VerifyDropDown drop= new P004_VerifyDropDown(driver);
		WebElement ele = drop.select1();
		Select allAvailableCars = new Select(ele);
		Thread.sleep(3000);
		allAvailableCars.selectByIndex(1);
		allAvailableCars.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		// deselectAll( ):
		// deselectByValue( )
		// deselectByVisibleText( ):
		// getAllSelectedOptions( ):

		driver.switchTo().defaultContent();
	}
	
	@Test
	public static void selectingMultipleValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		P004_VerifyDropDown drop1= new P004_VerifyDropDown(driver);
		WebElement e =drop1.select1();
		Select s = new Select(e);
		// Select more than one item
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build()
				.perform();
		
		Thread.sleep(3000);
		// Close Site
		
		driver.switchTo().defaultContent();
	}
}