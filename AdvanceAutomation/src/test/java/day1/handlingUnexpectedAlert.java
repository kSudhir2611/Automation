package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class handlingUnexpectedAlert extends BaseClass {
  @Test
  public void handleAlertUnexpected() throws InterruptedException 
  {
	  wd.get("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  try 
	  {
		  wd.switchTo().alert().dismiss();
	  }
	  catch(Exception e) 
	  {
		  System.out.println("Unexpected alert not present");
	  }
	  WebElement fname = wd.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[1]"));
	  HighlightMyElement(fname);
	  Thread.sleep(5000);
	  fname.sendKeys("myname");
	  
	  WebElement lname = wd.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[2]"));
	  HighlightMyElement(lname);
	  Thread.sleep(5000);
	  lname.sendKeys("lastname");
	  
	  wd.findElement(By.id("submitButton")).click();
  }
	  public void HighlightMyElement(WebElement element) 
	  {
		  for (int i = 0; i < 10; i++) {
		  JavascriptExecutor js = (JavascriptExecutor) wd;
		  js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: red; border: 3px solid yellow;");
		  js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: red; border: 3px solid yellow;");
	  }
	  
	  
  }
}
