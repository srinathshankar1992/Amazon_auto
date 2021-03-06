package Resource;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public Properties prop;
	public Robot rb;
	public static JavascriptExecutor js;

	public WebDriver initializedriver() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\Details.properties");
	    prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("Browser");
		System.out.println(browsername);
		if (browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			return driver;
		} 
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.get(prop.getProperty("URL"));
			System.out.println(driver.getTitle());
			
			return driver;
			
		}

		return driver;
	}

	public String getExceldata(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		String data = null;
		File f = new File(System.getProperty("user.dir") + "\\Data\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		HSSFRow r = sheet.getRow(rowindex);
		HSSFCell cell = r.getCell(cellindex);
		DataFormatter df = new DataFormatter();
		data = df.formatCellValue(cell);
		wb.close();
		return data;

	}

	public void getScreenshot(String destination) throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		String dest = (System.getProperty("user.dir") + "\\Screenshots\\"+destination+".PNG");
		org.openqa.selenium.io.FileHandler.copy(source, new File(dest));

	}
	
	public HashMap<String, String> logindata()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "9901099928&Harshi'sdad@123");
		hm.put("2", "8884046381&Akshatha's husband");
		return hm;
	}
	
	public static void blinkanelement(WebElement element, WebDriver driver)
	{
		
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: Red; border: 2px solid red;');",element);
		
	}
	
	//to get title of the webpage
	
	public String gettitleofwebpage(WebDriver driver)
	{
		js= (JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		return title;
	}
	
	//to click on webelement(Can be used if we face any issues like stale element exception, etc)
public void javascripttoclickonelement(WebElement element,WebDriver driver)
{
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
}


// to get an alert message
public void alertmessage(WebDriver driver, String alerted)
{
	js=(JavascriptExecutor)driver;
	js.executeScript("alert('"+alerted+"')");
	
}

//to scroll down till element
public void Scrollintoview(WebDriver driver, WebElement element)
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	
}

public void scrollpagetilldown(WebDriver driver)
{
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrolTto(0,document.body.scrollHeight)");
}

}
