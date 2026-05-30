package madhuri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import madhuri.BaseTest.BaseTest;

public class StandaloneTestcase extends BaseTest {

	
		// TODO Auto-generated method s
	//String productname = "ADIDAS ORIGINAL";	
		
		
	@Test(dataProvider="getData" , groups={"Purchase"})
		
		public void test(HashMap <String, String> input) throws InterruptedException, IOException
		{
		
		
		login.Logininto(input.get("email"),input.get("Password"));
		AddtoCartPageObject AddtoCartitem = new AddtoCartPageObject(driver);
		List<WebElement> products =AddtoCartitem.getproductlist();
		AddtoCartitem.addproduct(input.get("product"));
		Thread.sleep(10000);
		AddtoCartitem.cartpagegoto();
		Cartpageobject cartpage = new Cartpageobject(driver);
		Boolean match =cartpage.verifycartpage(input.get("product"));
		Assert.assertTrue(match);
		cartpage.checkout();
		PaymentpageObject payment= new PaymentpageObject(driver);
	    payment.paymentdetails();
		

		}
	
	@Test(dependsOnMethods="test")
	public void VerifyorderPage(String productname) 
	{
		login.Logininto("james.alex@gmail.com","Quality@2233");
		login.orderpagegoto();
		OrderPageObject orderpage = new OrderPageObject(driver);
		Boolean match =orderpage.getproductname(productname);
		Assert.assertTrue(match);
	

	}
	
	
	@DataProvider
	
	public Object[][] getData() throws IOException {
		
		List<HashMap <String, String >> data =getdatafromjson(System.getProperty("user.dir")+"\\src\\test\\java\\madhuri\\Data\\PurchaseOrder.json");

		
		
		
		return new Object[][] {{data.get(0)},{data.get(1)}};
		
		
	}
	
		
	}

