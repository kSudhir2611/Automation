package day6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	



public class DemoExtend {
	ExtentReports ext;
	ExtentTest test;
	WebDriver wd;
	@BeforeTest
	public void rep() 
	{
		ext = new ExtentReports();
		ext.attachReporter(new ExtentHtmlReporter("report.html"));
		test = ext.createTest("Blazedemo test");
		
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\resources\\msedgedriver.exe");
		wd = new EdgeDriver();
		
		test.info("Starting browser");
	}
		
		@Test
		public void exampleExtent() 
		{
			wd.manage().window().maximize();
			test.info("Maximize window");
			
			wd.get("https://blazedemo.com");
			test.info("oprning URL");
			
			if(wd.getTitle().equals("BlazeDdemo")) 
			{
				test.log(Status.PASS, "navigated successfuly");
			}else
			{
				test.log(Status.FAIL, "unsuccesful");
			}
		}
		
		@AfterTest
		public void teardown() 
		{
			test.info("close browser");
			wd.quit();
			ext.flush();
		}

		 
  }

