package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getTextMethodUse {

	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
        
	     WebElement text = driver.findElement(By.xpath("//h1[contains(text(),' App')]"));
		   String actualResult=text.getText();
		System.out.println("actual result is "+actualResult);
		 
		          String expectedResult = "India's Most-loved Payments App";
		
		          if(actualResult.equals(expectedResult))
		          {
		        	  System.out.println("Result is Matching,TC is pass");
		          }
		          else {
		        	  System.out.println("Result is NOT Matching,TC is failed");

		          }
		          
		          
		         
		          
 
		          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
