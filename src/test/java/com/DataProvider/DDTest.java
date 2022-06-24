package com.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTest {
	RemoteWebDriver driver = null;

	@BeforeMethod
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(dataProvider ="LoginData", dataProviderClass = DataDrivenTesting.class)
	public void loginByInvalidData(String Login, String pwd) {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(Login);
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
