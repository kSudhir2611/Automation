package DemoPFactory;

import java.time.Duration;

import org.testng.annotations.Test;

import helper.BaseClass;
import helper.NewBase;

public class CreateNewUser extends BaseClass {
  @Test
  public void register() throws InterruptedException 
  {
	  wd.get("https://demo.opencart.com/index.php?route=account/register");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  DemoOpencart dop = new DemoOpencart(wd);
	  dop.enterFirstname("kim");
	  dop.enterLastname("Kardasion");
	  dop.enterEmail("kksam@gmail.com");
	  dop.checkSuscribe();
	  dop.toggleOnCheckbox();
	  dop.clickOnContinue();
	  Thread.sleep(3000);
  }
}
