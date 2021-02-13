package PagObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

	WebDriver driver;
	By framepathinpage = By.xpath("//iframe[@class='demo-frame']");
	By dragElement = By.id("draggable");
	By droplocation = By.id("droppable");
	By linkTexttoAnotherWindow=By.xpath("//a[@href='https://jqueryui.com/resizable/']");
	By Iterations = By.xpath("(//aside[@class='widget'])[1]/ul/li/a");
	By About = By.xpath("//a[contains(text(),'About')]");
	
   public Frame(WebDriver driver)
   {
	   this.driver=driver;
   }
   
   public WebElement framepath()
   {
	   return driver.findElement(framepathinpage);
   }
   
   public WebElement dragloc()
   {
	   return driver.findElement(dragElement);
   }
	
   public WebElement droploc()
   {
	   return driver.findElement(droplocation);
   }
   
   public WebElement link()
   {
	   return driver.findElement(linkTexttoAnotherWindow);
   }
   
   public List<WebElement> listofelements()
   {
	   return driver.findElements(Iterations);
   }
   
   public WebElement aboutlink()
   {
	   return driver.findElement(About);
   }
}
