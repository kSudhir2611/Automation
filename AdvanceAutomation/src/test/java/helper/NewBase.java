package helper;


import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class NewBase {
	public WebDriver wd;
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.edge.driver","src\\test\\resources\\resources\\msedgedriver.exe");
	  wd = new EdgeDriver();
	  wd.manage().window().maximize();
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }

  //@AfterTest
  public void afterTest() 
  {
	  
	  wd.quit();
	  
  }

}
