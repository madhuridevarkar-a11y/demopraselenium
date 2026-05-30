package madhuri.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport{
	
		public static ExtentReports report() {
	
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setReportName("Web automation test");
		
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(spark);
		return extent;
	}

}