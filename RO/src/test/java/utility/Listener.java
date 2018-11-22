package utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ROAutomation.LaunchApp;

public class Listener implements ITestListener{
  String FileName ;
	@Test
  public void f() {
  }
  WebDriver driver=null;  
  String filePath = "C:\\Users\\Android4\\Desktop\\SCREENSHOTForManufacture\\SCREENSHOT";  

 
  public void takeScreenShot(String methodName) {
      //get the driver
      driver=LaunchApp.getDriver();
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //The below method will save the screen shot in d drive with test method name 
          try {
       	  FileName=filePath+methodName+".png";
              FileUtils.copyFile(scrFile, new File(FileName));
              System.out.println("***Placed screen shot in "+filePath+" ***");
              Reporter.log("<br><img src='"+FileName+"' height='400' width='400' >");
          } catch (IOException e) {
              e.printStackTrace();
          }
  }
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("*****  "+result.getName()+" test has started *****");
  //  String methodName=result.getName().toString().trim();
  //  takeScreenShot(methodName);
	 
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("***** Success "+result.getName()+" test has passed *****");
    String methodName=result.getName().toString().trim();
    takeScreenShot(methodName);
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	 System.out.println("***** Error "+result.getName()+" test has failed *****");
     String methodName=result.getName().toString().trim();
     takeScreenShot(methodName);
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
