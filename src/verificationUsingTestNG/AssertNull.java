package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertNull {
  @Test
  public void nulltc()
  {
	  String a= "abc";
	  String b=null;
	  //TC should be passed if a is null
	  
	  //Assert.assertNull(a,"a is not null TC is failed");
	  Assert.assertNull(b,"b is not null TC is failed");
  }
}
