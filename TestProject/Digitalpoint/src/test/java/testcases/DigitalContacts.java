package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.browserEngine;

public class DigitalContacts {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openbrowser()
	{
		driver= browserEngine.browserSetup();
	}
	@Test
	public static void Validatecontactpage()
	{
		driver.get("https://digitalpoint.tech/");
		driver.findElement(By.xpath("//*[@id=\'navbar\']/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("//input[@type='text' and @id='name']")).sendKeys("Emanuel");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hevelom4@gmail.com");
		driver.findElement(By.xpath("//input[@type='text' and @name='subject1']")).sendKeys("devops");
		driver.findElement(By.xpath("//*[@id=\'message\']")).sendKeys("i will do my best to full fill my goal");
	}
	@AfterMethod
	public static void browserclosed()
	{
		driver.close();
		System.out.println("browser closed successfully");
	}

}
