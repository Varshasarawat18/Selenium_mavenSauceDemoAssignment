package pagesSaurceDemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {
	WebDriver driver;
	
	//**************OBJECTS***********************//
	
	@FindBy(id="user-name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement LoginButtonClick;
	
	//@FindBy(xpath="//h3[@data-test='error']")
	//WebElement Error;
	
	public SauceDemoLoginPage(WebDriver basedriver)
	{
		this.driver= basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	
	public void loginPage(String Usrname, String Pass)
	{
		UserName.sendKeys(Usrname);
		Password.sendKeys(Pass);
		LoginButtonClick.click();
		
		
	}

}