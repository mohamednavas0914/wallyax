package Com.wallyax.Browserutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Browserutility {
	
	static WebDriver driver;
	static int duration=20;
	
	public static WebDriver browserLaunch(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\wallyax\\wallyax\\drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
			else if(browserName.equalsIgnoreCase("edge")) {
				
				System.setProperty("Webdriver.edge.driver","F:\\workspace\\wallyax\\drivers\\msedgedriver.exe");
				driver=new EdgeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
		return driver;		
		}
		
	}

