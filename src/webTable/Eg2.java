package webTable;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Eg2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
		
	    List<WebElement>  table=driver.findElements(By.xpath("//table[@id='product']"));
		
	    //outer foorloop for rows -->varys for-->1 to 11
	    for(int i=1;i<=11;i++)
	    {
	    	//neasted forloop/innerforloop for columns-->varys from-->1 to 3
	    	for(int j=1;j<=3;j++)
	    	{
	    	
	      if(i==1)
	      {
	    	  String value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
	    	  System.out.print(value+" || ");
	      }
	      else
	      {
	    	  String value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
	    	  System.out.print(value+" || ");

	      }
	      

	    	}
	    	System.out.println();
	    }
	    
	    
   	System.out.println("===========for each loop==========");
   
	    for(WebElement t:table)
	    {
	    	System.out.print(t.getText()+" || ");
	    	System.out.println();
	    }
		 System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
