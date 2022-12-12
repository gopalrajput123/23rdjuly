package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut 
{
	@Test
	  public void A() 
	  {
		  Reporter.log("A TC is running",true);  
	  }
	  
	 @Test(timeOut=2000)
	  public void D()  throws InterruptedException 
	  {
		 Thread.sleep(1000);
		  Reporter.log("D TC is running",true);  
	  }
	 
	 @Test
	 public void C() 
	 {
		  Reporter.log("C TC is running",true);  
	 }
	 
	 @Test
	 public void E() 
	 {
		  Reporter.log("E TC is running",true);  
	 }
	 
	 @Test
	 public void B() 
	 {
		  Reporter.log("B TC is running",true);  
	 }

}
