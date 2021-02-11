package PagObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class goibibicalender {

	public WebDriver driver;
	
	
	By type= By.id("roundTrip");
	By from = By.id("gosuggest_inputSrc");
	By to = By.id("gosuggest_inputDest");
	By Departure = By.id("departureCalendar");
	By Return = By.id("returnCalendar");
	By nextbutton = By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next");
	By monthanddate = By.xpath("//div[@class='DayPicker-Caption']");
	By TravellerEconomy = By.xpath("//div[@id='pax_link_common']");
	By IncreaseAdultscount = By.id("adultPaxPlus");
	By childincrease = By.id("childPaxPlus");
	By infants = By.id("infantPaxPlus");
	By searchbutton = By.id("gi_search_btn");
	By Book = By.xpath("//input[@value='BOOK']");
	
	//i[@class='blueGrey padR5 ico18 hypflt-from ']
	
	public goibibicalender(WebDriver driver)
	{
		
	this.driver=driver;
}
	
	public WebElement typeoftrip()
	{
		return driver.findElement(type);
	}
	
	public WebElement source()
	{
		return driver.findElement(from);
	}
	
	public WebElement dest()
	{
		return driver.findElement(to);
	}
	public WebElement departure()
	{
		return driver.findElement(Departure);
	}
	
	public WebElement next()
	{
		return driver.findElement(nextbutton);
	}
	public WebElement monthanddatetago()
	{
		return driver.findElement(monthanddate);
	}
	
	public WebElement returned()
	{
		return driver.findElement(Return);	
	}
	public WebElement traveleco()
	{
		return driver.findElement(TravellerEconomy);
	}
	
	public WebElement adultscountinc()
	{
		return driver.findElement(IncreaseAdultscount);
	}
	public WebElement child()
	{
		return driver.findElement(childincrease);
	}
	public WebElement infantfgalu()
	{
		return driver.findElement(infants);
	}
	
	public WebElement searchbtton()
	{
		return driver.findElement(searchbutton);
	}
	
	public WebElement bookbutton()
	{
		return driver.findElement(Book);
	}
}

