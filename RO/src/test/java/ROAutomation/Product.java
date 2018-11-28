package ROAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Constants.utility;
import pageObjects.navigation;
//import Constants.Product;

public class Product {
	private static final int Product_rowno = 0;
	private static final int prod_name_colno = 0;
	private static final int prod_qty_colno = 0;
	private static final int prod_unit_colno = 0;
	private static final int prod_gst_colno = 0;
	private static final int prod_hsn_no_colno = 0;
	public static WebDriver driver1 = null;
	public static String prodname = "";
	public static String  prodqty = "";
	public static String  produnit = "";
	public static String  prodgst = "";
	public static String  prodhsnno = "";
	public static String  openingstock = "";
	
	
	
	
 // @Test
  public static void init(WebDriver driver) {
 	  driver1=driver;
 	
}
  @Test
  public static void AddProduct() throws Exception {
	  System.out.println("Hello");
	  navigation.Product(driver1).click();
	  navigation.Add_Product(driver1).click();
	  prodname=utility.getCellData(Product.Product_rowno,Product.prod_name_colno);
	  prodqty= utility.getCellData(Product.Product_rowno, Product.prod_qty_colno);
	  produnit=utility.getCellData(Product.Product_rowno,Product.prod_unit_colno);
	  prodgst=utility.getCellData(Product.Product_rowno,Product.prod_gst_colno);
	  prodhsnno=utility.getCellData(Product.Product_rowno, Product.prod_hsn_no_colno);
	  System.out.println(prodname);
	     System.out.println(prodqty);
	     System.out.println(produnit);
	     System.out.println(prodgst);
	     System.out.println(prodhsnno);
	     pageObjects.Product.txt_prod_name(driver1).sendKeys(prodname);
	     pageObjects.Product.txt_prod_qty(driver1).sendKeys(prodqty);
	     pageObjects.Product.txt_prod_unit(driver1).sendKeys(produnit);
	     pageObjects.Product.txt_prod_gst(driver1).sendKeys(prodgst);
	     pageObjects.Product.txt_prod_hsn_no(driver1).sendKeys(prodhsnno);

  }
  private static WebElement searchBy(WebDriver driver12) {
		// TODO Auto-generated method stub
		return null;
  }
}