package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class changepassword {
	
	private static WebElement element = null;
	 public static WebElement changepasswordMenu(WebDriver driver){
		 
      element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[9]/a/span"));

      return element;

}
	 public static WebElement txt_old(WebDriver driver){
		 
		    element = driver.findElement(By.id("old"));

		    return element;

		    }
	 public static WebElement txt_new(WebDriver driver){
		 
		    element = driver.findElement(By.id("new"));

		    return element;

		    }
	 public static WebElement txt_new_confirm(WebDriver driver){
		 
		    element = driver.findElement(By.id("new_confirm"));

		    return element;

		    }
	  public static WebElement changepasswordsubmit(WebDriver driver){
			 
	        element = driver.findElement(By.name("submit"));

	        return element;

	 }
}
	 