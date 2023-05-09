package day2;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;



public class FileDownloadinEdge  {
	WebDriver wd;
  @Test
  public void fileDownload() 
  {
	  String location ="C:\\Users\\Selenuium";
	  HashMap<Object,Object> preferances = new HashMap<>();
	  preferances.put("download.default_directory", location);
	  preferances.put("plugins.always_open_pdf_externally",true);
	  EdgeOptions option = new EdgeOptions();
	  option.setExperimentalOption("pref", preferances);
	  System.setProperty("webdriver.edge.driver","src\\test\\resources\\resources\\msedgedriver.exe");
	  wd = new EdgeDriver(option);
	  wd.get("https://file-example.com/en/sample-documents-files/sample-pdf-download");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
  }
}
