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
	
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Android4\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(Constant.URL);

LoginPage.txtbx_UserName(driver).sendKeys("admin@admin.com");
LoginPage.txtbx_Password(driver).sendKeys("password");
LoginPage.btn_LogIn(driver).click();
System.out.println(Constants.Constant.Path_TestData+Constants.Constant.File_TestData+"and"+ Constants.Constant.sheetName);
utility.setExcelFile(Constants.Constant.Path_TestData+Constants.Constant.File_TestData, Constants.Constant.sheetName);
Manufacture.init(driver);
  }
  //@Test
  public void Testvehicle() throws Exception
  {
	 // if( driver !=null) {
	 
	 
	  VehicleMaster.init(driver);//}
	  VehicleMaster.AddVehicle();
	  
  }
  public static WebDriver getDriver() {
	  return driver;
  }
  //@Test
  public void TestManufacturer() throws Exception
  {
	 // if( driver !=null) {
	 
	 Manufacture.init(driver);
	 Manufacture.AddManufacturer();
	
	  
  }
}
