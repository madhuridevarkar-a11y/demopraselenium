package madhuri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import madhuri.Base.BaseTestobject;
import madhuri.BaseTest.BaseTest;

public class LoginpageTest  extends BaseTest  {

	
	@Test (groups= {"ErrorValidation"})
	
	public void loginitoapp() {
		
	login.Logininto("james.acclex@gmail.com", "Quality@2233");
	Assert.assertEquals("Incorrect email or password.", login.verifyerror());
	
}

	
	
	

}
