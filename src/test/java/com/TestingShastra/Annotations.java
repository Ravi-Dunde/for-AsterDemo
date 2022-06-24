package com.TestingShastra;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Annotations {
	RemoteWebDriver driver = null;

	@BeforeMethod
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:testingshastra.com");
	}

	@Test
	public void verifyTitleOfHomePage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Testing Shastra";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Test
	public void verifyUrlOfHomePage() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url.contains("home"),"Url doesnt contains 'home' word");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
