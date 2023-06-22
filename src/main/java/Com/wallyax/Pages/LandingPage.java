package Com.wallyax.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {
	
	WebDriver driver=null;
	
	// Find the element on the Landing Page
	
	@FindBy(how=How.LINK_TEXT,using="Sign In")
	WebElement signInButton;
	
	@FindBy(how=How.LINK_TEXT,using="Digital Accessibility to the core")
	WebElement landingPageText;
	

	// Create the Constructor 
	
	public LandingPage(WebDriver driver) {
	this.driver=driver;
	}
	
	// Landing Page Actions
	
	public void landingPageText() {
		landingPageText.getText();
	}
	
	public void signInButton() {
		signInButton.click();
	}
	

}
