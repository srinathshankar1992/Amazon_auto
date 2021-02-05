package Amazon.Automate;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
}
