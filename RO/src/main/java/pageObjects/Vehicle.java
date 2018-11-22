package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vehicle {
	 private static WebElement element = null;
	 public static WebElement vehicleMenu(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span[1]"));
 
         return element;
 
         }
 
     public static WebElement AddVehicle(WebDriver driver){
 
         element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a"));
 
         return element;
 
         }
     //Vehicle No textbox
     public static WebElement txt_vehicle_no(WebDriver driver){
    	 
         element = driver.findElement(By.id("veh_number"));
 
         return element;
 
         }
     //Vehicle Licence No
public static WebElement txt_vehicle_licenceno(WebDriver driver){
    	 
         element = driver.findElement(By.id("veh_licence_no"));
 
         return element;
 
         }
     //Vehicle Owner Name
public static WebElement txt_vehicle_ownername(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_owner_name"));

    return element;

    }
//Vehicle owner Mob No
public static WebElement txt_vehicle_ownermob(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_owner_mob_no"));

    return element;

    }
//Vehicle Driver Name
public static WebElement txt_vehicle_drivername(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_driver_name"));

    return element;

    }
//Vehicle Driver Mobile
public static WebElement txt_vehicle_drivermob(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_driver_mob_no"));
//driver.f
    return element;

    }
//Vehicle PUC Exp Date
public static WebElement txt_vehicle_pucExpDt(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_puc_exp_date"));

    return element;

    }
//Vehicle Insurance Exp Date
public static WebElement txt_vehicle_InsuExpDt(WebDriver driver){
	 
    element = driver.findElement(By.id("veh_ins_exp_date"));

    return element;

    }

     public static WebElement btn_Reset(WebDriver driver){
 
         element = driver.findElement(By.className("btn btn-default "));
                   
         return element;
 
         }
     public static WebElement btn_Submit(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[9]/div[2]/button[2]"));
                   
         return element;
 
         }
public static WebElement Manage_Vehicle(WebDriver driver) {
	element=driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[2]/a"));
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
public static WebElement tblVehicleList(WebDriver driver) {
	element=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table"));
	
	return element;
	
}
public static WebElement btnSearch(WebDriver driver) {
	element=driver.findElement(By.name("search"));
	
	return element;
	
}
}
