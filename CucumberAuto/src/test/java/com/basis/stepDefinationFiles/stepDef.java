package com.basis.stepDefinationFiles;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class stepDef {
	
	WebDriver driver; 
	identifiers idfr = new identifiers();
	
	@Before
	public void TestInitialize() {
	String path = "C:\\Users\\atiwari\\Desktop\\Learning\\WebDrivers\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
		
	@Given("^Launch application url$")
	public void launchUrl() {
	
		driver.get(idfr.URL);		
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS); 
        
	}
	
	
	@Given("^User is navigated to the home page$")
	public void homePage() {
	
		WebElement homepage = driver.findElement(By.className(idfr.homePage));
	    Assert.assertTrue(homepage.isDisplayed());
	}

	
	@Then("^Click on registration link$")
	public void click_on_registration_link()  {
	    WebElement registration_link = driver.findElement(By.linkText(idfr.registrationlink));
	    registration_link.click();	    
	    
	}
	
	@Then("^Enter firstname , lastname , phonenumber , username , email id and password$")
	public void Enter_data(DataTable data) {
		
		List<List<String>> datavalues = data.raw();
		
		String fname = datavalues.get(1).get(0);
		String lname = datavalues.get(1).get(1);
		String phone = datavalues.get(1).get(2);
		String usernamevalue = datavalues.get(1).get(3);
		String email = datavalues.get(1).get(4);
		String passwordvalue = datavalues.get(1).get(5);
		
		
		 WebElement first_name = driver.findElement(By.id(idfr.fname));
		 first_name.sendKeys(fname);
		 
		 WebElement last_name = driver.findElement(By.id(idfr.lname));
		 last_name.sendKeys(lname);
		 
		 WebElement phone_number = driver.findElement(By.id(idfr.phone));
		 phone_number.sendKeys(phone);
		 
		 WebElement username = driver.findElement(By.id(idfr.username));
		 username.sendKeys(usernamevalue);
		 
		 WebElement emailid = driver.findElement(By.id(idfr.email));
		 emailid.sendKeys(email);
		 
		 WebElement password = driver.findElement(By.id(idfr.password));
		 password.sendKeys(passwordvalue);
		 
		 WebElement confirmpassword = driver.findElement(By.id(idfr.confirmPassword));
		 confirmpassword.sendKeys(passwordvalue);	 
		
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


	@Then("^Enter details in about yourself section$")
	public void enter_details_in_about_yourself_section()  {
		WebElement description = driver.findElement(By.id(idfr.aboutyourself));
		description.sendKeys("Data entered for test");	
	  
	}	
	
	@Given("^Enter \"([^\"]*)\" as firstname$")
	public void enter_firstname(String fname) throws Throwable {
		 WebElement first_name = driver.findElement(By.id(idfr.fname));
		 first_name.sendKeys(fname);
		 
	}

	@Given("^Enter \"([^\"]*)\" as Lastname$")
	public void enter_Lastname(String lname) throws Throwable {
		WebElement last_name = driver.findElement(By.id(idfr.lname));
		 last_name.sendKeys(lname);
		
	}

	@Given("^Enter \"([^\"]*)\" as contact number$")
	public void enter_contact_number(String mobilenumber) throws Throwable {
		 WebElement phone_number = driver.findElement(By.id(idfr.phone));
		 phone_number.sendKeys(mobilenumber);
	}

	@Given("^Enter \"([^\"]*)\" as username$")
	public void enter_username(String userid) throws Throwable {
		 WebElement username = driver.findElement(By.id(idfr.username));
		 username.sendKeys(userid);
	}

	@Given("^Enter \"([^\"]*)\" as email$")
	public void enter_email(String emailidvalue) throws Throwable {
		 WebElement emailid = driver.findElement(By.id(idfr.email));
		 emailid.sendKeys(emailidvalue);
		 
	}

	@Given("^Enter \"([^\"]*)\" as password$")
	public void enter_password(String passwordvalue) throws Throwable {
		 WebElement password = driver.findElement(By.id(idfr.password));
		 password.sendKeys(passwordvalue);
	}

	@Given("^Re-enter passwrod \"([^\"]*)\" as confirm passowrd$")
	public void confirm_passowrd(String confirmpassowrdvalue) throws Throwable {
		 WebElement confirmpassword = driver.findElement(By.id(idfr.confirmPassword));
		 confirmpassword.sendKeys(confirmpassowrdvalue);
	}	
	
	@Then("^Click submit button$")
	public void click_submit_button() {
		WebElement submitbutton = driver.findElement(By.name(idfr.submit));
	    submitbutton.click();
	}

	@But("^Verify that the new user is able to register account$")
	public void verify_that_the_new_user_is_able_to_register_account()  {
	    
		//Assert if user is able to register the account	    
	}		
	
	@After
	public void closebrowser() {
		driver.quit();
		driver = null;
	}
	
}
