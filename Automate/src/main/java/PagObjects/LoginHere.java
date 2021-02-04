package PagObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHere {

WebDriver driver;

By linktologin = By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']");
By Username = By.id("ap_email");
By continuebutton=By.id("continue");
By Password = By.id("ap_password");
By Signinbutton=By.id("signInSubmit");


public LoginHere(WebDriver driver)
{
	this.driver=driver;
}

public WebElement loginlinkbutton()
{
	return driver.findElement(linktologin);
}

public WebElement mailid()
{
	return driver.findElement(Username);
}

public WebElement continueButtonClick()
{
	return driver.findElement(continuebutton);
}
public WebElement SendPassword()
{
	return driver.findElement(Password);
}

public WebElement SigninbuttonClick()
{
	return driver.findElement(Signinbutton);
}

	
}
