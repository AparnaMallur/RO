package ROAutomation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.text.DateFormat;

import java.text.ParseException;

import Constants.Manufacture_Data;
import Constants.Vehicle_Data;
import Constants.utility;
import utility.TestNGEmailableReport2;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		
		//XmlSuite suite = new XmlSuite();
		//suite.setName("TmpSuite");
		 
		//XmlTest test = new XmlTest(suite);
		//test.setName("Test - Suite");
		//List<XmlClass> classes = new ArrayList<XmlClass>();
		//for(XmlClass x :classes)
		//classes.add(new XmlClass("ROAutomation.LaunchApp"));
		//classes.add(new XmlClass("ROAutomation.Manufacture"));
		//test.setXmlClasses(classes) ;
		//List<XmlSuite> suites = new ArrayList<XmlSuite>();
		//suites.add(suite);
		//TestNG tng = new TestNG();
		//tng.setXmlSuites(suites);
		//tng.run();
		
		//TestListenerAdapter tla = new TestListenerAdapter();
	    //TestNG testng = new TestNG();
	    //testng.
	    //testng.setTestClasses(new Class[] { mention class name here.class });
	    //testng.addListener(tla);
	    //testng.run();
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();
		 TestNGEmailableReport2 frl = new TestNGEmailableReport2();		// Add xml file which you have to execute
		suitefiles.add("C:\\Users\\Android4\\git\\repository\\RO\\testng.xml");
	
		runner.addListener(frl);
		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
		
		
	}

}
