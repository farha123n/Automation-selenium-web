package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.P006_Scroll;

public class PageObject006_Scroll extends DriverSetup {
	public static String baseUrl = "https://www.seleniumhq.org";

	@Test
	public static void scrollCheck() throws InterruptedException {
		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		// Scroll to Top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		// Scroll to specific Element
	    P006_Scroll sc= new P006_Scroll(driver);
	    WebElement e=sc.Scroll_In();
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(5000);
	}
}
