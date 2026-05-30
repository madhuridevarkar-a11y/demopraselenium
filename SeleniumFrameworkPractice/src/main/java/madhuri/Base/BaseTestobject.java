package madhuri.Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestobject {
	WebDriver driver;
	
public BaseTestobject (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}

@FindBy(xpath="//li/button[contains(text(), 'Cart')]")
WebElement cart;

@FindBy(xpath="//button[contains(text(),' ORDERS')]")
WebElement orders;

	public void maximizewindow() {
		driver.manage().window().maximize();
	}
	
	public void  waitelementToBeClickable(By findby) {
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.elementToBeClickable(findby));
	}
	
public void  waitWebelementToBevisible(WebElement findby) {
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOf(findby));
	}
	



public void getdatafromjson() {
	
	
}


public void cartpagegoto() {
	waitelementToBeClickable(By.xpath("//li/button[contains(text(), 'Cart')]"));
	cart.click();
}
	
public void orderpagegoto() {
	waitWebelementToBevisible(orders);
	orders.click();
}
}
