package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlatShopPOM
{
	WebDriver wd;
	
	public FlatShopPOM(WebDriver driver) 
	{
		this.wd=driver;
	}
   
	By register = By.xpath("//a[@class='btn wd-switch-to-register']");
	By firstName = By.id("reg_billing_first_name");
	By lastname = By.id("reg_billing_last_name");
	By email = By.name("email");
	By pass = By.id("reg_password");
	By reg = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[5]/button");
	
	public void clickOnRegisterButton() 
	{
		wd.findElement(register).click();
	}
	
	public void enterFirstname(String name) 
	{
		wd.findElement(firstName).sendKeys(name);
	}
	
	public void enterLastname(String surname) 
	{
		wd.findElement(lastname).sendKeys(surname);
	}
	
	public void enterEmail(String emailId) 
	{
		wd.findElement(email).sendKeys(emailId);
	}
	
	public void enterPassword(String password) throws InterruptedException 
	{
		wd.findElement(pass).sendKeys(password);
		Thread.sleep(3000);
	}
	
	public void register() 
	{
		wd.findElement(reg).click();
	}
}

