import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class MergeSortTest {
	@Test
	public final void testSortRandom() {
		int[] arr = {5,1,2,4};
		int[] result = {1,2,4,5};
		
		MergeSort merge = new MergeSort();
		assertEquals(merge.sort(arr), result);
		
	}
	
	
	@Test
	public final void testSortAsc() {
		int[] arr = {1,2,4,5};
		int[] result = {1,2,4,5};
		
		MergeSort merge = new MergeSort();
		assertEquals(merge.sort(arr), result);
		
	}
	
	@Test
	public final void testSortDesc() {
		int[] arr = {5,4,2, 1};
		int[] result = {1,2,4,5};
		
		MergeSort merge = new MergeSort();
		assertEquals(merge.sort(arr), result);
		
	}


}
