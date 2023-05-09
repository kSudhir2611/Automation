package day5;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import helper.NewBase;

public class DiffernentJSECommand extends NewBase {
  @Test
  public void differentCommand() 
  {
	  wd.get("https://demo.opencart.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  
	  String domain_name = js.executeScript("return document.domain;").toString();
	  System.out.println("Domain name: "+domain_name);
	  
	  String url = js.executeScript("return document.URL;").toString();
	  System.out.println("Url name: "+url);
	  
	  String title = js.executeScript("return document.title;").toString();
	  System.out.println("title: "+title);
  }
}
