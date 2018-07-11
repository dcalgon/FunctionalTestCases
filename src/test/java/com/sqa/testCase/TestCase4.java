package com.sqa.testCase;



import org.junit.Test;

import com.sqa.processes.Test3Process;
import com.sqa.processes.Test4Process;

public class TestCase4 extends AbstractTestCase{


/*Accessing Landing page and logging-in*/

	
	@Test
	public void run () throws Exception{

		/*Proceso de Login*/
		this.createDriver();
		Test4Process Test4 = new Test4Process(driver);
		Test4.website("http://localhost:8080/practica/");
		Test4.Run();
		
		
		

	}

}
	
