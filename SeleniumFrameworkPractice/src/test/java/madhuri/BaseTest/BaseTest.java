package madhuri.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import madhuri.LoginPageObject;

public class BaseTest {
	public  WebDriver driver;
	public LoginPageObject login;

	public  WebDriver  initializedriver() throws IOException 
	{	
	Properties prop = new 	Properties();
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\madhuri\\resources\\config.properties");
	prop.load(file);
	String browsername = prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome")) {
	 driver = new ChromeDriver();
	}
	else {
		 System.setProperty("webdriver.gecko.driver", "C:\\path\\to\\geckodriver.exe");
	         driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	return driver;
}
	
	public List<HashMap<String, String>> getdatafromjson(String filePath) throws IOException {
		
		//read and scan json file data nd convert ito string
		String jasoncontent =FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);
		//Convert string to hasmap (jackson databind)
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<HashMap<String, String>> data= mapper.readValue(jasoncontent, new TypeReference<List<HashMap<String, String>>>(){
			});
		return data;
		
	}
	
	
	public String TakeScreenshot(String Testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File (System.getProperty("user.dir")+"//reports//"+Testcasename+".png"));
        return System.getProperty("user.dir")+"//reports//"+Testcasename+".png";

	}
	
	@BeforeMethod(alwaysRun=true)
	public LoginPageObject launchapp() throws IOException {
		
		driver = initializedriver();
	    login = new LoginPageObject(driver);
		login.loginpage();
		return login;
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void closewindow(){
	 driver.quit();
		
	}
}