package madhuri;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import madhuri.Base.BaseTestobject;

public class OrderPageObject extends BaseTestobject{
	
	WebDriver driver;
	
	public OrderPageObject(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(this.driver, driver);
		
	}
	
	@FindBy(xpath="//tr/td[2]")
	List<WebElement> Orderproducts;
	
	public Boolean getproductname(String productname) {
		
		
		 Boolean Match = Orderproducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productname));
		    return Match;
	}

}
