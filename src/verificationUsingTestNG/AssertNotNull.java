package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertNotNull {
  @Test
  public void f() 
  {
	  String a="rupali";
	  
	  Assert.assertNotNull(a,"if a is null TC is failed ");
	  
	  
	  
  }
}
