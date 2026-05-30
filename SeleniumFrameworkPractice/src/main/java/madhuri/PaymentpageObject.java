package madhuri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import madhuri.Base.BaseTestobject;

public class PaymentpageObject extends BaseTestobject {

	
	WebDriver driver;
	public PaymentpageObject(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	} 
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement SelectCountry;
	
	@FindBy(xpath="//button[contains(@class,'list-group-item')]")
	List<WebElement> CountryName;
	
	@FindBy(xpath="//a[contains(text(),'Place Order')]")
	WebElement PlaceOrder;
	
	public void paymentdetails() {
	SelectCountry.sendKeys("india");
	CountryName.get(1).click();
	PlaceOrder.click();
}
}