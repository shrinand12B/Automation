package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseclass;

import PageObjectModel.RegistrationPageObject;

public class RegisterTestcases extends baseclass {
	
	@Test
	public void verifyRegistration() throws IOException, InterruptedException
	{
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		RegistrationPageObject rop = new RegistrationPageObject(driver);
		
		rop.enterfirstName().sendKeys("test1");
		rop.enterlastName().sendKeys("test2");
		rop.email().sendKeys("abc_1223@gmail.com");
		Thread.sleep(3000);
		
		rop.telephone().sendKeys("0217486598");
		rop.password().sendKeys("abc123");
		rop.confirmpassword().sendKeys("abc123");
		rop.checkbox().click();
		
		Thread.sleep(3000);
		rop.submit().click();
		Thread.sleep(3000);
		
		rop.success().getText();
		
		
		
		
		
		
	}

}
