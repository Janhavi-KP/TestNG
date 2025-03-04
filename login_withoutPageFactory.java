package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_withoutPageFactory {
	WebDriver driver;
	
	//constructor-constructor name should be same as main class-to initiate the driver constructor is used
	
	login_withoutPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	By txt_username=By.xpath("//input[@placeholder='Username']");
	By txt_password=By.xpath("//input[@placeholder='Password']");
	By button_login=By.xpath("//button[normalize-space()='Login']");
	
	//actionMethods
	
	public void setUserName(String user)
	{
		driver.findElement(txt_username).sendKeys(user);
		
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(button_login).click();
	}
}
