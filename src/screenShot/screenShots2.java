package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;


public class screenShots2 {

	public static void main(String[] args)throws IOException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://flipkart.com/");
	     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     String s=RandomString.make(5);
	     System.out.println(source);
	     
	        File destination = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\test"+s+".png");
		
		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		
		
		

	}

}
