package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserEngine {
	public static WebDriver driver;
	
	public static WebDriver browserSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\geckodriver.exe");
		//driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

}
