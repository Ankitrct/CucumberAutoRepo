package com.basis.stepDefinationFiles;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;

public class googleStepDef {

	WebDriver driver;
	identifiers idfr = new identifiers();

	public googleStepDef(sharedWebDriver share) {
		driver = share.setup();
	}

	@Given("^Launch google application url$")
	public void launch_google_application_url() {
		driver.get(idfr.googleurl);

	}

}
