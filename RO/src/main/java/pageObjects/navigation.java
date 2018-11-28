package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigation {

	private static WebElement element = null;
	 public static WebElement Dashboard(WebDriver driver){
		 
      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a/span[1]"));
    
      return element;
}
	 public static WebElement Vehicle(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]"));
	    
	      return element;
	}
	 public static WebElement Add_Vehicle(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
	    
	      return element;
	}
	 public static WebElement Product(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span[1]"));
	    
	      return element;
	}
	 public static WebElement Add_Product(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a"));
	    
	      return element;
	}
	 public static WebElement Attendance(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]"));
	    
	      return element;
	}
	 public static WebElement Designation(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a/span[1]"));
	    
	      return element;
	}
	 public static WebElement Change_Password(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/span"));
	    
	      return element;
	}
	 public static WebElement Logout(WebDriver driver){
		 
	      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a/span"));
	    
	      return element;
	}
}