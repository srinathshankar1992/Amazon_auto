package Amazon.Automate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PagObjects.goibibicalender;
import Resource.Base;

public class goibibo extends Base {

	WebDriverWait wait;
	public goibibicalender gb;

	@Test
	public void calendercheck() throws IOException, InterruptedException {
		initializedriver();
		driver.get("https://www.goibibo.com/");
		gb = new goibibicalender(driver);
		gb.typeoftrip().click();
		gb.source().sendKeys("Bengaluru");

		WebElement src = driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion lh1-3']"));
		String fro = src.getText();
		if (fro.contains("Bengaluru")) {
			src.click();
		}

		gb.dest().sendKeys("Mysuru");
		WebElement dest = driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion lh1-3']"));
		String des = dest.getText();
		if (des.contains("Mysore")) {
			dest.click();
		}
		gb.departure().click();

		for (int i = 0; i < 12; i++) {
			if (gb.monthanddatetago().getText() != "May 2021") {
				gb.next().click();
				String dated = gb.monthanddatetago().getText();
				System.out.println(dated);
			}

			if (gb.monthanddatetago().getText().equalsIgnoreCase("May 2021")) {
				WebElement toveselecteddate = driver.findElement(By.xpath("//div[@id='fare_20210515']"));
				toveselecteddate.click();
				Thread.sleep(2000);
				WebElement till = driver.findElement(By.xpath("//div[@id='fare_20210519']"));
				till.click();
				break;
			}
		}
	  gb.traveleco().click();
	  for(int i=0;i<2;i++) 
	  { 
	  gb.adultscountinc().click();
	  gb.child().click();
	  gb.infantfgalu().click();
	  }
	  gb.searchbtton().click();
	  gb.bookbutton().click();
	 

}
}