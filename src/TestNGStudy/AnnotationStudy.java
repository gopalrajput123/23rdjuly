package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationStudy
{
  @Test
  public void myTest1()
  {
	  Reporter.log("my test1 test method is running",true);
  }
  
  @Test
  public void myTest2()
  {
	  Reporter.log("my test2 test method is running",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	 Reporter.log("before method is running",true);  
  }

  @AfterMethod
  public void afterMethod()
  {
	 Reporter.log("after method is running",true);  
 
  }

  @BeforeClass
  public void beforeClass() 
  {
	 Reporter.log("before class is running",true);  
 
  }

  @AfterClass
  public void afterClass()
  {
	 Reporter.log("before class is running",true);  
 
  }

}
