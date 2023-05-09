package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class CheckboxOperation extends BaseClass {
  @Test
  public void clickingMultipleCheckBox() 
  {
	  wd.get("https://www.ironspider.ca/forms/checkradio.htm");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  List<WebElement> allbox = wd.findElements(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input"));
	  System.out.println("number of checkboxes:"+allbox.size());
	  //select all checkbox
	 /* for(int i=0; i<allbox.size();i++) 
	  {
		  allbox.get(i).click();
	  }*/
	  
	  
	  //select first two checkbox
	 /* for(int i=0; i<allbox.size();i++) 
	  {
		  if(i<2)
		  allbox.get(i).click();
	  }*/
	  
	  
	  //selecting last two checkbox
	  /*for(int i=4; i<allbox.size();i++) 
	  {
		  allbox.get(i).click();
	  }*/
	  
	  //selecting middle checkboxes
	  for(int i=2; i<allbox.size()-2;i++) 
	  {
		  allbox.get(i).click();
	  }
  }
}
