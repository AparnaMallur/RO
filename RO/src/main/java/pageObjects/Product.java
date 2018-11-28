package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {

	private static WebElement element = null;
	 public static WebElement ProductMenu(WebDriver driver){
		 
       element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span[1]"));
     
       return element;
	
	
}
   public static WebElement AddProduct(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a"));
 
         return element;
 
  }
   public static WebElement txt_searchValue(WebDriver driver){
		 
	    element = driver.findElement(By.id("searchValue"));

	    return element;

	    }
    public static WebElement txt_prod_name(WebDriver driver){
	 
    element = driver.findElement(By.id("prod_name"));

    return element;

    }
    public static WebElement txt_prod_qty(WebDriver driver){
	 
    element = driver.findElement(By.id("prod_qty"));

    return element;

    }
    public static WebElement txt_prod_unit(WebDriver driver){
   	 
        element = driver.findElement(By.id("prod_unit"));

        return element;

        }
    public static WebElement txt_prod_gst(WebDriver driver){
      	 
        element = driver.findElement(By.id("prod_gst"));

        return element;

        }
    public static WebElement txt_prod_hsn_no(WebDriver driver){
     	 
        element = driver.findElement(By.id("prod_hsn_no"));

        return element;

        }
    public static WebElement txt_opening_stock(WebDriver driver){
    	 
        element = driver.findElement(By.id("opening_stock"));

        return element;

        }
    public static WebElement AddProductReset(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[7]/div[2]/button[1]"));

        return element;

 }
    public static WebElement AddProductSubmit(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[7]/div[2]/button[2]"));

        return element;

 }
}
    