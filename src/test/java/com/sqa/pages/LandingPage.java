package com.sqa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends Page{



	private By levelTitle=By.cssSelector("h1");
	
	
	 //protected WebDriver driver = null;
	
	 public LandingPage(WebDriver driver) {
		super(driver);

	}


	public String login(String webString) {
	
		driver.get(webString);
		

		//Starting title found and asserted

		WebElement assertElement = driver.findElement(levelTitle);
		System.out.println(assertElement.getText());
		return (assertElement.getText());

		
	
		
	}



}


