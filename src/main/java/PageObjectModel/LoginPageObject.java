package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	
	public WebDriver driver;
	
	By email = By.xpath("//input[@name='email']");
	
	By password = By.xpath("//input[@name='password']");
	
	//input[@type='submit']
	
	By submit = By.xpath("//input[@type='submit']");
	
	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	
	
	
	
	
	
}
