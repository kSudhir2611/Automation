package helper;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver wd;
	public Properties prop;
	
	
	@BeforeClass
	public void launchBrowser() throws Exception 
	{
		prop = new Properties();
		prop.load(new FileInputStream("src\\test\\resources\\DemoProperty\\Demo.property"));
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		
		String brwname = prop.getProperty("browser");
		if(brwname.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\resources\\chromedriver.exe");
			wd = new ChromeDriver(co);
		}
		else if(brwname.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\resources\\chromedriver.exe");
			wd = new FirefoxDriver();
		}
		
		wd.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(5000);
		wd.quit();
	}
}
