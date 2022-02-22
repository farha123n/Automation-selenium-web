package pageObject;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

public class P001_LocatorLearning {
	
	WebDriver driver = null;
	
	    public P001_LocatorLearning(WebDriver driver) {
	    	
	    	this.driver =driver;
	    	
	    }
    
	  
	By username= By.id("inputUsername");
	By password= By.name("inputPassword");
	By signinbutton=  By.className("signInBtn");
	By passerror= By.cssSelector("p.error");
	By forgetpassword= By.linkText("Forgot your password?");
	By name= By.xpath("//input[@placeholder='Name']");
	By email= By.cssSelector("input[placeholder='Email']");
	By phonenumber= By.xpath("//input[@type='text'][3]");
	By reset= By.cssSelector(".reset-pwd-btn");
	By fotgetpasswodcontainer= By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]");
	By submit= By.id("chkboxOne");
	By chbox= By.xpath("//button[contains(@class,'submit')]");
	
	public void username1(String text)
	{
		driver.findElement(username).sendKeys(text);
	}
	public void password1(String text)
	{
		driver.findElement(password).sendKeys(text);
	}
	public void signinbutton1()
	{
		driver.findElement(signinbutton).click();
	}
	public void forgetpassword1()
	{
		driver.findElement(forgetpassword).click();
	}
	public String getText()
	{
		return driver.findElement(passerror).getText();
	}
	public void giveName(String text)
	{
		driver.findElement(name).sendKeys(text);
	}
	public void giveEmail(String text)
	{
		driver.findElement(email).sendKeys(text);
	}
	public void givePhonenumber(String text)
	{
		driver.findElement(phonenumber).sendKeys(text);
	}
	public void resetpassword()
	{
		driver.findElement(reset).click();
	}
	public void f_p_c() {
		driver.findElement(fotgetpasswodcontainer).click();
	}
	public void submit()
	{
		driver.findElement(submit).click();
	}
	public void chbox()
	{
		driver.findElement(chbox).click();
	}
	
	

}
