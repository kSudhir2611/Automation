package DemoPFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.JavaScriptExeUTIL;

public class DemoOpencart 
{
	WebDriver wd;
	public DemoOpencart(WebDriver driver) 
	{
		wd = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="input-firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement surname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(name="password")
	WebElement passwrd;
	
	@FindBy(xpath="//input[@id='input-newsletter-yes']")
	WebElement suscribe;
	
	@FindBy(name="agree")
	WebElement chbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void enterFirstname(String name) 
	{
		firstname.sendKeys(name);
	}
	
	public void enterLastname(String sname) 
	{
		surname.sendKeys(sname);
	}
	
	public void enterEmail(String mail) 
	{
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) 
	{
		passwrd.sendKeys(pass);
	}
	
	public void checkSuscribe() 
	{
		JavaScriptExeUTIL.clickByjs(wd, suscribe);
	}
	
	public void toggleOnCheckbox() 
	{
		JavaScriptExeUTIL.clickByjs(wd, chbox);
	}
	
	public void clickOnContinue() 
	{
		JavaScriptExeUTIL.clickByjs(wd, submit);
	}
}
