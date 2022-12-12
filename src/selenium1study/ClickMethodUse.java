package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickMethodUse {

	public static void main(String[] args) 
	{		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
	      
		    //  driver.findElement(By.xpath("//button[@name='login']")).click();
			
		    WebElement id = driver.findElement(By.xpath("//button[@name='login']"));
			id.click();
			
		
		
		
		
		
		
		
	}

}
