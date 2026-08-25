package com.baseclass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.FlipkartPage;

public class CommonActions  {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public void launchApplication(String url) {
		
		driver = new ChromeDriver(); // Browser session create
		driver.manage().window().maximize();
		driver.get(url);
    
    	
	}
	
	public void waitVisibleElement(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitClickableElement(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public String elementGetText(WebElement element) {
		waitVisibleElement(element);
		String elementText = element.getText();
		return elementText;
	}
	
	
	public void waitVisibleElementsList(List<WebElement> element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public void windowHandle() {
		
		
		String Pwin = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		
		for(String window:allwin) {
			if(!Pwin.equals(allwin)) {
				driver.switchTo().window(window);
			}
		}
	}
	

	public void click(WebElement element)
	{
		waitClickableElement(element);
		element.click();
	}
	
	
	public void popupHandling(WebElement element) {
		try {
			click(element);
		}
		
		catch(Exception e){
			System.out.println("Pop-up not found");
		}
		
	}
	
	public void enterTextAndPressEnter(WebElement element,String textValue) {
		element.sendKeys(textValue,Keys.ENTER);
	}
	
	public void PrintAllElementsText(List<WebElement> elementsList) {
		
		waitVisibleElementsList(elementsList);
		for(WebElement element:elementsList) {
			System.out.println(element.getText());
		}
	}
	
	public String validateProduct(String output) {
		String ActualOutput = driver.findElement(By.xpath("//div[text()='"+output+"']")).getText();
		return ActualOutput;
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			
		}
			
	}
	
	
	

}
