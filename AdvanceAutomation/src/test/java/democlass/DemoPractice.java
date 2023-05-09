package democlass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoPractice extends BaseClass   {
@Test(description="printing dropdown")
 public  void mainDemo() throws InterruptedException 
 {
	wd.get("https://www.demoblaze.com/");
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//sign in and log in
	wd.findElement(By.xpath("//li[@class='nav-item']//a[@id='signin2']")).click();
	wd.findElement(By.id("sign-username")).sendKeys("mahohar123");
	wd.findElement(By.id("sign-password")).sendKeys("gari@456");
	wd.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	Alert alert = wd.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	wd.navigate().refresh();
	Thread.sleep(2000);
	wd.findElement(By.xpath("//a[@id='login2']")).click();
	wd.findElement(By.id("loginusername")).sendKeys("manohar123");
	wd.findElement(By.id("loginpassword")).sendKeys("gari@456");
	wd.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	Alert alert1 = wd.switchTo().alert();
	System.out.println(alert1.getText());
	alert.accept();
	
	System.out.println(wd.findElement(By.xpath("nameofuser")).getText());
	wd.findElement(By.xpath("//li[@class='nav-item']//a[@id='logout2']")).click();
	
	
 }
	 	
 }


	
	
	
	

	
	
	
	

