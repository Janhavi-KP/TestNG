package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class listners {
	WebDriver driver;
	
	
	@BeforeClass()
	void setup() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}

@Test(priority=1)
void testLogo() 
{
	boolean statusLogo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(statusLogo, true);
}


@Test(priority=2)
void testURL()
{
	Assert.assertEquals(driver.getCurrentUrl(),"  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Test(priority=3,dependsOnMethods= {"testURL"})
void testTitle()
{
	String title=driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
	
}


@AfterClass
void close()
{
	driver.close();
}

}


