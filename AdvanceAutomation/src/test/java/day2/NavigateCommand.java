package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class NavigateCommand extends BaseClass {
  @Test
  public void diffNavigateCommand() 
  {
	  wd.get("https://www.flipkart.com/");
	  WebElement searchbox = wd.findElement(By.name("q"));
	  System.out.println("searchbox displayed: "+searchbox.isDisplayed());
	  System.out.println("searchbox enabled: "+searchbox.isEnabled());
	  System.out.println("searchbox selected: "+searchbox.isSelected());
	  System.out.println("Title of page: "+wd.getTitle());
	  System.out.println("URL of page: "+wd.getCurrentUrl());
	  
	  wd.get("https://www.amazon.in/");
	  System.out.println("Title of page: "+wd.getTitle());
	  System.out.println("URL of page: "+wd.getCurrentUrl());
	  
	  wd.navigate().back();
	  wd.navigate().forward();
	  wd.navigate().refresh();
  }
}
