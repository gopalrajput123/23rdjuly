package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	        
		    //  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rupali");
			   
		     // Thread.sleep(500);
		   //   driver.findElement(By.xpath("//input[@type='text']")).clear();		
			
		   //   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rupali Deshmukh");

		      
		      WebElement userID = driver.findElement(By.xpath("//input[@type='text']"));
		      userID.sendKeys("Rupali");
		      
		      Thread.sleep(500);
		      userID.clear();
		      
		      Thread.sleep(1000);
		      userID.sendKeys("Rupali Deshmukh");
		      
		      Thread.sleep(1000);
		      driver.findElement(By.id("pass")).sendKeys("5555555");
		      
		      
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
