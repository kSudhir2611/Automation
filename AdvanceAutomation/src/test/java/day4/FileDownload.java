package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;


public class FileDownload extends NewBase 
{
  //@Test
  public void fileDownload() throws InterruptedException 
  {
	  wd.get("https://demo.automationtesting.in/FileDownload.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.id("textbox")).sendKeys("my name is Sudhir");
	  wd.findElement(By.id("createTxt")).click();
	  wd.findElement(By.linkText("Download")).click();
	  Thread.sleep(5000);
  }
  @Test
  public void fileUpload() throws InterruptedException 
  {
	  wd.get("https://demo.automationtesting.in/FileUpload.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.id("input-4")).sendKeys("C:\\Users\\Selenuium\\test.txt");
	  Thread.sleep(5000);
	  System.out.println("File uploaded");
  }
}
