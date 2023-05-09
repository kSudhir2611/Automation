package day5;

import org.testng.annotations.Test;

import helper.BaseClass;

public class demoPF extends BaseClass{
  @Test
  public void executePF() {
	  wd.get("http://dbpanel.squadinfotech.in/");
	  
	  DemoPageFactory d = new DemoPageFactory(wd);
	  //d.username("testuser");
	  //d.password("testuser");
	  //d.go();
	  
	  d.loginProcess("testuser", "testuser");
  }
}
