package com.flipkartstepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseclass.CommonActions;
import com.pages.FlipkartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileSearchStepDefinition extends CommonActions{
	
	static WebDriver driver;
	FlipkartPage locator = new FlipkartPage();
	
	@Given("the user launches Flipkart application")
	public void the_user_launches_flipkart_application() throws InterruptedException {
		
		launchApplication("https://www.flipkart.com/");
	    
	}


	@Given("the user handles the popup")
	public void the_user_handles_the_popup() {
			popupHandling(locator.closePopup);
	}


	
	

	@When("the user searches for {string} product")
	public void the_user_searches_for_product(String input) {
	
		enterTextAndPressEnter(locator.searchbox, input);		
	}

	@Then("{string} products should be displayed")
	public void products_should_be_displayed(String input) {
		
		PrintAllElementsText(locator.productNames);
		
	  
	}
	
	@Then("the {string} product should be validated")
	public void the_product_should_be_validated(String output) {
		Assert.assertEquals(validateProduct(output), output,"Expected product was not displayed");
		System.out.println( output+"Search Validation Passed");
    
    	
	}

}
