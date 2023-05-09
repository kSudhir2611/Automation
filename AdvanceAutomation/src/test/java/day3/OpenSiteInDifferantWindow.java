package day3;

import java.time.Duration;


import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import helper.NewBase;

public class OpenSiteInDifferantWindow extends NewBase
{
  @Test(priority=1)
  public void switchingWindow() 
  {
	  wd.get("https://demo.opencart.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println(wd.getTitle());
	  
	  wd.switchTo().newWindow(WindowType.WINDOW);
	  
	  wd.get("https://www.flipkart.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println(wd.getTitle());
  }
  
  
  @Test(priority=2)
  public void switchtab() 
  {
	  wd.get("https://demo.opencart.com/");
	  System.out.println(wd.getTitle());
	  
	  wd.switchTo().newWindow(WindowType.TAB);
	  
	  wd.get("https://www.flipkart.com/");
	  System.out.println(wd.getTitle());
  }
}
