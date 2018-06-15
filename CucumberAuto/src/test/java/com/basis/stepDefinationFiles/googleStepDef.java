package com.basis.stepDefinationFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class googleStepDef {

	WebDriver driver;
	identifiers idfr = new identifiers();

	@Before
	public void testinitialize() {
		String path = "C:\\Users\\atiwari\\Desktop\\Learning\\WebDrivers\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	@Given("^Launch google application url$")
	public void launch_google_application_url() {
		driver.get(idfr.googleurl);

	}

	@After
	public void closebroswer() {
		driver.quit();
		driver = null;
	}

}
