package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoScroll extends BaseClass {
  @Test
  public void scrollExample() throws InterruptedException {
	  wd.get("https://www.selenium.dev/downloads/");
	  
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  
	  //scroll till element
	  //WebElement e = wd.findElement(By.linkText("Chrome"));
	  //js.executeScript("arguments[0].scrollIntoView()", e);
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
  }
}
