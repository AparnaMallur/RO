package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class manufacturer {

	private static WebElement element = null;
	 public static WebElement manufacturerMenu(WebDriver driver){
		 
       element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a/span[1]"));
                               
       return element;

	
}
  public static WebElement Addmanufacturer(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/ul/li[1]/a"));
                                               
 
         return element;
 
  }
  public static WebElement txt_mfg_name(WebDriver driver){
	 
	    element = driver.findElement(By.id("mfg_name"));

	    return element;

	    }
  public static WebElement txt_mfg_address(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_address"));

	    return element;

	    }
  public static WebElement txt_mfg_contact_person(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_contact_person"));

	    return element;

	    }
  public static WebElement txt_mfg_phone_no(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_phone_no"));

	    return element;

	    }
 
  public static WebElement txt_mfg_gst_no(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_gst_no"));

	    return element;

	    }
  public static WebElement txt_mfg_bank_name(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_bank_name"));

	    return element;

	    }
  public static WebElement txt_mfg_branch_name(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_branch_name"));

	    return element;

	    }
  public static WebElement txt_mfg_accnt_no(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_accnt_no"));

	    return element;

	    }
  public static WebElement txt_mfg_ifsc_code(WebDriver driver){
		 
	    element = driver.findElement(By.id("mfg_ifsc_code"));

	    return element;

	    }

  public static WebElement AddmanufacturerReset(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[10]/div[2]/button[1]"));
 
         return element;
 
  }

  public static WebElement AddmanufacturerSubmit(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[10]/div[2]/button[2]"));
 
         return element;
 
  }
  
  public static WebElement ManageManufacurer(WebDriver driver) {
	  element=driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[9]/ul/li[2]/a"));
	//*[@id="side-menu"]/li[9]/ul/li[2]/a
	return element;
	  
  }
  public static WebElement SearchValue(WebDriver driver) {
		element=driver.findElement(By.id("searchValue"));
		return element;
		
	}
	public static WebElement SearchBy(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/form/div[1]/select"));
		return element;
		
	}
	public static WebElement btnSearch(WebDriver driver) {
		element=driver.findElement(By.name("search"));
		
		return element;
		
	}
	public static WebElement tblVehicleList(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	//*** Validation Controls ***
	public static WebElement NameValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	public static WebElement AddrValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	public static WebElement ConPersonValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	
	public static WebElement ConNumValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[4]/div[2]/span"));
				
		return element;
		
	}
	
	public static WebElement GSTValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[5]/div[2]/span"));
		                                    
		
		return element;
		
	}
	public static WebElement BankNameValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[6]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	public static WebElement BranchNameValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[7]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	public static WebElement ActnoValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[8]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
	
	public static WebElement iifscValidator(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[9]/div[2]/span"));
		////*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/table
		
		return element;
		
	}
}
  