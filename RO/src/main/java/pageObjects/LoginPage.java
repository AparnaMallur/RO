package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	 private static WebElement element = null;
	 public static WebElement txtbx_UserName(WebDriver driver){
		 
         element = driver.findElement(By.id("identity"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.name("password"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.xpath("/html/body/center/div/div/form/button"));
          
         return element;
 
         }

}
