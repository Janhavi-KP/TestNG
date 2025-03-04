package testNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_withPageFactory {
	WebDriver driver;
	
	//constructor-constructor name should be same as main class-to initiate the driver constructor is used
	
	login_withPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement txt_username;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy (xpath="//button[normalize-space()='Login']")
	WebElement button_login;
	
	@FindBy(tagName="a")//multiple webelements can also be find by using @FindBy
	List<WebElement> links;
	
	//actionMethods
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
		
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		button_login.click();
	}
}
