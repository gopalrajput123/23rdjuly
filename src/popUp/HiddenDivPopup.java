package popUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HiddenDivPopup {

	public static void main(String[] args)throws InterruptedException
	{		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(500);
		
		// finding element present on pop up and closing popup

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(500);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("womens dress");
		 Thread.sleep(500);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

	}
	

}
