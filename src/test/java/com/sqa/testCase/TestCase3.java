package com.sqa.testCase;



import org.junit.Test;

import com.sqa.processes.Test3Process;

public class TestCase3 extends AbstractTestCase{


/*Accessing Landing page and logging-in*/

	
	@Test
	public void run () throws Exception{

		/*Proceso de Login*/
		this.createDriver();
		Test3Process Test3 = new Test3Process(driver);
		Test3.website("http://localhost:8080/practica/");
		Test3.Run();
		
		
		

	}

}
	
