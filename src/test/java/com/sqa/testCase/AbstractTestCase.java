package com.sqa.testCase;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class AbstractTestCase {

	
	protected WebDriver driver = null;
	
	/*WebDriver creado aquí, se envía como parámetro tanto a proceso como a página*/
	

	protected WebDriver createDriver () {
		

		ArrayList<String> optionsList = new ArrayList<String>();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		optionsList.add("--start-maximized");
		optionsList.add("--incognito");
		chromeOptions.addArguments(optionsList);
		
		driver = new ChromeDriver(chromeOptions);
	
		return driver;	
	}
	
	
	@Before
	public void setUp() throws Exception {
		 driver = this.createDriver();
	}


	@After
	public void tearDown() throws Exception {
		//Close browser
		driver.close();
	}
	
	
	
}
