package Grid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class ChromeTest extends DemoGrid {
  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  wd = initializeBrowser("chrome");
  }
	
	
	@Test
  public void function() 
 {
		wd.get("https://blazedemo.com/");
		WebElement ele = wd.findElement(By.name("fromPort"));
		Select drp = new Select(ele);
		List<WebElement>city = drp.getOptions();
		for(WebElement cityname:city) 
		{
			String name = cityname.getText();
			System.out.println(name);
		}
		
		
 }
  

  @AfterMethod
  public void afterMethod() 
  {
	  wd.quit();
  }

}
