package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

	public static void main(String[] args)throws IOException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 
	      driver.get("https://flipkart.com/");
	     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	     System.out.println(source);
	     Calendar cal = Calendar.getInstance();
	     Date time = cal.getTime();
	     System.out.println(time);
	     String timeStamp = time.toString().replace(":", "").replace(" ", "");
	     System.out.println(timeStamp);

	     File destination = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\test"+timeStamp+".png");
		
	     FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		
		
		

	}

}
