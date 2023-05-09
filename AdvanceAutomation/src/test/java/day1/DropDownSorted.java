package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DropDownSorted extends BaseClass {
  @Test
  public void dropdownSorted() 
  {
	  wd.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement ele = wd.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	  Select country = new Select(ele);
	  
	  List<WebElement> allOption = country.getOptions();
	  
	  ArrayList<String> original = new ArrayList<>();
	  ArrayList<String> temp = new ArrayList<>();
	  
	  for(WebElement dp:allOption) 
	  {
		  original.add(dp.getText());
		  temp.add(dp.getText());
	  }
	  //original list
	  System.out.println("original List :"+original);
	  //temp list
	  System.out.println("temporary list before sorting "+temp);
	  
	  Collections.sort(temp);
	  
	  System.out.println("temporary list after sorting "+temp);
	  
	  if(temp.equals(original)) 
	  {
		  System.out.println("drop-down is sorted");
	  }else {
		  System.out.println("drop-down is not sorted");
	  }
  }
}
