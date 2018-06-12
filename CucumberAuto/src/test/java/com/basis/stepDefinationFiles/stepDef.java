package com.basis.stepDefinationFiles;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


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
		WebElement homepage = driver.findElement(By.className(idfr.homePage));
	    Assert.assertTrue(homepage.isDisplayed());
	}

	
	
	
	@Then("^Click on registration link$")
	public void click_on_registration_link()  {
	    WebElement registration_link = driver.findElement(By.linkText(idfr.registrationlink));
	    registration_link.click();	    
	    
	}

	@Then("^Enter firstname$")
	public void enter_firstname()  {
		 WebElement first_name = driver.findElement(By.id(idfr.fname));
		 first_name.sendKeys("Jack");	   
	}

	@Then("^Enter Lastname$")
	public void enter_Lastname()  {
		 WebElement last_name = driver.findElement(By.id(idfr.lname));
		 last_name.sendKeys("Bernard");	
	   
	}

	@Then("^Select marital status as single$")
	public void select_marital_status_as_single()  {
		List<WebElement> marital_status = driver.findElements(By.name(idfr.maritalStatus));		
	    marital_status.get(1).click();
	    
	}

	@Then("^Select hobby as dance$")
	public void select_hobby_as_dance() {
		List<WebElement> hobby = driver.findElements(By.name(idfr.hobby));		
		hobby.get(1).click();
	    
	}

	@Then("^Select country as United States$")
	public void select_country_as_United_States()  {
		Select country = new Select(driver.findElement(By.id(idfr.country)));
		country.selectByIndex(10);		
	  
	}

	@Then("^Select DOB$")
	public void select_DOB()  {
		Select month = new Select(driver.findElement(By.id(idfr.month)));
		month.selectByIndex(10);
		
		Select day = new Select(driver.findElement(By.id(idfr.day)));
		day.selectByIndex(10);
		
		Select year = new Select(driver.findElement(By.id(idfr.year)));
		year.selectByIndex(10);
	}

	@Then("^Enter phone number$")
	public void enter_phone_number()  {
		WebElement phone_number = driver.findElement(By.id(idfr.phone));
		phone_number.sendKeys("1112223333");	   
	    
	}

	@Then("^Enter username$")
	public void enter_username()  {
		WebElement username = driver.findElement(By.id(idfr.username));
		username.sendKeys("Jbernard");	
	  
	}

	@Then("^Enter e-mail id$")
	public void enter_e_mail_id()  {
		WebElement email = driver.findElement(By.id(idfr.email));
		email.sendKeys("Jbernard@gmail.com");		 
	}

	@Then("^Enter details in about yourself section$")
	public void enter_details_in_about_yourself_section()  {
		WebElement description = driver.findElement(By.id(idfr.aboutyourself));
		description.sendKeys("Data entered for test");	
	  
	}

	@Then("^Enter password$")
	public void enter_password() {	    
		WebElement password = driver.findElement(By.id(idfr.password));
		password.sendKeys("100#Jsontest");	
	}

	@Then("^Re-enter password to confirm$")
	public void re_enter_password_to_confirm()  {
		WebElement confirmpassword = driver.findElement(By.id(idfr.confirmPassword));
		confirmpassword.sendKeys("100#Jsontest");		  
	}

	@Then("^Click submit button$")
	public void click_submit_button() {
		WebElement submitbutton = driver.findElement(By.name(idfr.submit));
	    submitbutton.click();
	}

	@But("^Verify that the new user is able to register account$")
	public void verify_that_the_new_user_is_able_to_register_account()  {
	    
	    
	}	
	
	@Then("^Close the browser session$")
	public void closebrowser() {
		driver.quit();
		driver = null;
	}
	
}
