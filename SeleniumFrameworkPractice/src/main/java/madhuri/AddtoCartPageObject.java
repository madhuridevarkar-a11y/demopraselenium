package madhuri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import madhuri.Base.BaseTestobject;

public class AddtoCartPageObject extends BaseTestobject {
	
WebDriver driver;
	
	public AddtoCartPageObject (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}

	//List<WebElement> products= driver.findElements(By.xpath("//div[@class='card-body']/h5/b"));
	//driver.findElement(By.xpath("//button[contains(text(),'Add To Cart')]")).click();
	
	@FindBy(xpath="//div[@class='card-body']/h5/b")
	List<WebElement> products;
	
	@FindBy(xpath="//button[contains(text(),'Add To Cart')]")
	WebElement AddToCart;
	
	
	
	
public List<WebElement> getproductlist() {
	
		
	return products;
				
	}

public WebElement getproductname(String productname ) {
	
	WebElement DesiredProduct = getproductlist().stream().filter(s->s.getText().contains(productname)).findFirst().orElse(null);
	return DesiredProduct;
	
	}

	
public WebElement addproduct(String productname) {
	WebElement prod = getproductname(productname);
	
	prod.findElement(By.xpath("//button[contains(text(),'Add To Cart')]")).click();
	return prod;
}
		
}
 	