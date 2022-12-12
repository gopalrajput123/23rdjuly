import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.google.com/");
	    Thread.sleep(500);
	    driver.findElement(By.name("q")).sendKeys("Laptop");
	    Thread.sleep(500);

	    
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		for(WebElement i:items)
		{
			System.out.println(i.getText());
		}
		System.out.println("=============forLoop===========");

		for(int i=0;i<=9;i++)
		{
			System.out.println(items.get(i).getText());
			
			String expectedresult="laptop games";
			String actualr=items.get(i).getText();
			if(expectedresult.equals(actualr))
			{
				items.get(i).click();
				break;
			}
		}
		System.out.println("========================");

		driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(500);
        List<WebElement> list = driver.findElements(By.tagName("img"));
		System.out.println(list.size());
	    Thread.sleep(1000);driver.close();

		
	}

}
