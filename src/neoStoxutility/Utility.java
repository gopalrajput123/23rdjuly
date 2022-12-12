package neoStoxutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.openqa.selenium.TakesScreenshot;


public class Utility
{

	//commonly used Methods
	//excel reading, screenshot, wait, scrolling
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	
	{
	File MyFile=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
	
	Sheet mysheet= WorkbookFactory.create(MyFile).getSheet("Sheet6");
	
	String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	
	Reporter.log("entering data from excel",true);
	
	return value;

	}
	
		public static void getScreenshots(WebDriver driver,String fileName) throws IOException
    {	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File destination = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\test"+fileName+".png");
			
		FileHandler.copy(src, destination);
			
	     Reporter.log("take screenshot",true);	
		
		
	}
		public static void scrollIntoView(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
			Reporter.log("scrolling into view "+element.getText(),true);

		}
		public static void wait(WebDriver driver, int waittime)
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for "+waittime+"milis",true);
		
		}
		public static String readDataFromPropertyFile(String key) throws IOException
		{
			//create object of properties class
			Properties prop=new Properties();
			//create object of FileInputStream class
			FileInputStream Myfile=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium1\\neoStox.properties");
            prop.load(Myfile);
            String value = prop.getProperty(key);
			return value;
		}
		
}
