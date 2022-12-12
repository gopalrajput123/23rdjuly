package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1FB {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
	     // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rupali");
	      
	      Thread.sleep(1000);
	   //   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("7798520753");

	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

	      Thread.sleep(5000);
	      driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mona");
		
	      Thread.sleep(1000); 
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Girase");

	      Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9421612087");

	      Thread.sleep(5000);
		   driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("gopal");
		   
	      Thread.sleep(5000);
		  WebElement gh = driver.findElement(By.name("birthday_day"));
		  Select bd=new Select(gh);
		  bd.selectByValue("24");
		  
	      Thread.sleep(5000);
		  WebElement kl = driver.findElement(By.name("birthday_month"));
		  Select bm=new Select(kl);
          bm.selectByVisibleText("Dec"); 
          
	      Thread.sleep(5000);
		  WebElement rt = driver.findElement(By.name("birthday_year"));
		  Select by=new Select(rt);
		  by.selectByVisibleText("1995");
		  
	      Thread.sleep(5000);
		  driver.findElement(By.xpath("//label[text()='Female']")).click();

		  
		 
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
	}

}
