package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;


public class GoogleSearch extends NewBase
{
  @Test
  public void clickingAppropriateSearchtext() throws InterruptedException 
  {
	
	  wd.get("https://www.google.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.name("q")).sendKeys("python");
	  Thread.sleep(5000);
	  
	  List<WebElement> allsearch = wd.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li[@class='sbct']//span"));
	  
	  for(WebElement ele:allsearch) 
	  {
		  String searchText = ele.getText();
		  if(searchText.contains("download")) 
		  {
			  ele.click();
			  break;
		  }
	  }
  }
}
