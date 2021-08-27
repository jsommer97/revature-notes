package com.revature.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Course;

//This is a test suite. a grouping of unit tests for one specific class.
public class CourseTests {

	// create some dummy objects (stubs)
	static Course c1;
	static Course c2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("Running before all tests within test suite");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		System.out.println("Running after all tests within test suite");
	}

	
	//something to execute before each test
	@Before
	public void setUp() {
		
		System.out.println("Setting up...");
		
		c1 = new Course("English 101"); 
		c2 = new Course("Astrophysics 101");	
			
	}
		
	@After
	public void tearDown () {
		
		System.out.println("Tearing down...");
		
		c1 = null;
		c2 = null;
		
	}
	
	//demo test
	@Test
	public void test() {
		System.out.println("I'm a test");
	}
		
	//test getName()
	@Test
	public void testGetName() {
		
		String expectedName = "English 101";
		
		String actualName = c1.getName();
		
		assertEquals(expectedName, actualName);
	}
	
	//test setName();
	@Test
	public void testSetName() {
		
		String nameToSet = "French 200";
		
		c1.setName(nameToSet);
		
		assertTrue(c1.getName().equals(nameToSet));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
