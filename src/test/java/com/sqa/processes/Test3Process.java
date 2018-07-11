package com.sqa.processes;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import com.sqa.pages.LandingPage;

public class Test3Process extends Process{

	private String website = null;
	String loginAssert = null;
	String titleAssert = "Test 1";
	
	/*Constructor*/
	public Test3Process(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public void website (String website){
		this.website = website;
	}
	
	

	@Override
	public void Run() throws Exception{
		LandingPage landing = new LandingPage(driver);
		loginAssert = landing.Test3(website);
		assertEquals(loginAssert,titleAssert);
		
		


		
	}

	
	
	
	

}
