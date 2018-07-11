import org.junit.Test;

import com.sqa.testCase.TestCase1;
import com.sqa.testCase.TestCase2;
import com.sqa.testCase.TestCase3;
import com.sqa.testCase.TestCase4;



public class TestRunner {
	

	//@Test
	public void TestRunner(){
		
		try{

		TestCase1 test1 = new TestCase1();
		test1.run();
		test1.tearDown();
		
		TestCase2 test2 = new TestCase2();
		test2.run();
		test2.tearDown();
		
		
		TestCase3 test3 = new TestCase3();
		test3.run();
		test3.tearDown();
		
		
		TestCase4 test4 = new TestCase4();
		test4.run();
		test4.tearDown();
		
		
		}
		
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("Error capturado");
		}
		
	}
	
	

}
