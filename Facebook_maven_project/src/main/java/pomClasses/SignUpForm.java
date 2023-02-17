package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {

	
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement Firstname  ;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement Lastname ;
	
	@FindBy (xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileno ;
	
	@FindBy (xpath="(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy (xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy (xpath="//select[@aria-label='Day']")
	private WebElement day;
	
	@FindBy (xpath="//select[@aria-label='Year']")
	private WebElement year;
	
	
	@FindBy (xpath="(//input[@type='radio'])[1]")
	private WebElement femaleRadioButton ; 
	
	public SignUpForm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void sendFirstname() 
	{
		Firstname.sendKeys("Amruta");
	}
	
	public void sendLastname()
	{
	   Lastname.sendKeys("Phadatare");
	}
	
	public void sendmobileno()
	{
	  mobileno.sendKeys("7350698827");
	}
	public void sendpassword()
	{
	  password.sendKeys("amu@123");
	}
	
	public void clickfemaleRadioButton()
	{
		femaleRadioButton.click();
	}
	
	public void dayDropDown()
	{
		Select s= new Select(day);
		s.selectByIndex(26);
	}
	
	public void monthDropDown()
	{
		Select s= new Select(month);
		s.selectByVisibleText("Feb");
	}
	
	public void yearDropDown()
	{
		Select s= new Select(year);
		s.selectByVisibleText("1995");
	}
	
	
	
}
