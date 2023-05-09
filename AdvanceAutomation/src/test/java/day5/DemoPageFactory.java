package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPageFactory {

	public DemoPageFactory(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

	//Repository
	@FindBy (id="input_username")
	WebElement uname;
	@FindBy (id="input_password")
	WebElement pword;
	@FindBy (id="input_go")
	WebElement login;
	@FindBy (xpath="//*[@id=\"navipanellinks\"]/a[2]/img")
	WebElement logout;
	
	WebElement input_username;
	WebElement input_password;
	WebElement input_go;
	
	
	
	//Method
	public void username(String un) 
	{
		//uname.sendKeys(un);
		
		input_username.sendKeys(un);
	}
	
	public void password(String pw) 
	{
		//pword.sendKeys(pw);
		
		input_password.sendKeys(pw);
	}
	
	public void go() 
	{
		//login.click();
		
		input_go.click();
	}
	
	public void loginProcess(String un,String pw) 
	{
		username(un);
		password(pw);
		go();
		logout.click();
	}
}
