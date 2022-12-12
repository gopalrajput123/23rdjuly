package testNGstudySerialAndParellel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGSerialExecution
{
  @Test
  public void fA() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	  
		  driver.get("https://www.amazon.in/");
		 // Reporter.log("TC2 running",true);
  }
  
  
  
  
}
