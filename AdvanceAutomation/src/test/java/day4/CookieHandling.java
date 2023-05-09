package day4;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import helper.NewBase;

public class CookieHandling extends NewBase {
  @Test
  public void cookieHandling() 
  {
	  wd.get("https://www.amazon.in/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	
     //get All cookies
	  Set<Cookie> allcookie = wd.manage().getCookies();
	  System.out.println("cookie size: "+allcookie.size());
	  for(Cookie ck:allcookie) 
	  {
		  System.out.println(ck.getName()+" | "+ck.getValue());
	  }
	  
	  Cookie ckobj = new Cookie("samarkit", "786guygutg786786");
	  //adding cookie
	  wd.manage().addCookie(ckobj);
	  allcookie = wd.manage().getCookies();
	  System.out.println("cookie size: "+allcookie.size());
	  for(Cookie ck:allcookie) 
	  {
		  System.out.println(ck.getName()+" | "+ck.getValue());
	  }
	 
	  //get specific cookie
	  System.out.println(wd.manage().getCookieNamed("samarkit"));
	  
	  //delete cookie named
	  wd.manage().deleteCookieNamed("samarkit");
	  allcookie = wd.manage().getCookies();
	  System.out.println("cookie size: "+allcookie.size());
	  
	  //delete all cookie
	  wd.manage().deleteAllCookies();
	  allcookie = wd.manage().getCookies();
	  System.out.println("cookie size: "+allcookie.size());
	  
	  
  }
}
