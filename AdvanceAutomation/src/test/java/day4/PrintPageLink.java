package day4;

import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class PrintPageLink extends BaseClass {
  @Test
  public void printAllLink() throws Exception {
	  wd.get("http://www.deadlinkcity.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  List<WebElement> alllinks = wd.findElements(By.tagName("a"));
	  System.out.println("Number of links: "+alllinks.size());
	  int broken=0,valid=0;
	  for(WebElement e:alllinks) 
	  {
		  String url = e.getAttribute("href");
		  if(url == null || url.isEmpty()) 
		  {
			  continue;
		  }
		  URL links = new URL(url);
		  try 
		  {
			  HttpURLConnection hc = (HttpURLConnection)links.openConnection();
			  
			  hc.connect();
			  
			  if(hc.getResponseCode()>= 400) 
			  {
				  broken++;
				  System.out.println(url+" is broken link "+hc.getResponseCode());
			  }
			  else 
			  {
				  valid++;
				  System.out.println(url+" is valid link "+hc.getResponseCode());
			  }
		  }
		  catch(Exception ex) 
		  {
			  ex.printStackTrace();
		  }
	  }
	  System.out.println("number of valid link: "+valid);
	  System.out.println("number of broken link: "+broken);
	  
  }
}
