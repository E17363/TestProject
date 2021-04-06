package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utilities.browserEngine;

public class SelectDropdown {
	
	public static WebDriver driver;
	
	public static void openbrowser()
	{
		driver=browserEngine.browserSetup();
	}
  
  public static void validatdropdown() throws InterruptedException
  {
	  driver.get("https://forum.digitalpoint.tech/index.php/home/userregistration");
	 WebElement element= driver.findElement(By.name("language"));
	 Select sel = new Select(element);
	 sel.selectByIndex(0);
	 Thread.sleep(400);
	 
	 //sel.selectByIndex(0);
	 //sel.selectByVisibleText("Spanish");
	 //sel.selectByValue("Bangla");
	  
  }
  
}
