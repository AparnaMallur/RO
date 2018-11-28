package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Vehicle {
		 private static WebElement element = null;
		 public static WebElement vehicleMenu(WebDriver driver){
			 
	         element = driver.findElement(By.xpath(" //*[@id=\"side-menu\"]/li[3]/a/span[1]"));
	      
	       //*[@id="side-menu"]/li[3]/a/span[1]
	      
	         return element; 
	         }
	 
	     public static WebElement AddVehicle(WebDriver driver){
	 
	         element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
	       //*[@id="side-menu"]/li[3]/ul/li[1]/a
	         return element;
	 
	         }
	     public static WebElement searchBy(WebDriver driver){
	    	 
	         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/form/div[1]/select"));
	         
	         										//*[@id="page-wrapper"]/div[3]/div/div/div[1]/form/div[1]/select
	         return element;
	 
	         }
	 public static WebElement txt_searchValue(WebDriver driver){
	    	 
	     element = driver.findElement(By.id("searchValue"));
	     
	     	return element;
	 
	         }
	 public static WebElement btn_search(WebDriver driver){
		 
	     element = driver.findElement(By.name("search"));

	 
	         return element;
	 
	         }
	     
	     public static WebElement txt_veh_number(WebDriver driver){
	    	 
	         element = driver.findElement(By.id("veh_number"));
	 
	         return element;
	 
	         }
	    
	public static WebElement txt_veh_owner_name(WebDriver driver){
	    	 
	         element = driver.findElement(By.id("veh_owner_name"));
	 
	         return element;
	 
	         }
	     //Vehicle Owner Name

	//Vehicle owner Mob No
	public static WebElement txt_veh_owner_mob_no(WebDriver driver){
		 
	    element = driver.findElement(By.id("veh_owner_mob_no"));

	    return element;

	    }


	public static WebElement txt_veh_puc_exp_date(WebDriver driver){
		 
	    element = driver.findElement(By.id("veh_puc_exp_date"));
	//driver.f
	    return element;

	    }

	public static WebElement txt_veh_ins_exp_date(WebDriver driver){
		 
	    element = driver.findElement(By.id("veh_ins_exp_date"));

	    return element;

	    }

	public static WebElement txt_veh_reg_ren_date(WebDriver driver){
		 
	    element = driver.findElement(By.id("veh_reg_ren_date"));

	    return element;

	    }

	public static WebElement btn_Reset(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[7]/div[2]/button[1]"));
	              
	    return element;

	    }
	     public static WebElement btn_Submit(WebDriver driver){
	    	 
	         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[7]/div[2]/button[2]"));
	                   
	         return element;
	 
	         }
	  
	public static WebElement txt_veh_no_req(WebDriver driver){
	    	 
	         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span"));
	         										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span
	         return element;
	 
	         }

	public static WebElement txt_veh_numberr_req(WebDriver driver){
	   	 
	        element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span"));
	        										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span
	        return element;

	        }
	public static WebElement txt_veh_owner_nam(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/span"));
	    										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span		
	    return element;

	    }
	public static WebElement txt_veh_owner_mobileno(WebDriver driver){
		 
	    element = driver.findElement(By.xpath(" //*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span"));
	    										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span
	    return element;

	    }
	public static WebElement txt_veh_puc_expdate(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[4]/div[2]/span"));
	              
	    return element;

	    }
	public static WebElement txt_veh_ins_expdate(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[5]/div[2]/span"));
	              
	    return element;

	    }
	public static WebElement txt_veh_reg_rendate(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[6]/div[2]/span"));
	              
	    return element;

	    }

	 //for validation
	public static WebElement txt_veh_owner_mobilenumber(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span"));
	    										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[3]/div[2]/span
	    return element;

	    }
	 
	//for ownername must contain letters

	public static WebElement txt_veh_ownernamee(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/span"));
	    										//*[@id="page-wrapper"]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span
	    return element;

	    }

	//for exp date validation

	public static WebElement txt_veh_expda(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[4]/div[2]/span"));
	    										
	    return element;

	}
	}
