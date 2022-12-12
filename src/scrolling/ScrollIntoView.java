package scrolling;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ScrollIntoView {

	public static void main(String[] args)throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			 driver.get("https://vctcpune.com/selenium/practice.html");
		      
			  Thread.sleep(200);
			  WebElement text=driver.findElement(By.id("displayed-text"));
			  
	     	//scroolIntoView
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    
             js.executeScript("arguments[0].scrollIntoView(true)",text);
             
             text.sendKeys("hello");
		
		
            // File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
            // System.out.println(source);
    	     
 	       // File destination = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\MyScreenShot.png");
 		
 	    // FileHandler.copy(source, destination);
 		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
	}

