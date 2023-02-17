package testNgPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Browser;
import pomClasses.LogginOrSignUp;
import pomClasses.SignUpForm;
import utils.Utility;

public class TestNgFormClass extends Browser {
    String testId;
	WebDriver driver;
	
	@Parameters("browser")

	 @BeforeTest
	public void openBrowser(String browserName){
		   
		if(browserName.equals("Chrome")) {
				
	    	driver = openChromeBrowser();
				
		}
					
		if(browserName.equals("Firefox")) {
				driver = openFirefoxBrowser();
				
		}
					
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}



	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
	
	}
	
	@BeforeMethod
	public void openSignUpPage() {
		System.out.println(" Before Method");
		driver.get("https://www.facebook.com/");
		
		LogginOrSignUp logginOrSignUp=new LogginOrSignUp(driver);
		logginOrSignUp.clickCreatenewacc();
	}
	
	@Test
	public void verifyFirstname() {
		System.out.println("Test-1");
	  
		SignUpForm signUpForm = new SignUpForm(driver);
		
	}
	@Test
	public void verifyFirstName() {
		System.out.println("Test-1");
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.sendFirstname();
	}
		
		
		@Test
		public void verifyLastName() {
			System.out.println("Test-2");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendLastname();
		}
		
		@Test
		public void verifyMoblieNo(){
			System.out.println("Test-3");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendmobileno();
		}
		
		@Test
		public void verifypassword(){
			System.out.println("Test-4");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendpassword();
		}
		@Test
		public void verifymaleRadioButton(){
			System.out.println("Test-5");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.clickfemaleRadioButton();
		}
		
		@Test
		public void verifydaydropdown() {
			System.out.println("Test-6");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.dayDropDown();
			
		}
		
		@Test
		public void verifymonthdropdown() {
			System.out.println("Test-7");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.monthDropDown();
			
		}
		
		@Test
		public void verifyyeardropdown() {
			System.out.println("Test-8");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.yearDropDown();
			
		}

		
		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException{
			
			
			if(ITestResult.FAILURE==result.getStatus())
			{
				Utility.captureScreenShot(driver,testId);
			}
			driver.close();
			
			 
		}
		
	   @AfterClass
		public void afterClass() {
			System.out.println("After Class");
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	 
	   
	
	
	
	
	
	}	
	
	

