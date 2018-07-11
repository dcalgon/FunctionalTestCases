package com.sqa.testCase;




import org.junit.Test;


import com.sqa.processes.Test2Process;


public class TestCase2 extends AbstractTestCase {
	

	/*Accessing Landing page and logging-in*/

	
	@Test
	public void run () throws Exception{

		/*Proceso de Login*/
		this.createDriver();
		Test2Process Test2 = new Test2Process(driver);
		Test2.website("http://localhost:8080/practica/");
		Test2.Run();
		
		
		

	}

}
	
