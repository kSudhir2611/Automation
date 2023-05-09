package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoGrid {
	
	WebDriver wd;
	DesiredCapabilities dc = new DesiredCapabilities();
	public WebDriver initializeBrowser(String browserName) throws MalformedURLException
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			dc.setBrowserName("chrome");
		}
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			dc.setBrowserName("firefox");
		}
		if(browserName.equalsIgnoreCase("MicrosoftEdge")) 
		{
			dc.setBrowserName("MicrosoftEdge");
		}
		
		wd = new RemoteWebDriver(new URL(""),dc);
		return wd;
	}
}
