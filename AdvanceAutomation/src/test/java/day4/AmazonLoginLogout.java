package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class AmazonLoginLogout {
  @Test
  public void loginAndLogout() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "src\\\\test\\\\resources\\\\resources\\\\chromedriver.exe"); 
	  WebDriver wd = new ChromeDriver(); 
	    wd.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e"); 
	     wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	     wd.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click(); 
	     wd.findElement(By.name("email")).sendKeys("9096823796"); 
	     wd.findElement(By.id("continue")).click(); 
	     wd.findElement(By.name("password")).sendKeys("test1234"); 
	     wd.findElement(By.id("signInSubmit")).click(); 
	     
//	     wd.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click(); 
//	    // wd.findElement(By.linkText("Sign Out")).click(); 
//	     Thread.sleep(2000); 
//	     wd.findElement(By.xpath("//*[@id=\"nav-item-signout\"]")).click(); 
	     Actions a= new Actions(wd); 
	        WebElement ele=wd.findElement(By.xpath("//*[@id='nav-link-accountList']")); 
	        a.moveToElement(ele).build().perform(); 
	 
	 
	 
	        wd.findElement(By.xpath(".//*[@id='nav-al-your-account']")); 
	        Thread.sleep(3000); 
	        wd.findElement(By.xpath("//*[@id=\"nav-item-signout\"]")).click(); 
	      
	   } 
  }

