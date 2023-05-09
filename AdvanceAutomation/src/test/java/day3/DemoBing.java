package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoBing extends BaseClass{
  @Test
  public void demoBing() throws InterruptedException {
	  String data = prop.getProperty("url");
	  System.out.println(data);
	  
	  wd.get(data);
	  wd.findElement(By.xpath(prop.getProperty("searchfield"))).sendKeys("squad");
	  Thread.sleep(2000);
	  wd.findElement(By.xpath(prop.getProperty("searchfield"))).sendKeys(Keys.ENTER);
  }
}
