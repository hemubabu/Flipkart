package com.runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/resources",
		glue="com.flipkartstepdefinition",
		plugin= {
				"pretty",
				"html:target/cucumber-reporthtml.html",
				"json:target/cucumber-reportjson.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		monochrome=true,
		dryRun=false
		
		)




public class TestRunner {

}
