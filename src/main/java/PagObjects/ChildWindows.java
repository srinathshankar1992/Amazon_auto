package PagObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildWindows {

	WebDriver driver;
	
	By linkTextToChildWindow= By.xpath("//a[@href='https://rahulshettyacademy.com/#/documents-request']");
	By RegisterButton = By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/sign_up'])[1]");
	
	public ChildWindows(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement child()
	{
		return driver.findElement(linkTextToChildWindow);
	}
	public WebElement regButtoninchildwindow()
	{
		return driver.findElement(RegisterButton);
	}
	
}
