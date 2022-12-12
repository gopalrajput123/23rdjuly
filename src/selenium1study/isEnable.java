package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class isEnable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebElement text=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		Thread.sleep(1000);
		if(button.isEnabled())
		{
			button.click();
		}
		else
		{
			text.sendKeys("7020368130");
			button.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
