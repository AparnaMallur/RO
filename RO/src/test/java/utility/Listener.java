package utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

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
  public static String ClassName="";
  public static String stDt="";
  public static String EnDt="";
  public static String Result="";
  public static String TestCase="";
  public static int i=0;
  public static String  clsName="";
	@Test
  public void f() {
  }
  WebDriver driver=null;  
  String filePath = "C:\\Users\\Android4\\Desktop\\SCREENSHOTForManufacture\\SCREENSHOT";  
public void CreateReport () throws Exception {
	System.out.println("create Method Called by");
	String FileName= "C:\\Users\\Android4\\Desktop\\TestHtmlReport.html";
	
	int i=1;
	File file=new File(FileName);
	if(!file.exists())
	{
		FileWriter fw=new FileWriter(file.getAbsolutePath(),true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.write("<html>"+"\n");
		bw.write("<head><title>" + "Test Execution Report" + "</title>"+ "\n");
		bw.write("</head>");
		bw.write("<body>");
		bw.write("<font face='Tahana' size=2>" + "\n");
		bw.write("<u><h1 align='center'>" + "Test Execution Report" + "</h1><u>" + "\n");
		//bw.write("<div id=\"id01\" class=\"w3-modal\">";
		bw.flush();
		bw.close();
	}
	FileWriter fw1=new FileWriter(file,true);
	BufferedWriter bw1=new BufferedWriter(fw1);
	System.out.println("Local class Name is" + clsName);
	System.out.println("global class Name is" + ClassName);
	if( clsName.trim()!=ClassName.trim()) {
		clsName=ClassName;
	i=1;
	bw1.write("<table align='center' border='0' width ='70%' height='10'");
	bw1.write("<tr><td width='70%' ></td></tr>");
	bw1.write("<table align='center' border='1' width='70%' height='47'>");
	bw1.write("<tr>");
	bw1.write("<td colspan='2' align ='center'><b><font color='#000000' face='Tahema' size='2' > Script Name :"+clsName+" &nbsp;:&nbsp;:&nbsp</font>");
	bw1.write("<td colspan='3' align ='left'><b><font color='#000000' face='Tahema' size='1' > Start Time :&nbsp;:&nbsp;:&nbsp</font>");
	bw1.write("</tr>");
	bw1.write("</tr>");
	bw1.write("<td bgcolor='#CCCCFF' align='center' ><b><font color='#000000' face='Tahema' size='2' >S.No </font></b></td>>");
	bw1.write("<td bgcolor='#CCCCFF' align='left' ><b><font color='#000000' face='Tahema' size='2' >Test Case Description </font></b></td>>");
	bw1.write("<td bgcolor='#CCCCFF' align='left' ><b><font color='#000000' face='Tahema' size='2' >Start Time </font></b></td>>");
	bw1.write("<td bgcolor='#CCCCFF' align='left' ><b><font color='#000000' face='Tahema' size='2' >End Time </font></b></td>>");
	bw1.write("<td bgcolor='#CCCCFF' align='Center' ><b><font color='#000000' face='Tahema' size='2' >Result </font></b></td>>");
	bw1.write("</tr>");
		bw1.flush();
		bw1.close();
	}
	else {
	System.out.println(i);
	System.out.println("Test Case is "+TestCase);
	System.out.println("Star Date is" + stDt);
	System.out.println("End Date is" +EnDt);
	bw1.write("<tr>"+"\n");
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' >" +i+ "</font></b></td>>");
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' >" +TestCase+ "</font></b></td>>");		
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' >" +stDt+ "</font></b></td>>");
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' >" +EnDt+ "</font></b></td>>");
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' >" +Result+ "</font></b></td>>");
	bw1.write("<td bgcolor='#FFFFDC' align='center' ><b><font color='#000000' face='Tahema' size='2' > <button onclick=\" document.getElementById(\'id\')..style.display=\'block\'class=\"w3-button w3-black\" \"> Open Screenshot </font></b></td>>");
	bw1.write("</tr>"+"\n");
	bw1.write("</bod>"+"\n");
	bw1.write("</html");
	bw1.flush();
	bw1.close();}
}
 
  public void takeScreenShot(String methodName) {
      //get the driver
      driver=LaunchApp.getDriver();
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //The below method will save the screen shot in d drive with test method name 
          try {
       	  FileName=filePath+methodName+".png";
              FileUtils.copyFile(scrFile, new File(FileName));
            //  System.out.println("***Placed screen shot in "+filePath+" ***");
              Reporter.log("<br><img src='"+FileName+"' height='400' width='400' >");
          } catch (IOException e) {
              e.printStackTrace();
          }
  }
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	String StartDateTime=new SimpleDateFormat("MM-dd-yyyy-HH-ss").format(new GregorianCalendar().getTime());
	stDt=StartDateTime;
//	System.out.println("*****  "+result.getName()+" test has started *****");
  //  String methodName=result.getName().toString().trim();
  //  takeScreenShot(methodName);
	 String className1 = result.getInstanceName();
	 System.out.println("The Class is"+className1);
	//System.out.println("*****  "+result.getClass());
	 if(className1.trim().equals(ClassName.trim()))
	    {
	    	
	    }
	    else {
	    	ClassName=className1;
	    }
	 TestCase=result.getMethod().getDescription();
	 i=i+1;
	 
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	String StartDateTime=new SimpleDateFormat("MM-dd-yyyy-HH-ss").format(new GregorianCalendar().getTime());
	EnDt=StartDateTime;
	//System.out.println("***** Success "+result.getName()+" test has passed *****");
    String methodName=result.getName().toString().trim();
    takeScreenShot(methodName);
   
  
   
    Result="Pass";
    try {
		CreateReport();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //log(className);
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	// System.out.println("***** Error "+result.getName()+" test has failed *****");
    // String methodName=result.getName().toString().trim();
    
    
     Result="Fail";
    // takeScreenShot(methodName);
     try {
 		CreateReport();
 	} catch (Exception e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	 String className1 = result.getInstanceName();
	 if(className1.trim().equals(ClassName.trim()))
	    {
	    	
	    }
	    else {
	    	ClassName=className1;
	    }
	 Result="Skipped";
	 try {
			CreateReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("start of page");
	System.out.println(context.getName().toString());
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	try {
		CreateReport();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
