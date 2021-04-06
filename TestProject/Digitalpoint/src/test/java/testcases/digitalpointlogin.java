package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.browserEngine;

public class digitalpointlogin {
	
	public static WebDriver driver;
	@BeforeMethod
	public static void openbrowser()
	{
		driver= browserEngine.browserSetup();
		System.out.println("browser will be opened");
	}
	@Test
	public static void digitalpointloginpageValidation() throws InterruptedException
	
	{
		//customized Xpath
		//how to find Links:
		//1. //a[text()='features']
		//2. //a[contains(text),'features']
		//how to find buttons:
		//1 //button[contains(text(),'signup')]
		//2 //button[@type='button' and @class='btn']
		
		driver.get("https://forum.digitalpoint.tech/user/index.php/login");
		String loginatitle=driver.getTitle();
		String loginetitle="Digital Point - Forum | User Login";
		Assert.assertEquals(loginatitle, loginetitle);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hevelom4@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bosena4335");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"navbar-right\"]/li/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-right\"]/li/ul/li/a")).click();
		Thread.sleep(4000);
		
	}
	@AfterMethod
	public static void closebrowser()
	{
		driver.close();
		System.out.println("browser closed successfully");
	}

}
