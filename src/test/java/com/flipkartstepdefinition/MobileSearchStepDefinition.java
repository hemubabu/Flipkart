package com.flipkartstepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import com.baseclass.CommonActions;
import com.pages.FlipkartPage;

import io.cucumber.datatable.DataTable;
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
	
	@When("the user searches for input product by list")
	public void the_user_searches_for_input_product_by_list(DataTable datasList) {
		
		List<String> mobileNames = datasList.asList();
		
		enterTextAndPressEnter(locator.searchbox, mobileNames.get(0));
	  
	}
	
	@When("the user searches for input product by map")
	public void the_user_searches_for_input_product_by_map(DataTable datasMap) {
		
		
		Map<String,String> mobileNames = datasMap.asMap(String.class,String.class);
		
		enterTextAndPressEnter(locator.searchbox, mobileNames.get("2"));
	  
	}
	
	@Then("the {string} product should be validated")
	public void the_product_should_be_validated(String output) {
		Assert.assertEquals(validateProduct(output), output);
		System.out.println( output+"Search Validation Passed");
    
    	
	}

}
