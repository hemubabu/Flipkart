Feature: Flipkart Cart Management

  Background: 
 
	Given the user handles the popup
	
   @Cart	
  Scenario: Verify product can be added and removed from the cart
    When the user searches for "Oneplus" product
    And the user selects the "OnePlus 13R 5g (Astral Trail, 256 GB)" product
    And the user clicks on Add to Cart
    Then the "OnePlus 13R 5g (Astral Trail, 256 GB)" product should be displayed in the cart
    When the user removes the product from the cart
    Then the product should be removed from the cart