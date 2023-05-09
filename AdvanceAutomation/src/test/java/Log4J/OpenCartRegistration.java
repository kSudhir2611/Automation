package Log4J;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class OpenCartRegistration extends BaseClass
{
	public Properties prop;
  @Test
  public void registerUser() throws FileNotFoundException, IOException 
  {
	  prop = new Properties();
	  prop.load(new FileInputStream("src\\test\\resources\\DemoProperty\\phptravel.property"));
	  
	  wd.get(prop.getProperty("url"));
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  getLocator(prop.getProperty("fname")).sendKeys("sam");
	  getLocator(prop.getProperty("lname")).sendKeys("pedro");
	  getLocator(prop.getProperty("phone")).sendKeys("1356565");
	  getLocator(prop.getProperty("mail")).sendKeys("sammpedro@gmail.com");
	  getLocator(prop.getProperty("pass")).sendKeys("samp@156");
	  //getLocator(prop.getProperty("captcha")).click();
	  getLocator(prop.getProperty("signup")).click();
	  
	  
  }
  public WebElement getLocator(String element) 
  {
	  WebElement e= null;
	  String locvalue=element.split(":=")[0];
	  String loctype=element.split(":=")[1];
	  
	  if(loctype.equals("name"))
		  e=wd.findElement(By.name(locvalue));
	  else if(loctype.equals("xpath"))
		  e=wd.findElement(By.xpath(locvalue));
	  else if(loctype.equals("id"))
		  e=wd.findElement(By.id(locvalue));
	return e;
	  
  }
}
