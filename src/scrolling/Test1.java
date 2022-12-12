package scrolling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://stackoverflow.com/questions/8534563/what-is-an-exception-controlled-loop");
	      
		  Thread.sleep(3000);
		
		//ChromeOptions co=new ChromeOptions();
		driver.manage().deleteAllCookies();
		
	}

}
