package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {
	
	public WebDriver driver; // WebDriver is declared globally

	By firstName = By.xpath("//input[@name='firstname']");

	By lastName = By.xpath("//input[@name='lastname']");
	
	By email = By.xpath("//input[@name='email']");
	
	By telephone = By.xpath("//input[@name='telephone']");
	
	By password = By.xpath("//input[@name='password']");
	
	By confirmpassword = By.xpath("//input[@name='confirm']");
	
	By checkbox = By.xpath("//input[@name='agree']");
	
	By submit = By.xpath("//input[@type='submit']");
	
	By success = By.xpath("//div[@id='content']//h1");
	
	By Logout = By.xpath("//li[@class='dropdown open']");

	
	
	public RegistrationPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterfirstName() {

		return driver.findElement(firstName);
	}

	public WebElement enterlastName() {

		return driver.findElement(lastName);
	}
	
	public WebElement email() {

		return driver.findElement(email);
	}

	public WebElement telephone() {

		return driver.findElement(telephone);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement confirmpassword() {

		return driver.findElement(confirmpassword);
	}

	public WebElement checkbox() {

		return driver.findElement(checkbox);
	}

	public WebElement submit() {

		return driver.findElement(submit);
	}
	
	public WebElement success() {

		return driver.findElement(success);
	}
	



}
