package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wholetableEg2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
	    List<WebElement>  table=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr"));
		
		for(WebElement t2:table)
		{
			System.out.println(" || "+t2.getText()+" || ");
			//System.out.println();
		}
		
		

	}

}
