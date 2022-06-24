package com.Parametrization;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParamaterPract {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url" })
	@Test
	public void launchUrl(String browserName, String urlName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(urlName);
			System.out.println("Running browser :" + browserName);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			System.out.println("Running browser :" + browserName);
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			System.out.println("Running browser :" + browserName);
		}

	}

	

	@Parameters({ "username", "password" })
	@Test
	public void loginPage(String username, String password) {
		driver.findElement(By.ByName.name("username")).sendKeys(username);
		driver.findElement(By.ByName.name("password")).sendKeys(password);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
