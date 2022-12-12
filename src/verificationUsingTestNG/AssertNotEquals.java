package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertNotEquals {
  @Test
  public void TC2() 
  {
	  
	  String a="mona";
	  String b="mona";
	  String c="Tanu";
	  
	  Assert.assertNotEquals(b,c,"b and c are not matching TC is failed");
	  
	  
	  
	  
  }
  
  
}
