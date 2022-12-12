package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedIfram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demoqa.com/nestedframes");
	        
		    WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
	        System.out.println(mainPageElement.getText());
		      
		    driver.switchTo().frame("frame1");  //switch from main page to parent page
		    
		    WebElement parentPageElement = driver.findElement(By.xpath("//body[text()='Parent frame']"));
	        
	        System.out.println(parentPageElement.getText());
	        
	        Thread.sleep(3000);
	         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	        Thread.sleep(3000);
		   String childText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	       System.out.println(childText);
	       
		
		
		
	}

}
