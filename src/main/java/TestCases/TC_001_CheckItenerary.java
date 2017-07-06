package TestCases;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.testng.annotations.*;
import PageObjects.BaseClass;

@Test
public class TC_001_CheckItenerary {

	public static WebDriver driver;

	@BeforeTest
	@Parameters({"Browser"})
	public static void BaseclassDriver(@Optional("Chrome")String Browser) throws Exception{

		System.out.println("*************************************************************");
		System.out.println("*********       This is START of the test    ****************");
		System.out.println("*********       This test occurs in "+Browser+" *************");
		System.out.println("*************************************************************");

		driver = Utility.Utils.OpenBrowser(Browser.toLowerCase()); // This opens Browser

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		new BaseClass(driver); 

	}

	@Test
	public static void TestIteration_001 () throws Exception{

		LocalTime Starttime =  LocalTime.now();

		driver.get(Utility.Constants.URL); // This Opens the desired URL as provided in the Constants.java class

		Utility.SetElement.elementToBeSetById("RoundTripId").click(); //User Actions being performed here

		Utility.SetElement.elementToBeSetById("FromId").sendKeys("MCO");

		Utility.Utils.mouseHoverAction("srcCity_Id");

		boolean bSrcCity = Utility.SetElement.elementToBeSetByTagName("section_Tagname").getText().contains("MCO");

		if (bSrcCity ==true){
			Utility.SetElement.elementToBeSetById("srcCity_Id").click();
		}

		Utility.SetElement.elementToBeSetById("ToId").sendKeys("BLR");

		Utility.Utils.mouseHoverAction("srcCity_Id");

		//action.moveToElement(Utility.SetElement.elementToBeSetById("srcCity_Id")).perform();

		Utility.SetElement.elementToBeSetById("dstCity_Id").click();

		Utility.SetElement.elementToBeSetByXPATH("departDate_xPath").click();

		Utility.SetElement.elementToBeSetByXPATH("returnDate_xpath").click();

		Utility.SetElement.elementToBeSetByXPATH("getSetGo_xpath").click();

		Utility.SetElement.elementToBeSetByXPATH("searchResults_xpath").getText();

		//	System.out.println(Utility.SetElement.elementToBeSetByXPATH("searchResults_xpath"));

		List<WebElement> searchResults = driver.findElements(By.xpath(".//*[@id='content']/div/div[2]/div/div[4]/div/div[1]"));

		for(WebElement s:searchResults){
			System.out.println(s.findElement(By.tagName("div")).getText());
			if (s.getText().contains("Cheapest")==true){
				break;
			}
		}

		LocalTime Endtime =  LocalTime.now();

		System.out.println("Starttime: "+Starttime);

		System.out.println("Endtime: "+Endtime);

		/*
		driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/div[1]/div[3]/i[1]/i"))

		fl white icon-tick-mark ico10
		 */

		if (!driver.findElement(By.xpath(".//*[@id='content']/div/div[1]")).isDisplayed()){
			System.out.println("Flight search is complete");
		}

	}


	@AfterTest
	public static void closeAUT(){
		driver.close();
		System.out.println("Browser closed successfully");
		System.out.println("*************************************************************");
		System.out.println("*********       This is END of the test    ****************");
		System.out.println("*************************************************************");

	}



}
