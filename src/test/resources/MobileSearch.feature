@MobileSearch
Feature: Mobile Search


Background:
Given the user handles the popup

@iPhonesearch
Scenario: Verify iPhone search

When the user searches for "Apple iPhone" product
Then "Apple iPhone" products should be displayed

@differentmobilesearch
Scenario Outline:Verify different mobile searches

When the user searches for "<Input>" product
Then "<Input>" products should be displayed
Examples:
	| Input       |
    | Apple iPhone|
    | Samsung     |
    | REDMI  	  |	       

@validatemobile  @validation  
Scenario Outline: Validate mobile search result
When the user searches for "<Input>" product
Then the "<Output>" product should be validated

Examples:
    | Input   		| 		Output                                  |
    | Apple iPhone  	| Apple iPhone 15 (Black, 128 GB)           |
    | Samsung		| Samsung Galaxy F07 (Green, 64 GB)             |
    | REDMI			| REDMI Note 15 SE 5G Snapdragon (Crimson Reserve, 128 GB) | 
    