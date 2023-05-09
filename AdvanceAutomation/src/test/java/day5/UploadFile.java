package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class UploadFile extends BaseClass{
  @Test
  public void founditUpload() {
	  wd.get("https://www.foundit.in/seeker/registration");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement upload = wd.findElement(By.xpath("//*[@id=\"file-upload\"]"));
	  upload.sendKeys("C:\\Users\\Selenuium\\test.txt");
	  System.out.println("File Uploaded");
	  
  }
}
