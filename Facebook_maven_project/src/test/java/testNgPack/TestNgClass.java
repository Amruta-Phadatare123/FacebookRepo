package testNgPack;

import java.io.IOException;
import java.util.ArrayList;
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
import pomClasses.SignUpPop;
import utils.Utility;

public class TestNgClass extends Browser {
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
	public void verifyTermsLink() {
		System.out.println("Test-1");
		SignUpPop signUpPop=new SignUpPop(driver);
		signUpPop.clicktermslink();
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1)); 
		
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://www.facebook.com/legal/terms/update";
		String expectedTitle="Facebook"	;
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		
	}
	
	@Test
	public void verifyprivacypolicylink(){
		System.out.println("Test-2");
		SignUpPop signUpPop=new SignUpPop(driver);
		signUpPop.clickprivacypolicylink();
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1)); 
		
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String expectedTitle="Meta Privacy Policy ??? How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		
	}

	
	@Test
	public void verifycookiespolicylink(){
		System.out.println("Test-3");
		SignUpPop signUpPop=new SignUpPop(driver);
		signUpPop.clickcookiespolicylink();
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1)); 
		
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
		String expectedTitle="Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenShot(driver,testId);
		}
		driver.close();
		
	
			
		/*System.out.println("After method");
		driver.close();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));*/
		 
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");System.out.println("After Class");System.out.println("After Class");
		driver.quit();
	}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

