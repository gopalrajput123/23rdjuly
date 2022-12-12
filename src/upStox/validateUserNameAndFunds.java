package upStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShot.Scrolling;

import org.openqa.selenium.By;

public class validateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://login-v2.upstox.com/");
		
		 Thread.sleep(1000);
		//login to application
		//sending userID
		driver.findElement(By.name("userId")).sendKeys("6VBYG9");
		//sending password
		driver.findElement(By.name("password")).sendKeys(" Nikhil@1234");
		//click on sign in button
		driver.findElement(By.id("submit-btn")).click();
		//nevigate to passcode page
		 Thread.sleep(1000);
		driver.findElement(By.name("yob")).sendKeys("1993");
		//click on cancel trip(no I am good)
		 Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
        
        //navigating to Home page
        Thread.sleep(1000);
        //validate UserName
		
		String expectedUN="Nikhil S.";
		WebElement usernamefield = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
        Thread.sleep(500);
		//calling common scrolling method
        Scrolling.scrollIntoView(driver,usernamefield);
        Thread.sleep(500);
        String actualUN = usernamefield.getText();
		
        if(expectedUN.equals(actualUN))
        {
        	System.out.println("Actual and expected username are mathing,TC passed");
        }
        else
        {
        	System.out.println("Actual and expected username are not mathing,TC failled");

        }
      //validate funds
      //clicking on funds button
        driver.findElement(By.id("funds")).click();
        Thread.sleep(500);
        String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
        
        System.out.println("Funds Available to trade is "+funds);

        driver.close();
        
	}

}
