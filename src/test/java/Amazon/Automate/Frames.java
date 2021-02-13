package Amazon.Automate;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PagObjects.Frame;
import Resource.Base;

public class Frames extends Base {

	
	@Test
	public void draganddrop() throws IOException, InterruptedException
	{
		initializedriver();
	driver.get("https://jqueryui.com/droppable/");
	Frame fr = new Frame(driver);
	driver.switchTo().frame(fr.framepath());
	
	Actions act = new Actions(driver);
	
	
	act.dragAndDrop(fr.dragloc(), fr.droploc()).perform();
	driver.switchTo().defaultContent();
	//act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	for(WebElement link:fr.listofelements())
	{
	  link.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	}
	
	String mainwindow=driver.getWindowHandle();
	Set<String> newWindow=driver.getWindowHandles();
	Iterator<String> iterate=newWindow.iterator();
	while(iterate.hasNext())
	{
		
		String abc= iterate.next();
		driver.switchTo().window(abc);
		System.out.println(driver.getTitle());
		
	}
	driver.switchTo().window(mainwindow);
	fr.aboutlink().click();
	
	
	
	}
	
}
