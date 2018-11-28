/*package ROAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Constants.Constant;
import Constants.Manufacture_Data;
import pageObjects.Vehicle;
import pageObjects.manufacturer;

public class editManufacturePage {
	public static WebDriver driver1 = null;
	private static String manufacture_Name="";
	private static String manufacture_add="";
	private static String contact_person="";
	private static String manufacture_phone_no="";
	private static String manufacture_GST_no="";
	private static String manufacture_Bank_Name="";
	private static String manufacture_Branch_Name="";
	private static String manufacture_Account_No="";
	private static String manufacture_iifsc_code="";
	public static void init(WebDriver driver) {
	 	  driver1=driver;
	 	;
}
@Test(description="Enter All fields and Save and check all field values are saved")
public static void EditManufacturer() throws Exception {
	 
	
	
	manufacturer.manufacturerMenu(driver1).click();
	manufacturer.ManageManufacurer(driver1).click();
	
		WebElement drpSearchBy=manufacturer.SearchBy(driver1);
		Select oselect=new Select(drpSearchBy);
		oselect.selectByValue("mfg_name");
		manufacture_Name=Constants.utility.getCellData(Manufacture_Data.Edit_Rowno,Manufacture_Data.manufacture_Name_ToEdit );
		manufacturer.SearchValue(driver1).sendKeys(manufacture_Name);
		manufacturer.btnSearch(driver1).click();
		
	callData(Constants.Manufacture_Data.manufacture_data_rowno);
	SetData();
manufacturer.AddmanufacturerSubmit(driver1).click();
WebElement msg=driver1.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/div[1]"));

	//manufacturer.ManageManufacurer(driver1).click();

	
	Reporter.log("Search for Manufacture name Added :"+manufacture_Name + "\n");
		  List<WebElement> listOfRows = manufacturer.tblVendorList(driver1).findElements(By.tagName("tr"));
		  
		int RowCount= listOfRows.size();
		System.out.println("The Row Count is " + RowCount);
		int ColCount=0;
		int i=0;
		Boolean isValid=true;
		//  System.out.println(listOfRows.size());
		if (RowCount >0) {
			Reporter.log("Search Returned " + (RowCount-1) + "Records");
			Reporter.log("Now Check Each column values has Entered value "+ "\n");
		//System.out.println("Done");
		List<WebElement> iColumns = driver1.findElements(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table/tbody/tr[1]/th"));
		ColCount=iColumns.size();
		//for(i=1;i<ColCount;i++) {
		String manu_name=iColumns.get(2).getText();
		String manu_add=iColumns.get(3).getText();
		String manu_contact_person=iColumns.get(4).getText();
		String manu_phoneno=iColumns.get(5).getText();
		String manu_GST=iColumns.get(6).getText();
		String manu_bank=iColumns.get(7).getText();
		String manu_branch=iColumns.get(8).getText();
		String manu_acNo=iColumns.get(9).getText();
		String man_iifsc=iColumns.get(10).getText();
		
		Assert.assertTrue(manu_name.contains(manufacture_Name));
		Assert.assertTrue(manu_add.contains(manufacture_add));
		Assert.assertTrue(manu_contact_person.contains(contact_person));
		Assert.assertTrue(manu_phoneno.contains(manufacture_phone_no));
		Assert.assertTrue(manu_GST.contains(manufacture_GST_no));
		Assert.assertTrue(manu_bank.contains( manufacture_Bank_Name));
		Assert.assertTrue(manu_branch.contains( manufacture_Branch_Name));
		Assert.assertTrue(manu_acNo.contains( manufacture_Account_No));
		Assert.assertTrue(man_iifsc.contains( manufacture_iifsc_code));
		
		}
}
private static void callData(int Rowno ) throws Exception {
	  
	  manufacture_Name=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_Name );

	 manufacture_add=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_add );
	 contact_person=Constants.utility.getCellData(Rowno,Manufacture_Data.contact_person );
	 manufacture_phone_no=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_phone_no );
		 manufacture_GST_no=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_GST_no );
		 manufacture_Bank_Name=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_Bank_Name );
		 manufacture_Branch_Name=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_Branch_Name );
		 manufacture_Account_No=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_Account_No );
		 manufacture_iifsc_code=Constants.utility.getCellData(Rowno,Manufacture_Data.manufacture_iifsc_code );
}
private static void SetData() throws Exception {
	  manufacturer.txt_mfg_name(driver1).sendKeys(manufacture_Name);
	  manufacturer.txt_mfg_address(driver1).sendKeys(manufacture_add);
	  manufacturer.txt_mfg_contact_person(driver1).sendKeys(contact_person);
	  manufacturer.txt_mfg_phone_no(driver1).sendKeys(manufacture_phone_no);
	  manufacturer.txt_mfg_gst_no(driver1).sendKeys(manufacture_GST_no);
	  manufacturer.txt_mfg_bank_name(driver1).sendKeys(manufacture_Bank_Name);
	  manufacturer.txt_mfg_branch_name(driver1).sendKeys(manufacture_Branch_Name);
	  manufacturer.txt_mfg_accnt_no(driver1).sendKeys(manufacture_Account_No);
	  manufacturer.txt_mfg_ifsc_code(driver1).sendKeys(manufacture_iifsc_code);
	  
}
@Test(description="Testing Mobile No accepts Number only Validations")
public static void checkMobileNumberNumericValidation() throws Exception {
		manufacturer.manufacturerMenu(driver1).click();
		manufacturer.Addmanufacturer(driver1).click();
		callData(Constants.Manufacture_Data.NumValidation_Rowno);
		SetData();
		manufacturer.AddmanufacturerSubmit(driver1).click();
				
		Assert.assertEquals(manufacturer.ConNumValidator(driver1).getText(),Constant.manu_numericValidation);
		
		
}

}
*/