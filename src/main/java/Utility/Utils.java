package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Utils {
	public static WebDriver driver = null;
	public static Actions action = null;
	public static String Browser = null;

	public static WebDriver OpenBrowser(String Browser) throws Exception{
		try {

			Browser = Browser.toLowerCase();
			
			if (Browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", Constants.oBrowserDriverPath+"chromedriver.exe");

				driver = new ChromeDriver();

			} else if(Browser.equalsIgnoreCase("firefox")){			

				System.setProperty("webdriver.gecko.driver", Constants.oBrowserDriverPath+ "geckodriver.exe");

				driver = new FirefoxDriver();

			} else if (Browser.equalsIgnoreCase("opera")){

				System.setProperty("webdriver.opera.driver", Constants.oBrowserDriverPath+"operadriver.exe");

				driver = new OperaDriver();
			} else if (Browser.equalsIgnoreCase("edge")){

				System.setProperty("webdriver.edge.driver", Constants.oBrowserDriverPath+"MicrosoftWebDriver.exe");

				driver = new EdgeDriver();
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			throw(e);
		}
		return driver;

	}

	public static Actions mouseHoverAction (String LocatorValue) throws Exception{

		try {
			Actions action = new Actions(driver);

			WebElement oObject = Utility.SetElement.elementToBeSetById(LocatorValue);

			action.moveToElement(oObject).build().perform();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;

	}
	
	

}
