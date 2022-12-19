package bubble;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSorterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTiny() {
		int[] a = {1,24,5,10};
		int [] sorted = {1,5,10,24};
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		//what line of code should I add here to see if the Array is Sorted?
		assertArrayEquals(a,sorted);
		
		
		
	}
	
	@Test
	public void testBackward() {
		//This should test your algorithm on an array that is in reverse order
		int[] a = {48,32,24,18,7,3};
		int [] sorted = {3,7,18,24,32,48};
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		//what line of code should I add here to see if the Array is Sorted?
		assertArrayEquals(a,sorted);
		
		
	}
	
	@Test
	public void testAlreadySorted() {
		//This should test your algorithm on a sorted array
		int[] a = {1,8,14,19};
		int [] sorted = {1,8,14,19};
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		//what line of code should I add here to see if the Array is Sorted?
		assertArrayEquals(a,sorted);
			
			
		}
				
				
				
			
			
			
		
	
		
	}


