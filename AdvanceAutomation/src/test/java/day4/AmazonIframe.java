package day4;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;

public class AmazonIframe extends NewBase {
  @Test
  public void iframeTesting() throws InterruptedException 
  {
	  wd.get("https://demo.automationtesting.in/Frames.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	  
	  WebElement outerFrame = wd.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	  wd.switchTo().frame(outerFrame);
	  System.out.println("Outerframe text: "+wd.findElement(By.xpath("//h5[normalize-space()='Nested iFrames']")).getText());
	  
	  WebElement innerFrame = wd.findElement(By.xpath("/html/body/section/div/div/iframe"));
	  wd.switchTo().frame(innerFrame);
	  System.out.println("innerFrame text: "+wd.findElement(By.xpath("/html/body/section/div/h5")).getText());
	  
	  wd.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
	  Thread.sleep(3000);
  }
}
