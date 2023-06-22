package Com.wallyax.Browserutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SeleniumUtility {
	static WebDriver driver;


	public static void handingTheWindow(WebDriver driver) {

		String parent = driver.getWindowHandle();

		Set<String> allOpenwindow = driver.getWindowHandles();

		for (String child : allOpenwindow) {

			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			}
		}


	}



}
