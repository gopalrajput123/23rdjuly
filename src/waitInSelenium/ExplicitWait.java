package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplicitWait {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
	    
	  //explicit wait 1-->parameter-->time, 2-->parameter-->condition
	    
	    WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(30000));
		
	    WebElement signInButton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
	    w.until(ExpectedConditions.visibilityOf(signInButton));
		
	    signInButton.click();
	    
	    driver.close();
	}

}
