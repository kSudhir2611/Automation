package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.NewBase;

public class YoutubeSongPlaying extends NewBase 
{
  @Test
  public void weekndSong() throws InterruptedException 
  {
	  wd.get("https://www.youtube.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement searchbox = wd.findElement(By.xpath("//input[@id='search']"));
	  searchbox.sendKeys("i feel it coming weekend song");
	  searchbox.sendKeys(Keys.ENTER);
	  
	  wd.findElement(By.linkText("The Weeknd - I Feel It Coming ft. Daft Punk (Official Video)")).click();
	
	  Thread.sleep(10000);
  }
}
