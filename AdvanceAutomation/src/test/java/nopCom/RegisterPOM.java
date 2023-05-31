package nopCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM 
{
	WebDriver wd;
	
	RegisterPOM(WebDriver wd)
	{
		this.wd=wd;
	}
	
	By male = By.xpath("//input[@value='M']");
	By fmale = By.xpath("//input[@value='F']");
	By firstname = By.id("FirstName");
	By lastname = By.id("LastName");
	By day = By.xpath("//select[@name='DateOfBirthDay']");
	By month = By.xpath("//select[@name='DateOfBirthMonth']");
	By year = By.xpath("//select[@name='DateOfBirthYear']");
	By email = By.name("Email");
	By company = By.xpath("//input[@id='Company']");
	By password = By.id("Password");
	By confirmPass = By.id("ConfirmPassword");
	By register = By.id("register-button");
	
	public void selectGender() 
	{
		wd.findElement(male).click();
		//wd.findElement(fmale).click();
	}
	
	public void enterFirstname(String name) 
	{
		wd.findElement(firstname).sendKeys(name);
	}
	
	public void enterLastname(String lname) 
	{
		wd.findElement(lastname).sendKeys(lname);
	}
	
	public void selectday() 
	{
		Select s = new Select(wd.findElement(day));
		s.selectByIndex(5);
	}
	
	public void selectMonth() 
	{
		Select s = new Select(wd.findElement(month));
		s.selectByVisibleText("May");
	}
	
	public void selectYear() 
	{
		Select s = new Select(wd.findElement(year));
		s.selectByVisibleText("1992");
	}
	
	public void enterEmail(String mail) 
	{
		wd.findElement(email).sendKeys(mail);
	}
	
	public void enterCompany(String cname) 
	{
		wd.findElement(company).sendKeys(cname);
	}
	
	public void enterPassword(String pass) 
	{
		wd.findElement(password).sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cpass) 
	{
		wd.findElement(confirmPass).sendKeys(cpass);
	}
	
	public void clickOnRegister() 
	{
		wd.findElement(register).click();
	}

}
