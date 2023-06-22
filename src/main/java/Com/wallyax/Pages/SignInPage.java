package Com.wallyax.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	WebDriver driver = null;
	
	// Find the element in signInPage
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/button")
	WebElement signInButtonOnLoginPage;
	
	
	// Constructor 
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Actions
	
	public void userName(String email) {
		
		userName.sendKeys(email);
	}
	
	public void password(String Pass) {
		password.sendKeys(Pass);
	}
	
	public void signInButtonOnLoginPage() {
		signInButtonOnLoginPage.click();
	}

}
