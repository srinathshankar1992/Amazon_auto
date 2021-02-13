package Amazon.Automate;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import PagObjects.ChildWindows;
import Resource.Base;

public class HandlingChildWindows extends Base {

	ChildWindows cw;
	
	@Test()
	public void handlechildwindows() throws IOException, InterruptedException
	{
		initializedriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#\"");
		cw= new ChildWindows(driver);
		cw.child().click();
	Set<String> gw=	driver.getWindowHandles();
	Iterator<String> abc=gw.iterator();
    
	String bmw;
	
	//uncomment beow code to get title of all child windows
	/*while(abc.hasNext())
	{
		
		 bmw=abc.next();
		driver.switchTo().window(bmw);
		System.out.println(driver.getTitle());
		
	}*/
		
	String parent =abc.next();
	String child = abc.next();
	
	driver.switchTo().window(child);
	cw.regButtoninchildwindow().click();
	
	
	}
	
}

