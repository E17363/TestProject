package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\geckodriver.exe");
			//driver=new InternetExplorerDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/b/Books/267/bn_1854946");
			//daynamic id: input
			//id = test_123
			//By.id("test_123")
			//id = test_456
			//id = test_789
			//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Books");
			driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("Art");
			driver.findElement(By.xpath("//input[@id,'test_']")).sendKeys("Test");
			driver.findElement(By.xpath("//input[statr-with(@id,'test_')]")).sendKeys("test");
		
	}

}
