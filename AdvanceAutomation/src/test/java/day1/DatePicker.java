package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DatePicker extends BaseClass {
  @Test
  public void handlingDatePicker() 
  {
	  wd.get("https://fengyuanchen.github.io/datepicker/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  String month = "November";
	  String year = "2023";
	  String date = "26";
	  
	  wd.findElement(By.name("date")).click();
	  while(true) 
	  {
		  String my = wd.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]")).getText();
		  String[] monthyear = my.split(" ");
		  if(monthyear[0].equalsIgnoreCase(month)&& monthyear[1].equalsIgnoreCase(year)) 
		  {
			  break;
		  }
		  else 
		  {
			  wd.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[3]")).click();
		  }
	  }
	  List<WebElement> alldate=wd.findElements(By.xpath("/html/body/div[3]/div[3]/ul[3]/li"));
	  for(WebElement ele:alldate) 
	  {
		  String dt = ele.getText();
		  if(dt.equals(date)) 
		  {
			  ele.click();
			  break;
		  }
	  }
  }
}
