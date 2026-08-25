package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.CommonActions;

public class FlipkartPage extends CommonActions{
	
	public FlipkartPage(){
		
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(name=FlipkartPageUILocator.SEARCH_BOX)
	public WebElement searchbox;
	
	@FindBy(xpath=FlipkartPageUILocator.CLOSE_POPUP)
	public WebElement closePopup;
	
	@FindBy(xpath=FlipkartPageUILocator.PRODUCT_NAMES)
	public List<WebElement> productNames;
	
	@FindBy(xpath=FlipkartPageUILocator.ONEPLUS_PRODUCT)
	public WebElement oneplusProduct;
	
	@FindBy(xpath=FlipkartPageUILocator.ADD_TO_CART_IMAGE)
	public WebElement addToCartImage;
	
	@FindBy(xpath=FlipkartPageUILocator.ADD_TO_CART_BUTTON)
	public WebElement addToCartButton;
	
	@FindBy(xpath=FlipkartPageUILocator.ONEPLUS_PRODUCT_CART)
	public WebElement oneplusProductCart;
	
	@FindBy(xpath=FlipkartPageUILocator.REMOVE_CART_BUTTON)
	public WebElement removeCartButton;
	
	@FindBy(xpath=FlipkartPageUILocator.MISSING_CART_ITEMS)
	public WebElement missingCartItem;
	
	

}
