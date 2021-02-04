package Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {

public static ExtentReports extent;

public static ExtentReports getExtentReportshere()
{

	String path = System.getProperty("user.dir")+"\\ExtentReports\\index.html";

	ExtentSparkReporter extspark = new ExtentSparkReporter(path);
	extspark.config().setDocumentTitle("amazon");
	extspark.config().setReportName("Automated");
	
	extent= new ExtentReports();
	extent.attachReporter(extspark);
	extent.setSystemInfo("Tester", "Srinath shankar");
	return extent;
	}
	
	
}
	

