package com.basis.stepDefinationFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//user can specify the folder path of multiple feature files and stepdefination files separated by commas
		//if they are scattered to different folders in the project (if there are duplicate steps in different step defination files then it will give error
		
		monochrome = true,
		//dryRun = true,
		//tags = {"@Smoke" , "@Regression"}, //And condition - scenario matching both the tags will be executed
		tags = {"@Smoke , @Regression"}, // OR condition - scenario matching either of the tags will be executed
		features= {"src/test/resources/com/basis/featureFiles/"},
		glue={"com/basis/stepDefinationFiles/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",		
				}
		
		)

public class TestRunner {

}
