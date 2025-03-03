package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testlogin(String userName,String Password)
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		boolean statusLogo=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		if(statusLogo==true)
		{
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		Object data[][]= {
					{"standard_user","secret_sauce"},//valid
					{"locked_out_user","secret_sauce1"},//invalid
					{"problem_user","secret_sauce"},//valid
					{"performance_glitch_user","secret_sauce1"},//invalid
					{"error_user","secret_sauce1"},//invalid
					{"visual_user","secret_sauce"}//valid
		
						};
		return data;
//when we want to choose only few data from dataprovider we can use as 	@DataProvider(name="dp",indices={0,4}),, now it checks only for 0th and 4th index
}
}
