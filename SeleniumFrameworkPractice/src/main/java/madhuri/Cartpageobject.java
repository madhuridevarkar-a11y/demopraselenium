package madhuri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import madhuri.Base.BaseTestobject;

public class Cartpageobject extends BaseTestobject{
	
WebDriver driver;
	
	public Cartpageobject (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath ="//div[@class='cartSection']/h3")
	List<WebElement> cartproduct;
	
	 @FindBy(xpath="//button[contains(text(),'Buy Now')]")
	WebElement BuyNow ;
	
	public Boolean verifycartpage(String productname) {
		
	
	    Boolean Match = cartproduct.stream().anyMatch(product->product.getText().equalsIgnoreCase(productname));
	    return Match;
		}
	
	public void checkout() {
		
		BuyNow.click();
	    
		}
	

}
