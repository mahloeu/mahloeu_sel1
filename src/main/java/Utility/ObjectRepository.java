package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectRepository {

	public static String objLocatorValue = null;

	public static String objLocValue(String ObjectNameInPropFile){
		try {
			FileInputStream inputFile = new FileInputStream(Constants.PropFilePath);
			Properties prop = new Properties();
			prop.load(inputFile);
			objLocatorValue = prop.getProperty(ObjectNameInPropFile);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return objLocatorValue;
	}

}
