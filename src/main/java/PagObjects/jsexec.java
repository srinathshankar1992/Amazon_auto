package PagObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jsexec {

	public WebDriver driver;
	By Demo = By.xpath("//a[contains(text(),'Demos')]");
	
	public jsexec(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement demohighlight()
	{
		return driver.findElement(Demo);
	}
}
