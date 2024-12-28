package stepDefinitions;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_01 {

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		driver = new RemoteWebDriver(new URL("http://192.168.0.163:4444"), new ChromeOptions());

		driver.get("https://www.wisequarter.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}

	@Test
	void firefoxTest() throws MalformedURLException {

		driver = new RemoteWebDriver(new URL("http://192.168.0.163:4444") , new FirefoxOptions());

		driver.get("https://www.wisequarter.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	// Bu test kosumlarini hazirladigimiz GRID ortami uzerinde gerceklestirdik.
	// Ancak HUB'a desired capabilities (kullanici istekelrini) gondermedik.
	// Onun yerine browserOptions() kullanarak mevcut yapi icerisindeki browser ile calismasini istedik.



}
