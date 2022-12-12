package SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest
{
  @Test
  public void firefox()
  {
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		 driver.get("https://www.flipkart.com/");
	      
		 
	  
	  
  }
}
