package helper;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseGrid {
	public WebDriver wd;
	
	public WebDriver initilizeBrowser(String brwname) throws Exception 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		if(brwname.equalsIgnoreCase("chrome")) 
		{
			dc.setBrowserName("chrome");
		}
		else if(brwname.equalsIgnoreCase("firefox")) 
		{
			dc.setBrowserName("firefox");
		}
		else if(brwname.equalsIgnoreCase("MicrosoftEdge")) 
		{
			dc.setBrowserName("MicrosoftEdge");
		}
		
		wd = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		return wd;
	}
}
