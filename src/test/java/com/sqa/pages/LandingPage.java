package com.sqa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends Page{



	private By levelTitle=By.cssSelector("h1");
	private By test2Title=By.xpath("/html/body/div/div/div[2]/p/b");
	private By test1Title=By.xpath("/html/body/div/div/div[1]/p/b");
	
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
	
	
	public String Test2 (String webString){
	
		driver.get(webString);
		
		//Starting title found and asserted
		WebElement assertElement = driver.findElement(test2Title);
		System.out.println(assertElement.getText());
		return (assertElement.getText());
	}
	
	

	public String Test3 (String webString){
	
		driver.get(webString);
		
		//Starting title found and asserted
		WebElement assertElement = driver.findElement(test1Title);
		System.out.println(assertElement.getText());
		return (assertElement.getText());


	}
}


