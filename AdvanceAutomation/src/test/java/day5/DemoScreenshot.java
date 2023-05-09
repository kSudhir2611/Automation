package day5;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import helper.NewBase;

public class DemoScreenshot extends NewBase {
  @Test
  public void takeSceenshot() throws IOException {
	  wd.get("http://dbpanel.squadinfotech.in/");
	  
	  TakesScreenshot ts = (TakesScreenshot)wd;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File trg = new File("./screenshot"+dtm()+".png");
	  FileHandler.copy(src, trg);
  }
  
  public String dtm() 
  {
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}
