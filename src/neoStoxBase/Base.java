package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxutility.Utility;

public class Base
{
	protected WebDriver driver;
	public void LaunchBrowser()
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.get("https://neostox.com/sign-in");
		 driver.manage().window().maximize();
	      Utility.wait(driver,1000);
	}
	
	public static void ClosingBrowser(WebDriver driver) throws InterruptedException
	{
		
		  Reporter.log("closing browser",true);
		  Thread.sleep(500);
		  driver.close();
		  
		  
		  
		  
		  
	}

}
