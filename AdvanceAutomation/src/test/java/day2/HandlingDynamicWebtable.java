package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class HandlingDynamicWebtable extends BaseClass {
  @Test
  public void handleWebtablePagination() throws Exception 
  {
	  wd.get("https://demo.opencart.com/admin/index.php");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 
	  //login
	  wd.findElement(By.name("username")).sendKeys("demo");
	  wd.findElement(By.id("input-password")).sendKeys("demo");
	  wd.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
	  
	  wd.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
	  wd.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")).click();
	  
	  String text = wd.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[2]")).getText();
	  System.out.println(text);//Showing 41 to 45 of 45 (5 Pages)
	  int start = text.indexOf("(");
	  System.out.println("start index:"+start);
	  int end = text.indexOf("P");
	  System.out.println("ending index:"+end);
	  int total_pages = Integer.valueOf(text.substring(start+1,end-1));
	  System.out.println("total pages:"+total_pages);
	  
	  for(int p=1; p<total_pages;p++) 
	  {
		  
		  WebElement active_page = wd.findElement(By.xpath("//ul[@class='pagination']/li/span"));
		  System.out.println("active page:"+active_page.getText());
		 
		  active_page.click();
		  
		  int row = wd.findElements(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr")).size();
		  System.out.println("Number of row:"+row);
		  
		  for(int r=1;r<=row;r++) 
		  {
			  String orderId = wd.findElement(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr["+r+"]/td[2]")).getText();
			  String store = wd.findElement(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText();
			  String customer = wd.findElement(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr["+r+"]/td[4]")).getText();
			  String status = wd.findElement(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr["+r+"]/td[5]")).getText();
			  
			  if(status.equalsIgnoreCase("Pending")) 
			  {
				  System.out.println(orderId+"   "+store+"   "+customer);
			  }
		  }
		  
		  String pageno=Integer.toString(p+1);
		  WebElement nextPage = wd.findElement(By.xpath("//a[normalize-space()='"+pageno+"']"));
		  nextPage.click();

		  
	  }
  }
}
