package testCaseSauceDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagesSaurceDemoProject.SauceDemoLoginPage;

public class SauceDemoLoginTest extends BaseClassSauceDemo {
	
	@Test
	public void Test1LoginInvalid()
	{
		SauceDemoLoginPage l1 = new SauceDemoLoginPage(driver);
		l1.loginPage("standard_user","abc@gmail.com");
		System.out.println("test1 executed and pass with invalid password");	

		WebElement Error= driver.findElement(By.xpath("//h3[@data-test='error']"));
		
		String ActError= Error.getText();
		String ExpError = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertEquals(ActError, ExpError);
		System.out.println("Test1 executed with Assertion and passed");	

		}
	
	@Test
	public void Test2LoginValid()
	{
		SauceDemoLoginPage l1 = new SauceDemoLoginPage(driver);
		l1.loginPage("standard_user","secret_sauce");
		System.out.println("test2 executed and pass with valid password");
		
	//	WebElement Error1=driver.findElement(By.xpath("//div[@class='header_secondary_container']"));
		WebElement Error1=driver.findElement(By.xpath("//span[@class='title']"));
		String ActError= Error1.getText();
		String ExpError = "PRODUCTS";
		
		Assert.assertEquals(ActError, ExpError);
		System.out.println("User lands on Home page and Assertion passed ");
	
	}
	
	
}
