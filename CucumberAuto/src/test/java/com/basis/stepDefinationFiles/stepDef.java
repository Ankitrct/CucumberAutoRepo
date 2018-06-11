package com.basis.stepDefinationFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDef {
	
	WebDriver driver; 
	identifiers idfr = new identifiers();
	
		
	@Given("^Launch application url$")
	public void launchUrl()
	{
		String path = "C:\\Users\\atiwari\\Desktop\\Learning\\WebDrivers\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(idfr.URL);		
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);		
		
	}
	
	
	@Then("^User is navigated to the home page$")
	public void homePage()
	{
		//Assert that user is able to log in to the application 
	}

}
