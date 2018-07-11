package com.sqa.processes;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import com.sqa.pages.LandingPage;


public class Test2Process extends Process{
	
		private String website = null;
		String loginAssert = null;
		String titleAssert = "Test 2";
		
		/*Constructor*/
		public Test2Process(WebDriver driver) {
			super(driver);
			
		}
		
		
		
		public void website (String website){
			this.website = website;
		}
		
		

		@Override
		public void Run() throws Exception{
			LandingPage landing = new LandingPage(driver);
			loginAssert = landing.Test2(website);
			assertEquals(loginAssert,titleAssert);
			
			


			
		}

		
		
		
		

	}

	
	
