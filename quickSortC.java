
import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class quickSortC <E> implements ISort<E> {
	
	// method to find the partition position
	  static int partition(int array[], int bajo, int alto) {
	    
	    // choose the rightmost element as pivot
	    int pivot = array[alto];
	    
	    // pointer for greater element
	    int i = (bajo - 1);

	    // traverse through all elements
	    // compare each element with pivot
	    for (int j = bajo; j < alto; j++) {
	      if (array[j] <= pivot) {

	        // if element smaller than pivot is found
	        // swap it with the greatr element pointed by i
	        i++;

	        // swapping element at i with element at j
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }

	    }

	    // swapt the pivot element with the greater element specified by i
	    int temp = array[i + 1];
	    array[i + 1] = array[alto];
	    array[alto] = temp;

	    // return the position from where partition is done
	    return (i + 1);
	  }

	  static void quickSortArray(int array[], int low, int high) {
	    if (low < high) {

	      // find pivot element such that
	      // elements smaller than pivot are on the left
	      // elements greater than pivot are on the right
	      int pi = partition(array, low, high);
	      
	      // recursive call on the left of pivot
	      quickSortArray(array, low, pi - 1);

	      // recursive call on the right of pivot
	      quickSortArray(array, pi + 1, high);
	    }
	  }

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E gets(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void orden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E sort(E listToOrder) {
		// TODO Auto-generated method stub
		return null;
	}
	}

	// Main class
	class mainQuickSort {
	  public static void mainQuickSort(String args[]) {

	    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
	    System.out.println("Array no soportado");
	    System.out.println(Arrays.toString(data));

	    int size = data.length;

	    // call quicksort() on array data
	    quickSortC.quickSortArray(data, 0, size - 1);

	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }
	}
