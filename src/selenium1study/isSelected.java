package selenium1study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class isSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		  
	      
		WebElement result1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//result1.click();
		
		if(result1.isSelected())
		{
	     System.out.println("Selected option is"+result1);
			
		}
		else {
		     System.out.println(" option is not Selected "+result1);

		}
		
		
		
		
		
		
		
		

	}

}
