package madhuri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import madhuri.Base.BaseTestobject;

public class LoginPageObject extends BaseTestobject {
	
	WebDriver driver;
	
	public LoginPageObject (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement error;		
	
	
	public void Logininto(String Email, String Password ) {
		
		userEmail.sendKeys(Email);
		userPassword.sendKeys(Password);
		login.click();
		
		
		
	}
	
	public void loginpage() {
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		}
		
	
	public String verifyerror()  {
		
		waitWebelementToBevisible(error);
		return error.getText();
		
		
	}
	
	

}
