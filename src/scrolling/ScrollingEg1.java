package scrolling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.ixigo.com/trains/train-seat-availability?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_");
	      
		  Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  Thread.sleep(2000);
		js.executeScript("window.scrollBy(60,800)");
		
		  Thread.sleep(2000);
        js.executeScript("window.scrollBy(600,49)");
		
		  Thread.sleep(2000);
        js.executeScript("window.scrollBy(90,-800)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
