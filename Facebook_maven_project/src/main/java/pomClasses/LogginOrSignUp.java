package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogginOrSignUp {
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="(//a[@role='button'])[2]")
	private WebElement createnewacc; 
	
	//Constuctor ->public ->WebElements Initialization(find)
	
	public LogginOrSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods-> public ->WebElement Action
	
	public void sendUserName() 
	{
		username.sendKeys("Amruta Phadatare");
	}
	
	public void sendPassword() 
	{
		password.sendKeys("26021995");
	}
	
	public void clickCreatenewacc() 
	{
		createnewacc.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
