package ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassClick {

	public static void main(String[] args)  throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
	      
		  Thread.sleep(1000);
		   // WebElement homePageElement = driver.findElement(By.xpath("//a[text()='HOME ']"));
		   // homePageElement.click();
		    //using Action class click on element
		    
		    //1 identify an element and store into ref variables
		    
		    WebElement homePageButton = driver.findElement(By.xpath("//a[text()='HOME ']"));

		   //create an object of Action class and pass driver object
		    Actions act= new Actions(driver);

		  //3. Using one of the actions class method take action
		  //1st way
		   act.moveToElement(homePageButton).perform();
		   act.click().perform();
		
         //2nd Way
		  // act.moveToElement(homePageButton).click().build().perform();
		   
		   //3rdWay
		  // act.click(homePageButton).perform();
		
		
	}

}
