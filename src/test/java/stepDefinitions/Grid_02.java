package stepDefinitions;

import manage.DriverManager;
import org.testng.annotations.Test;

import static stepDefinitions.Grid_01.driver;

public class Grid_02 {

	DriverManager manage = new DriverManager();



	@Test
	void chromeTest(){

		driver= manage.setUpChromeDriver();
		driver.get("https://www.wisequarter.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}


}
