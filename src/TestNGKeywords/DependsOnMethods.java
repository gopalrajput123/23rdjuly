package TestNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods
{
	 @Test(dependsOnMethods= {"B"})
	  public void A() 
	  {
		  Reporter.log("A TC is running",true);  
	  }
	  
	 @Test
	  public void D() 
	  {
		  Reporter.log("D TC is running",true);  
	  }
	 
	 @Test(dependsOnMethods= {"D"})
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
