package webTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Eg1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
		
	    WebElement data=driver.findElement(By.xpath("(//table[@id='product'])//tr[1]//th[1]"));
		System.out.println(data.getText());
		
		//to read header row-->th
		for(int i=1;i<=3;i++)
		{
		WebElement data1=driver.findElement(By.xpath("(//table[@id='product'])//tr[1]/th["+i+"]"));
		System.out.print(data1.getText()+ " ");
		}
		
		//to read row 4
		for(int i=1;i<=3;i++)
		{
			WebElement data2=driver.findElement(By.xpath("(//table[@id='product'])//tr[4]/td["+i+"]"));
			System.out.print(data2.getText()+ " ");

		}
		

	}

}
