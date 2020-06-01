package com.softserve.edu5;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	// @BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass setUpBeforeClass()");
	}

	// @AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass tearDownAfterClass()");
	}

	// @Before
	public void setUp() throws Exception {
		System.out.println("\t@Before setUp()");
	}

	// @After
	public void tearDown() throws Exception {
		System.out.println("\t@After tearDown()");
	}

	// @Test
	public void testAdd() {
		System.out.println("\t\t@Test testAdd()");
		// int i = 0;
		double i = 10;
		if (i == 0) {
			throw new RuntimeException("ha-ha-ha");
		}
		i = 10 / i;
		System.out.println("\t\t\ti = " + i);
		double expected = 1.001;
		double actual = i;
		Assert.assertEquals("My Error", expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testAdd1() {
		System.out.println("\t\t@Test testAdd1()");
		Calc calc = new Calc();
		double expected = 4;
		double actual;
		//
		actual = calc.add(2, 2);
		Assert.assertEquals("My Error add1", expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testAdd2() {
		System.out.println("\t\t@Test testAdd1()");
		Calc calc = new Calc();
		double expected = 4;
		double actual;
		//
		actual = calc.add(1, 3);
		Assert.assertEquals("My Error add2", expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testDiv1() {
		System.out.println("\t\t@Test testDiv1()");
		System.out.println("\t\t@Test testAdd1()");
		Calc calc = new Calc();
		double expected = 4;
		double actual;
		//
		actual = calc.div(20, 5);
		Assert.assertEquals("My Error div1", expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testDiv2() {
		System.out.println("\t\t@Test testDiv1()");
		System.out.println("\t\t@Test testAdd1()");
		Calc calc = new Calc();
		double expected = 2.5;
		double actual;
		//
		actual = calc.div(20, 8);
		Assert.assertEquals("My Error div1", expected, actual, 0.001);
		// fail("Not yet implemented");
	}
}
