package com.basis.stepDefinationFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	
	WebDriver driver; 
	identifiers idfr = new identifiers();
	
		
	@Given("^Launch application url$")
	public void LaunchUrl()
	{
		String path = "C:\\Users\\atiwari\\Desktop\\Learning\\WebDrivers\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(idfr.URL);
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);		
		
	}

	@When("^Enter username and password$")
	public void Login()
	{		
		 WebElement username = driver.findElement(By.id(idfr.Username_field));
         if (username.isEnabled())
        	 username.sendKeys(idfr.User_id);

         WebElement password = driver.findElement(By.id(idfr.Password_field));
         if (password.isEnabled())
        	 password.sendKeys(idfr.Password);
        
	}
	
	@And("^Click login button$")
	public void ClickLoginButton()
	{
		 driver.findElement(By.id(idfr.Submit_button)).click();            
         driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	}
	
	
	@Then("^User is able to log in succesfully$")
	public void ValidateLogin()
	{
		//Assert that user is able to log in to the application 
	}

}
