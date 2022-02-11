import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author PollitoKun
 *
 */
public class RadixSortTest {

	/**
	 * Test method for {@link RadixSort#sort(int[])}.
	 */
	@Test
	public final void testSortRandom() {
		int[] arr = {5,1,2,4};
		int[] result = {1,2,4,5};
		
		RadixSort radix = new RadixSort();
		assertEquals(radix.sort(arr), result);
		
	}
	
	
	@Test
	public final void testSortAsc() {
		int[] arr = {1,2,4,5};
		int[] result = {1,2,4,5};
		
		RadixSort radix = new RadixSort();
		assertEquals(radix.sort(arr), result);
		
	}
	
	@Test
	public final void testSortDesc() {
		int[] arr = {5,4,2, 1};
		int[] result = {1,2,4,5};
		
		RadixSort radix = new RadixSort();
		assertEquals(radix.sort(arr), result);
		
	}

}
