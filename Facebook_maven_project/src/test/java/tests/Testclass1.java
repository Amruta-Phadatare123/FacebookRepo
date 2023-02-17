package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LogginOrSignUp;

public class Testclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phada\\Downloads\\Desktop\\AMRUTA\\newchrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
        LogginOrSignUp logginOrSignUp = new LogginOrSignUp (driver);
        logginOrSignUp.sendUserName();
        logginOrSignUp.sendPassword();
        logginOrSignUp.clickCreatenewacc();
	}

}
