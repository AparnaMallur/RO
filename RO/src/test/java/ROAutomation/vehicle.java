package ROAutomation;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import Constants.Vehicle_Data;
import Constants.utility;



//@Test
public class vehicle{
	public static WebDriver driver1 = null;
	private static String Vehicle_Number="";
	private static String Owner_Name="";
	private static String Owner_Mob_No="";
	private static String PUC_Exp_Date="";
	private static String Insurance_Exp_Date="";
	private static String Registration_Renewal_Date="";
	
	//@Test
	 public static void init(WebDriver driver) {
	 	  driver1=driver;
	 	  
	 	
 }
	//@Test
	 public static void vehicle() throws Exception {
		
	 pageObjects.Vehicle.vehicleMenu(driver1).click();

		pageObjects.Vehicle.AddVehicle(driver1).click();
		
		Vehicle_Number=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_no_colno);
		 Owner_Name=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_Owner_name_colno);
		 Owner_Mob_No=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_Owner_Mobno_colno);
		 PUC_Exp_Date=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_PUC_Exp_date_colno);
		 Insurance_Exp_Date=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_Insurance_Exp_date_colno);
		 Registration_Renewal_Date=utility.getCellData(Vehicle_Data.vehicle_data_rowno,Vehicle_Data.vehicle_Registration_Renewal_date_colno);
		
		pageObjects.Vehicle.txt_veh_number(driver1).sendKeys(Vehicle_Number);
		pageObjects.Vehicle.txt_veh_owner_name(driver1).sendKeys(Owner_Name);
		pageObjects.Vehicle.txt_veh_owner_mob_no(driver1).sendKeys(Owner_Mob_No);
		pageObjects.Vehicle.txt_veh_puc_exp_date(driver1).sendKeys(PUC_Exp_Date);
		pageObjects.Vehicle.txt_veh_ins_exp_date(driver1).sendKeys(Insurance_Exp_Date);
		pageObjects.Vehicle.txt_veh_reg_ren_date(driver1).sendKeys(Registration_Renewal_Date);
		pageObjects.Vehicle.btn_Submit(driver1).click();
		
		
		WebElement searchBy= pageObjects.Vehicle.searchBy(driver1);
		Select oselect=new Select(searchBy);
		oselect.selectByVisibleText("Owner Name");
		pageObjects.Vehicle.txt_searchValue(driver1).sendKeys( Owner_Name);
		pageObjects.Vehicle.btn_search(driver1).click();
	
		
	/*
			pageObjects.Vehicle.vehicleMenu(driver1).click();
			pageObjects.Vehicle.AddVehicle(driver1).click();
			//pageObjects.Vehicle.searchBy(driver1).sendKeys("Owner name");
			//pageObjects.Vehicle.txt_searchValue(driver1).click();
			//pageObjects.Vehicle.btn_search(driver1).click();
			WebElement searchBy=vehicle.searchBy(driver1);
			Select oselect=new Select(searchBy);
			oselect.selectByValue("Owner name");
			pageObjects.Vehicle.txt_searchValue(driver1).sendKeys("Owner name");
			pageObjects.Vehicle.btn_search(driver1).click();
			
			@Test
			Public static void validation() {
				
				pageObjects.Vehicle.AddVehicle(driver1).click();
				pageObjects.Vehicle.btn_Submit(driver1).click();
				
				
				
	}

			
*/			
			
			
			
		
		
		
		
	 }
	//this is used  for validation requiretment//
	//@Test
	 public static void validation() throws Exception { 
		pageObjects.Vehicle.vehicleMenu(driver1).click();
		pageObjects.Vehicle.AddVehicle(driver1).click();
		pageObjects.Vehicle.btn_Submit(driver1).click();
		String vehnumvalmsg=pageObjects.Vehicle.txt_veh_no_req(driver1).getText();
		String vehownername=pageObjects.Vehicle.txt_veh_owner_nam(driver1).getText();
		String vehownermobnum=pageObjects.Vehicle.txt_veh_owner_mobileno(driver1).getText();
		String vehpucexpdate=pageObjects.Vehicle.txt_veh_puc_expdate(driver1).getText();
		String vehinsexpdate=pageObjects.Vehicle.txt_veh_ins_expdate(driver1).getText();
		String regrendate=pageObjects.Vehicle.txt_veh_reg_rendate(driver1).getText();
		
		
		
		
		try {
			Assert.assertTrue( vehnumvalmsg.contains(Constants.Constant.veh_num_msg));
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Assert.assertTrue(vehownername.contains(Constants.Constant.veh_owner_nam_msg));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Assert.assertTrue(vehownermobnum.contains(Constants.Constant.veh_owner_mobno_msg));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Assert.assertTrue(vehpucexpdate.contains(Constants.Constant.veh_puc_expdate_msg));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Assert.assertTrue(vehinsexpdate.contains(Constants.Constant.veh_ins_expdate_msg));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Assert.assertTrue(regrendate.contains(Constants.Constant.veh_reg_rendate_msg));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
}
	//for 9 digit mobile validation//
	//@Test
	 public static void mobilevalidation() throws Exception {
		 pageObjects.Vehicle.vehicleMenu(driver1).click();
			pageObjects.Vehicle.AddVehicle(driver1).click();
			
			
		pageObjects.Vehicle. txt_veh_owner_mob_no(driver1).sendKeys("abcd");
		pageObjects.Vehicle.btn_Submit(driver1).click();
		String errormsg=pageObjects.Vehicle.txt_veh_owner_mobilenumber(driver1).getText();
			try {
				Assert.assertTrue(errormsg .contains(Constants.Constant.veh_mobilenum_msg));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		 
	 }
	//for vehiclenumber validation//
	@Test(description="validation")
	 public static void ownernamevalidation() throws Exception {
		 
		 pageObjects.Vehicle.vehicleMenu(driver1).click();
			pageObjects.Vehicle.AddVehicle(driver1).click();

			pageObjects.Vehicle. txt_veh_number(driver1).sendKeys("###");
			pageObjects.Vehicle.btn_Submit(driver1).click();
			String errormsg1=pageObjects.Vehicle.txt_veh_numberr_req(driver1).getText();
			try {
				Assert.assertTrue(errormsg1 .contains(Constants.Constant.veh_numee_msg));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
	 }
	//for mobile 9 number validation//
 public static void ninedigitvalidation() throws Exception {
		 
		 pageObjects.Vehicle.vehicleMenu(driver1).click();
			pageObjects.Vehicle.AddVehicle(driver1).click();

			pageObjects.Vehicle. txt_veh_owner_mob_no(driver1).sendKeys("999999999");
			pageObjects.Vehicle.btn_Submit(driver1).click();
			String errormsg2=pageObjects.Vehicle.txt_veh_owner_mobilenumber(driver1).getText();
			try {
				Assert.assertTrue(errormsg2 .contains(Constants.Constant.tendigit));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
	 }
	
	
}