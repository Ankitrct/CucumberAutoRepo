package com.basis.stepDefinationFiles;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;

public class goolgeMapsStepDef {

	WebDriver driver;
	identifiers idfr = new identifiers();

	public goolgeMapsStepDef(sharedWebDriver share) {

		driver = share.setup();
	}

	@Given("^Launch google maps application url$")
	public void launch_google_maps_application_url() {
		driver.get(idfr.googlmapseurl);

	}

}
