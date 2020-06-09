package hwpresentation4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("@BeforeClass setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@@Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@AfterClass");

	}

	//@Test
	public void testAdd() {
		System.out.println("@testAdd");
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDiv() {
		System.out.println("@testDiv");
		double  i = 10;
		if (i == 0 ) {
			throw new RuntimeException ("RunntimeExeption");
		}
		i=10/i;
		System.out.println(i);

		double expected = 1.01;
		double actual = i ;
	Assert.assertEquals("My error", expected, actual, 0.001 );
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAdd1() {
		System.out.println("@testAdd");
		Calc calc = new Calc();
		double expected = 4;
		double actual ;
		
		actual = calc.add(2,2);
		
	Assert.assertEquals("My error", expected, actual, 0.001 );
		//fail("Not yet implemented");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
