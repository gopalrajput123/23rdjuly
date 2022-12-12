package verificationUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class MyTC {
  @Test
  public void f()
  {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
	  
		// if(checkBox1.isSelected())
			// {
			// Reporter.log("CheckBox is selected TC is PASSED",true);
			// }
			//
			// else {
			// Reporter.log("CheckBox is not selected TC is FAILED",true);
			//
			// }
		 
		 Assert.assertTrue(checkbox1.isSelected(),"checkbox is not selected TC is failed");
		 checkbox1.click();
  }
}
