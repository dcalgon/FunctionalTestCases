package com.sqa.testCase;



import org.junit.Test;

import com.sqa.processes.LoginProcess;

public class TestCase1 extends AbstractTestCase {
	
	
	
	
	
	/*Accessing Landing page and logging-in*/

	
	@Test
	public void run () throws Exception{

		/*Proceso de Login*/
		this.createDriver();
		LoginProcess login = new LoginProcess(driver);
		login.website("http://localhost:8080/practica/");
		login.Run();
		
		
		
		
		
		
	}

	
	
	
	
	
}
	
	
	
