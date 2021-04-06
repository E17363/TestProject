package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Digitalpoint-Software\\XPATH_AUTOMATION\\Digitalpoint\\driver\\geckodriver.exe");
		//driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//1 get the total count of links on the page
		//2 get the text of each link on the page
		//3 all the links are represented by <a> html tag
		//driver.get("https://forum.digitalpoint.tech/");
		driver.get("https://www.facebook.com/");
		List <WebElement>linkList= driver.findElements(By.tagName("a"));
		
		//List <WebElement>linkList= driver.findElements(By.tagName("input"));
		
		//List <WebElement>linkList= driver.findElements(By.tagName("button"));
		
		//size of linkList
		
		System.out.println(linkList.size());
		for(int i=0; i<linkList.size(); i++) {
			
			String linkText=linkList.get(i).getText();
		}
	}
	

}
