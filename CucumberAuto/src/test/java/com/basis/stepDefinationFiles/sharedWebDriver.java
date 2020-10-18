package com.basis.stepDefinationFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class sharedWebDriver {

	WebDriver driver;

	@Before
	public WebDriver setup() {

		if (driver == null) {
			String path = "C:\\Users\\Ankit\\git\\CucumberAutoRepo\\CucumberAuto\\src\\test\\java\\Webdriver\\chromedriver_win32\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		}
		return driver;

	}

	@After
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}

}
