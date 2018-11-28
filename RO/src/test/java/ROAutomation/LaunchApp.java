package ROAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Constants.Constant;
import Constants.utility;
import pageObjects.LoginPage;

public class LaunchApp {
	
	public static WebDriver driver = null;
	private String title1="";
  @Test(priority=0,description="Login Page")
  public void Login() throws Exception {
	
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Desktop\\All Data\\vidya\\demo\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(Constant.URL);

LoginPage.txtbx_UserName(driver).sendKeys("admin@admin.com");
LoginPage.txtbx_Password(driver).sendKeys("password");
LoginPage.btn_LogIn(driver).click();
System.out.println(Constants.Constant.Path_TestData+Constants.Constant.File_TestData+"and"+ Constants.Constant.sheetName);
utility.setExcelFile(Constants.Constant.Path_TestData+Constants.Constant.File_TestData, Constants.Constant.sheetName);
//Manufacture.init(driver);
vehicle.init(driver);
  }
  //@Test
 
  public static WebDriver getDriver() {
	  return driver;
  }
  //@Test
  
}
