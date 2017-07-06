package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ObjectRepository;

public class FlightSearch extends BaseClass{

	private static WebElement element = null ;
	public static String SelectTripType;


	public FlightSearch(WebDriver driver) {
		super(driver);
	}

	public static class TripType {

		public static WebElement radSelectTrip(String SelectTripType)  {
			element = null;
			try {
				element = driver.findElement(By.id(ObjectRepository.objLocValue(SelectTripType)));

			} catch (Exception e) {
			}
			return element;
		}

	}
}
