package Com.wallyax.tests;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.wallyax.Browserutility.Browserutility;
import Com.wallyax.Browserutility.SeleniumUtility;
import Com.wallyax.Pages.LandingPage;
import Com.wallyax.Pages.SignInPage;
import Com.wallyax.dataProvider.ConfigFileReader;

public class LogInTest {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	LandingPage lp;
	SignInPage sp;
	
	
	@BeforeMethod
	public void browserAndURLlaunch() {
		
		driver=Browserutility.browserLaunch("Chrome");
		configFileReader = new ConfigFileReader();
		driver.get(configFileReader.getApplicationurl());
		
		
	}
	
	@Test
	public void clickTheSignInButtonAndNavigateToLoginPage() throws InterruptedException {
		
		lp=PageFactory.initElements(driver, LandingPage.class);	
		lp.signInButton();
		Thread.sleep(2000);
		SeleniumUtility.handingTheWindow(driver);
		Assert.assertTrue(driver.getTitle().contains("Login"));
	}
	@Test
	@DataProvider(name="excelreader")
	public void loginWithUserNameAndPassword(String email,String Pass) {
		sp=PageFactory.initElements(driver, SignInPage.class);
		sp.userName(email);
		sp.password(Pass);
	}
	
	
	
	
	
	@AfterMethod
	public void broserClose() {
		
		driver.quit();
		
	}

}
