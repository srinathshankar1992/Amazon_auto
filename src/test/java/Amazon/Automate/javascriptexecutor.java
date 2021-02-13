package Amazon.Automate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PagObjects.jsexec;
import Resource.Base;

public class javascriptexecutor extends Base {

	
	@Test
	public void javascriptmethod() throws IOException, InterruptedException
	{
	
		initializedriver();
		driver.get("https://jqueryui.com/");
		jsexec jsec= new jsexec(driver);
		Base.blinkanelement(jsec.demohighlight(), driver);
		getScreenshot("highlighted");
		Thread.sleep(4000);
		gettitleofwebpage(driver);
		javascripttoclickonelement(jsec.demohighlight(),driver);
		
		//java script to send values in text box
	js.executeScript("document.getElementsByName('s')[0].value='bfcd'");
	
	
	// syntax to find xpath in javascript
	
		//var xpathResult = document.evaluate(
				 // xpathExpression,-->Give xpath expression
				  //contextNode,-->From where? ans: document
				  //namespaceResolver,-->pass null
				  //resultType-->since it is from first node, give xpathresult.first_ordered_node_type,null
				  //result-->pass null
				//);
	
	//java script to send xpath(use document.evaluate("xpath",document(contextNode,namespaceResolver,resultType,result).singlenodevalue.value='value'");
	//js.executeScript("document.evaluate('//input[@type='text']',document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='abcd'");
	String abc=(String) js.executeScript("return document.getElementsByName('s')[0].value");
	System.out.println(abc);
	
	//to get title of webpage
	String titlebyjs=(String) js.executeScript("return document.title");
	System.out.println(titlebyjs);
	
	alertmessage(driver,"alert athu");
	driver.switchTo().alert().accept();
	
	
	 }
	
	@Test
	public void letscheck() throws InterruptedException
	{
		
		WebElement effects = driver.findElement(By.xpath("//h2[contains(text(),'Effects')]"));
		Scrollintoview(driver, effects);
		
		//to scroll down till end of the pageusing actions class
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
	}

}
	
	
	
