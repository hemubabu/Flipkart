package com.flipkartstepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseclass.CommonActions;
import com.pages.FlipkartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartCartStepDefinition extends CommonActions{
	
	FlipkartPage locator = new FlipkartPage();
	
	
	@Given("the user selects the {string} product")
	public void the_user_selects_the_product(String product) {
		
	    click(locator.oneplusProduct);
	}

	@Given("the user clicks on Add to Cart")
	public void the_user_clicks_on_Add_to_Cart() throws InterruptedException {
		windowHandle();
		Thread.sleep(5000);
		click(locator.addToCartImage);
		
	}

	@Then("the {string} product should be displayed in the cart")
	public void the_product_should_be_displayed_in_the_cart(String Expectedoutput) throws InterruptedException {
	    click(locator.addToCartButton);
	    String ActualOutput = elementGetText(locator.oneplusProductCart);
	    Assert.assertEquals(ActualOutput, Expectedoutput);
	    System.out.println(Expectedoutput+" is displayed in cart as expected");
	}

	@When("the user removes the product from the cart")
	public void the_user_removes_the_product_from_the_cart() {
	   click(locator.removeCartButton);
	}

	@Then("the product should be removed from the cart")
	public void the_product_should_be_removed_from_the_cart() throws InterruptedException {
		Thread.sleep(8000);
	    Assert.assertTrue(locator.missingCartItem.isDisplayed(), "Missing Cart Item not displayed");
	    System.out.println("Product successfully removed from the cart");

	}


}
