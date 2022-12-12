package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class isDesply {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      WebElement button1 = driver.findElement(By.id("hide-textbox"));
	      
	      WebElement button2 = driver.findElement(By.id("show-textbox"));
	      
	      WebElement text = driver.findElement(By.id("displayed-text"));
         
		if(text.isDisplayed())
		{
			text.sendKeys("hii");
		}
		else {
			button2.click();
			text.sendKeys("good mornig");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
