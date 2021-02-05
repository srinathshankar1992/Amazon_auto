package Amazon.Automate;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PagObjects.HomePage;
import PagObjects.LoginHere;
import Resource.Base;

public class Login extends Base {

	
	LoginHere lgh;
	@Test
	public void login() throws IOException, InterruptedException
	{
	initializedriver();
	}
	
	@Test
	public void nowLoginClick()
	{
		lgh = new LoginHere(driver);
		Actions act = new Actions(driver);
		act.moveToElement(lgh.loginlinkbutton()).build();
		lgh.loginlinkbutton().click();
		
		//driver.close()
		}
	
	
	@Test
	public void o_getlogindata() throws IOException
	{
		String logindata =logindata().get("1");
		System.out.println(logindata);
		String arr[]=logindata.split("&");
        String username =arr[0];		
        String password = arr[1];
        lgh = new LoginHere(driver);
        lgh.mailid().sendKeys(username);
        lgh.continueButtonClick().click();
        lgh.SendPassword().sendKeys(password);
        getScreenshot("username is sent and the password is encrypted");
        lgh.SigninbuttonClick().click();
        }
	
	@Test
	public void p_selectAnOptionFromDropDown() throws AWTException
	{
		HomePage hp = new HomePage(driver);
		String value = "Electronics";
		rb = new Robot();
		hp.dropdown().click();
		Select select = new Select(hp.dropdown());
		List<WebElement> option =select.getOptions();
		for(WebElement values:option)
		{
			String Himse = values.getText();
			if(Himse.equalsIgnoreCase(value))
			{
				values.click();
			}
		}
		
		hp.search().click();
		
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);		
}
}