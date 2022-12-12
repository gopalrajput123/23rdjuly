package upStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShot.Scrolling;

public class validateUsernameAndFundsUsingExcel {


	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		//read data from excel
		 File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
		 Sheet mysheet=WorkbookFactory.create(myFile2).getSheet("Sheet6");
		String un = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		//login to application
		//sending userID
		driver.findElement(By.name("userId")).sendKeys(un);
		
		//sending password
		driver.findElement(By.name("password")).sendKeys(mysheet.getRow(0).getCell(1).getStringCellValue());
		
		//click on sign In button
		driver.findElement(By.id("submit-btn")).click();
		
		//navigating to passcode page
		Thread.sleep(1000);
		
	    driver.findElement(By.id("yob")).sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue());
		
		//click on cancel trip(no I am good)
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		//navigating to Home page
		Thread.sleep(1000);
		
		//validate UserName
		String expectedUN="Nikhil S.";
		WebElement usernamefield = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		Thread.sleep(500);

		Scrolling.scrollIntoView(driver, usernamefield);
		Thread.sleep(500);
		String actualUN = usernamefield.getText();
		if(expectedUN.equals(actualUN))
		{
		System.out.println("Actual and Expected UserNames are matching, TC passed");
		}
		else
		{
		System.out.println("Actual and Expected UserNames are not matching, TC Failed");
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
