package com.flipkartstepdefinition;

import com.baseclass.CommonActions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.*;

public class Hooks extends CommonActions{
	
	long startTime;
	long endTime;
	
	@Before
	public void launchSetup() {
		startTime = System.currentTimeMillis();
		System.out.println("Scenario Execution Started");
		launchApplication("https://www.flipkart.com/");
	}
	
	
	@After
	public void exitSetup() {
		endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		System.out.println("Execution Completed");
		System.out.println("Execution Time:" + (executionTime/1000)+"seconds");
		quitBrowser();
		
	}

}
