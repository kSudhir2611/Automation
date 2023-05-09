package day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;

public class DemoWindowHandling extends NewBase
{
  @Test
  public void windowhandleFA() throws InterruptedException {
	  wd.get("http://frontaccounting.squadinfotech.in/index.php");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.name("user_name_entry_field")).sendKeys("fauser13");
	  wd.findElement(By.name("password")).sendKeys("fauser13");
	  
	  Select batch = new Select(wd.findElement(By.name("company_login_name")));
	  batch.selectByIndex(5);
	  
	  wd.findElement(By.name("SubmitUser")).click();
	  
	  //sales quatation entry
	  wd.findElement(By.linkText("Sales Quotation Entry")).click();
	  //parent window id
	  String parentwid = wd.getWindowHandle();
	  System.out.println("parent window id: "+parentwid);
	  Thread.sleep(5000);
	  wd.findElement(By.linkText("4,182,817.73")).click();
	  
	  Set<String> allwid = wd.getWindowHandles();
	  
	  for(String w:allwid) 
	  {
		  wd.switchTo().window(w);
		  System.out.println(wd.getTitle());
		  
		  while(!w.equals(parentwid)) 
		  {
			  Select customer = new Select(wd.findElement(By.id("customer_id")));
			  customer.selectByIndex(1);
			  Thread.sleep(2000);
			  wd.close();
		  }
	  }
	 wd.switchTo().window(parentwid);
  }
}
