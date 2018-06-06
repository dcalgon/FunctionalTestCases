import org.junit.Test;

import com.sqa.testCase.TestCase1;



public class TestRunner {
	

	//@Test
	public void TestRunner(){
		
		try{

		TestCase1 test1 = new TestCase1();
		test1.run();
		test1.tearDown();
		
		
		}
		
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("Error capturado");
		}
		
	}
	
	

}
