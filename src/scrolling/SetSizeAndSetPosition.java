package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndSetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
	      
	     Thread.sleep(1000);
		
         Dimension size = driver.manage().window().getSize();		
         System.out.println(size);
		
         Dimension d=new Dimension(1500,300);
         driver.manage().window().setSize(d);
	     Thread.sleep(1000);

         Dimension d1=new Dimension(350,1300);
         driver.manage().window().setSize(d1);
         
         Thread.sleep(1000);
		  driver.close();
		    
         SetSizeAndSetPosition sp=new SetSizeAndSetPosition();
         sp.position();
         
	}
 
	    public void position() throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		    driver.get("https://vctcpune.com/selenium/practice.html");
		      
		    Thread.sleep(1000);
		    Point dPosition = driver.manage().window().getPosition();  
			System.out.println(dPosition);
			
			Point p=new Point(150,10);
		    driver.manage().window().setPosition(p);
		    Thread.sleep(1000);
		    driver.close();
		    
		    
		    
		    
		    
	    }
}
