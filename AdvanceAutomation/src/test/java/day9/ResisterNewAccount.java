package day9;

import java.time.Duration;


import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;

public class ResisterNewAccount extends NewBase {
  @Test
  public void registerAccount() 
  {
	  wd.get("https://demo.opencart.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  RegisterPOM rp = new RegisterPOM(wd);
	  rp.setWait(wd);
	  rp.resisterAccount("sam", "pedro", "sampedro@gmail.com", "test123");
	  
  }
}
