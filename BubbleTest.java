import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class BubbleTest {

	
	
	/**
	 * Test method for {@link Bubble#add(java.lang.Object)}.
	 */
	@Test
	public final void testAdd() {
		Vector vector= new Vector<>();
		Bubble test = new Bubble();
		int output = test.add(vector);
		
		assertEquals(5, output); // TODO
	}

	/**
	 * Test method for {@link Bubble#empty()}.
	 */
	@Test
	public final void testEmpty() {
		Bubble test = new Bubble();
		boolean output= test.empty();
		assertEquals(false, output); 
	}

	/**
	 * Test method for {@link Bubble#size()}.
	 */
	@Test
	public final void testSize() {
		Bubble test = new Bubble();
		int output = test.size();
		assertEquals(0, output); // TODO
	}

	/**
	 * Test method for {@link Bubble#ordenar()}.
	 */
	@Test
	public final void testOrdenar() {
		Bubble test = new Bubble();
		void output = test.ordenar();
		assertEquals(5,output); // TODO
	}

}
