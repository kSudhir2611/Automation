package day4;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class OrangeHRM  {
	public WebDriver wd;
  @Test
  public void hrmLogin() throws Exception {
	  Properties prop = new Properties();
	  prop.load(new FileInputStream("src\\test\\resources\\DemoProperty\\Orange.property"));
	  
	  System.setProperty(prop.getProperty("chrkey"), prop.getProperty("cpath"));
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get(prop.getProperty("url"));
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  getLocator(prop.getProperty("uname")).sendKeys(prop.getProperty("unamevalue"));
	  getLocator(prop.getProperty("pword")).sendKeys(prop.getProperty("pwordvalue"));
	  getLocator(prop.getProperty("login")).click();
	  Thread.sleep(5000);
	  getLocator(prop.getProperty("drp")).click();
	  getLocator(prop.getProperty("logout")).click();
	  
  }
  
  public WebElement getLocator(String element) 
  {
	  WebElement e = null;
	  
	  String locvalue = element.split(":=")[0];
	  String loctype = element.split(":=")[1];
	  
	  if(loctype.equalsIgnoreCase("id"))
		  e=wd.findElement(By.id(locvalue));
	  if(loctype.equalsIgnoreCase("name"))
		  e=wd.findElement(By.name(locvalue));
	  if(loctype.equalsIgnoreCase("id"))
		  e=wd.findElement(By.id(locvalue));
	  if(loctype.equalsIgnoreCase("xpath"))
		  e=wd.findElement(By.xpath(locvalue));
	  if(loctype.equalsIgnoreCase("cssSelector"))
		  e=wd.findElement(By.cssSelector(locvalue));
	  if(loctype.equalsIgnoreCase("className"))
		  e=wd.findElement(By.className(locvalue));
	  if(loctype.equalsIgnoreCase("linkText"))
		  e=wd.findElement(By.linkText(locvalue));
	return e;
	  
  }
}
