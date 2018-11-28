/*package ROAutomation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Constants.Vehicle_Data;
import pageObjects.Vehicle;
import org.openqa.selenium.support.ui.Select;

public class VehicleMaster {
	public static WebDriver driver1 = null;
	private static String vehicle_no="";
	private static String vehicle_licence_no="";
	private static String vehicle_owner_name="";
	private static String vehicle_owner_mob="";
	private static String vehicle_driver_name="";
	private static String vehicle_driver_mob="";
	private static String puc_exp_date="";
	private static String veh_ins_exp_date="";
	
 // @Test
  public static void init(WebDriver driver) {
	 	  driver1=driver;
	 	;
  }
 // @Test
  public static void AddVehicle() throws Exception {
	 
	
	
	
	  Vehicle.vehicleMenu(driver1).click();
	  Vehicle.AddVehicle(driver1).click();
	callData();
	SetData();
Vehicle.btn_Submit(driver1).click();

  }
  
  public static void ResetVehicle() throws Exception {
	  
		 
		
	  
	
	  Vehicle.vehicleMenu(driver1).click();
	  Vehicle.AddVehicle(driver1).click();
	  callData();
	  SetData();
  Vehicle.btn_Reset(driver1).click();
  Vehicle.Manage_Vehicle(driver1).click();
  WebElement drpSearchBy=Vehicle.SearchBy(driver1);
  Select oselect=new Select(drpSearchBy);
  oselect.selectByValue("veh_number");
  Vehicle.SearchValue(driver1).sendKeys(vehicle_no);
  	  Vehicle.btnSearch(driver1).click();
  	  List<WebElement> listOfRows = Vehicle.tblVehicleList(driver1).findElements(By.tagName("tr"));
  	  
  	int RowCount= listOfRows.size();
  	int ColCount=0;
  	Boolean isValid=true;
  	  System.out.println(listOfRows.size());
  	if (RowCount >0) {
  	  for(int i=0;i<=RowCount;i++ )
  	{
  		  
  		List<WebElement> iColumns = driver1.findElements(By.xpath("//*[@id=\\\"page-wrapper\\\"]/div[3]/div/div/div[2]/div/table/tbody/tr[\"+i+\"]/th"));
  		ColCount=iColumns.size();
  	for(int j=2;j<ColCount;j++) {	
  		String sRowValue= driver1.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table/tbody/tr["+i+"]/th["+i+"]")).getText();
  		//if (sRowValue==vehicle_no) {isValid=true;}else {isValid=false;}
  		System.out.println("The Col Value is " + sRowValue);
  		}
  	}
  	}
	  
  }
  @Test
  private static void callData() throws Exception {
	  Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd"); 
	  vehicle_no=Constants.utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_no_colno );
	   
	  vehicle_licence_no=Constants.utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_licence_no_colno );
		
	  vehicle_owner_name=Constants.utility.getCellData( Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_owner_name);;
		 vehicle_owner_mob=Constants.utility.getCellData( Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_owner_mob);;
		 vehicle_driver_name=Constants.utility.getCellData( Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_driver_mob);;
		  vehicle_driver_mob=Constants.utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_driver_name );;
		  puc_exp_date=Constants.utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.puc_exp_date );;
		   
		    puc_exp_date= formatter.format(date);  
		  veh_ins_exp_date=Constants.utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.veh_ins_exp_date );;
		  veh_ins_exp_date=formatter.format(date);
  }
  private static void SetData() {
	  Vehicle.txt_vehicle_no(driver1).sendKeys(vehicle_no);
		Vehicle.txt_vehicle_licenceno(driver1).sendKeys(vehicle_licence_no);
		Vehicle.txt_vehicle_ownermob(driver1).sendKeys(vehicle_owner_mob);
		Vehicle.txt_vehicle_ownername(driver1).sendKeys(vehicle_owner_name);
		Vehicle.txt_vehicle_drivermob(driver1).sendKeys(vehicle_driver_mob);
		Vehicle.txt_vehicle_drivername(driver1).sendKeys(vehicle_driver_name);
		Vehicle.txt_vehicle_pucExpDt(driver1).sendKeys(puc_exp_date);
		Vehicle.txt_vehicle_InsuExpDt(driver1).sendKeys(veh_ins_exp_date);
  }
}
*/