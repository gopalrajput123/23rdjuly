package popUp;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class childPopup {

	public static void main(String[] args)throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://vctcpune.com/");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		Set<String> allpageID = driver.getWindowHandles();
		
		for(String mg:allpageID)
		{
			System.out.println("all page ID is "+mg);
		}
		
		Iterator<String> it = allpageID.iterator();
		String mainpageID = it.next();
		String secondtabID = it.next();
		
		//change to focus on main page to new tab
		driver.switchTo().window(secondtabID);
		Thread.sleep(500);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(500);

		Select s=new Select(dropdown);
		s.selectByVisibleText("Option2");
		Thread.sleep(500);

		driver.findElement(By.xpath("//option[text()='Option2']")).click();
		Thread.sleep(500);
		
        //change to focus on new tab to main page
		driver.switchTo().window(mainpageID);
		
         String mainpagetext = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		 System.out.println("main page text is "+mainpagetext);
	
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(source);
	     
	     File DL = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\MyScreenShot.png");
		
	     FileHandler.copy(source, DL);
		
}}
