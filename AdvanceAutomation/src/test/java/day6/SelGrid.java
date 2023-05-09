package day6;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelGrid {
	WebDriver wd;
  @Test
  public void exGrid() throws Exception 
  {
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  
	  wd = new RemoteWebDriver(new URL("http://localhost:4444/"),dc);
	  
	  wd.get("https://blazedemo.com/");
	  System.out.println(wd.getTitle());
  }
}
