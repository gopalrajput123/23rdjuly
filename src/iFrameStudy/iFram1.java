package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFram1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			driver.switchTo().frame("iframeResult");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	

		
		
		
		
		
		
	}

}
