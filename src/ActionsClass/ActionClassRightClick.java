package ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionClassRightClick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	      //1
		    WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//2 create object and pass driver object
		    Actions act= new Actions(driver);

		//act.moveToElement(rightClickButton).perform();
		//act.contextClick(rightClickButton).perform();
		
		act.moveToElement(rightClickButton).contextClick().build().perform();

		
		
		
	}

}
