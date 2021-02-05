package PagObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	

By dropdownlist = By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']");
By Search = By.id("nav-search-submit-button");	

public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement dropdown()
	{
		return driver.findElement(dropdownlist);
	}
	public WebElement search()
	{
		return driver.findElement(Search);
	}
	
	
	
	
	
}
