package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseclass;

import PageObjectModel.LoginPageObject;

public class LoginTestcase extends baseclass {

	@Test
	public void verifyLogin() throws IOException, InterruptedException
	{
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObject lob = new LoginPageObject(driver);
		
		lob.email().sendKeys("abc_1223");
		lob.password().sendKeys("abc123");
		lob.submit().click();
		
	
		
		
	}
}
