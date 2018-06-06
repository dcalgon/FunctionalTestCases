package com.sqa.processes;


import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import com.sqa.pages.LandingPage;



public class LoginProcess extends Process{
	
	private String username = null;
	private String password = null;
	private String website = null;
	String loginAssert = null;
	String titleAssert = "My awesome dogs page!";
	
	/*Constructor*/
	public LoginProcess(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public void website (String website){
		this.website = website;
	}
	
	

	@Override
	public void Run() throws Exception{
		LandingPage landing = new LandingPage(driver);
		loginAssert = landing.login(website);
		
		
	
		assertEquals(loginAssert,titleAssert);
		
		


		
	}

	
	
	
	

}
