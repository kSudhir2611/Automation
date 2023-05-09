package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DataDrivenOrangeHRM extends BaseClass {
  @Test
  public void loginInOrangeHRM() throws Exception 
  {
	  wd.get("https://icehrm-open.gamonoid.com/login.php");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  File file = new File("C://Users//Selenuium//orangeHRM.xlsx");
	  FileInputStream fis = new FileInputStream(file);
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheet("Login");
	  
	  int row_count = sheet.getPhysicalNumberOfRows();
	  System.out.println("number of rows: "+row_count);
	  int col_count = sheet.getRow(0).getLastCellNum();  
	  System.out.println("number of columns: "+col_count);
	  
	  for(int i = 1; i < row_count; i++) 
	  {
		   XSSFRow row = sheet.getRow(i);
		   XSSFCell uname = row.getCell(0);
		   XSSFCell pword = row.getCell(1);
		   System.out.println("Username: "+uname+" password: "+pword );
		   //login
		   wd.findElement(By.id("username")).sendKeys(uname.toString());
		   wd.findElement(By.id("password")).sendKeys(pword.toString());
		   wd.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		   //logout
		   wd.findElement(By.xpath("//*[@id=\"delegationDiv\"]/nav/div[2]/ul/li[5]/a/span")).click();
		   wd.findElement(By.linkText("Sign out")).click();
		   
		   
	  }
}
}
