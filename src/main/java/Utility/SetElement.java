package Utility;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObjects.BaseClass;

public class SetElement extends BaseClass{

	private static WebElement element = null ;
	private static List<WebElement> elements = null ;
	public static String LocatorValue;

	public SetElement(WebDriver driver) {
		super(driver);
	}

	/*
	 * This method sets the element 'By.id' locator
	 */

	public static WebElement elementToBeSetById(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.id(ObjectRepository.objLocValue(LocatorValue)));
		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the element 'By.xpath'
	 */
	public static WebElement elementToBeSetByXPATH(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.xpath(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the element 'By.className'
	 */
	public static WebElement elementToBeSetByclassName(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.className(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the element 'By.name'
	 */
	public static WebElement elementToBeSetByName(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.name(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the element 'By.cssSelector'
	 */
	public static WebElement elementToBeSetByCSSSelector(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.cssSelector(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the element 'By.tagName'
	 */
	public static WebElement elementToBeSetByTagName(String LocatorValue)  {
		element = null;
		try {
			element = driver.findElement(By.tagName(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return element;
	}

	/*
	 *  This method sets the ELEMENTS 'By.id'
	 */
	public static List<WebElement> elementsToBeSetById(String LocatorValue)  {
		elements = null;
		try {
			elements = driver.findElements(By.id(ObjectRepository.objLocValue(LocatorValue)));

		} catch (Exception e) {
		}
		return elements;
	}

}
