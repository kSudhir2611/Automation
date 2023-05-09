package day9;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class RegisterPOM {
	
	public WebDriver wd;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions act;
	
	public RegisterPOM(WebDriver driver) 
	{
		this.wd=driver;
	}
	
	By my_Account = By.linkText("My Account");
	By register = By.linkText("Register");
	By first_name = By.id("input-firstname");
	By last_name = By.id("input-lastname");
	By email_id = By.id("input-email");
	By password = By.id("input-password");
	By newsletter = By.id("input-newsletter-yes");
	By chbox = By.name("agree");
	By submit = By.cssSelector("button[type='submit']");
	
	public void setWait(WebDriver driver) 
	{
	act = new Actions(driver);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 js=((JavascriptExecutor) driver);
	}
	
	public void resisterAccount(String fname,String lname,String email, String pword) 
	{
		wd.findElement(my_Account).click();
		wd.findElement(register).click();
		wd.findElement(first_name).sendKeys(fname);
		wd.findElement(last_name).sendKeys(lname);
		wd.findElement(email_id).sendKeys(email);
		wd.findElement(password).sendKeys(pword);
		act.moveToElement(wd.findElement(chbox)).click().perform();
		WebElement myelement = wait.until(ExpectedConditions.visibilityOf(wd.findElement(chbox)));
		js.executeScript("arguments[0].scrollIntoView();", myelement);
		act.moveToElement(myelement).build().perform();
		 wd.findElement(submit).click();
		
		
	}
	
}
