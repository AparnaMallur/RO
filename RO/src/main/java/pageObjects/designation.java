package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class designation {

	private static WebElement element = null;
	 public static WebElement designationMenu(WebDriver driver){
		 
      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a/span[1]"));
    
      return element;
	
}
	 public static WebElement add_designationMenu(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[1]/a"));
	    
	      return element;
		
	}
	 public static WebElement txt_desg_name(WebDriver driver){
		 
		    element = driver.findElement(By.id("desg_name"));

		    return element;

	 }
	 public static WebElement AdddesignationReset(WebDriver driver){
		 
	        element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/button[1]"));

	        return element;

	 }
	    public static WebElement AdddesignationSubmit(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/button[2]"));

	        return element;

	 }
}