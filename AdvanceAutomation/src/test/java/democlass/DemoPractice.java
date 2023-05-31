package democlass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoPractice extends BaseClass   {
//@Test
 public  void mainRegister()
 {
	wd.get("https://parabank.parasoft.com/parabank/admin.htm");
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	wd.findElement(By.linkText("Register")).click();
	wd.findElement(By.id("customer.firstName")).sendKeys("John");
	wd.findElement(By.id("customer.lastName")).sendKeys("Wick");
	wd.findElement(By.id("customer.address.street")).sendKeys("Main Road");
	wd.findElement(By.id("customer.address.city")).sendKeys("Kolhapur");
	wd.findElement(By.id("customer.address.state")).sendKeys("maharashtra");
	wd.findElement(By.id("customer.address.zipCode")).sendKeys("416209");
	wd.findElement(By.id("customer.phoneNumber")).sendKeys("123456");
	wd.findElement(By.id("customer.ssn")).sendKeys("45696");
	wd.findElement(By.id("customer.username")).sendKeys("ksameer1126");
	wd.findElement(By.id("customer.password")).sendKeys("sk@199");
	wd.findElement(By.id("repeatedPassword")).sendKeys("sk@199");
	
	wd.findElement(By.xpath("//input[@value='Register']")).click();
	
 }
 
@Test
public void login() 
{
	wd.get("https://parabank.parasoft.com/parabank/admin.htm");
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	wd.findElement(By.xpath("//input[@name='username']")).sendKeys("ksameer1126");
	wd.findElement(By.xpath("//input[@name='username']")).sendKeys("sk@199");
	wd.findElement(By.xpath("//input[@value='Log In']")).click();
}
	 	
 }


	
	
	
	

	
	
	
	

