package popUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class alertPopup {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://demoqa.com/alerts");
		 Thread.sleep(1000);

		 driver.findElement(By.xpath("//button[@id='alertButton']")).click();;// after clicking on this
		// button we will get Alert
		
		//1. To handle alert popup we need to switch selenium focus from
		// main page to alert popup by using syntax
		 //Alert alt = driver.switchTo().alert();
		 
		 Alert alt=driver.switchTo().alert();
		 
		// 2. Alert is an interface which contains abstract methods like:
			// 1. accept(): use to click on ok button.
			// 2. dismiss(): use to click on cancel button.
			// 3. getText(): use to get text present in a alert popup.
		 
		//System.out.println( alt.getText());
		  
		 //alt.accept();
		 Thread.sleep(500);
		  String text=driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		 System.out.println(" text");
	}

}
