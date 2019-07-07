package com.JUnitSample;
import org.junit.*;

public class CalculatorTest {
	
	 @BeforeClass
	    public static void setUpClass() {
	        // code executed before all test methods
/*		 prepares test environment here, e.g. initializing resources such as opening a database connection. The method marked with this annotation must be static.
	   */
		 
	 }
	     
	    @Before
	    public void setUp() {
	        // code executed before each test method, repeated code 
	    }
	     
	    @Test
	    public void testAdd() {
	        // test method
	    }
	     
	    @Test
	    public void testSubtract() {
	        // test method
	    }
	     
	    @After
	    public void tearDown() {
	        // code executed after each test method
	    }
	     
	    @AfterClass
	    public static void tearDownClass() {
	        // code executed after all test methods
	    }

}
