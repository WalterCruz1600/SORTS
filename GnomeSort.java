/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class GnomeSort implements ISort {

	public static int[] gnomeSort(int[] ar) {
		int[] result = ar.clone();
        int i = 1;
        int n = result.length;
        while (i < n) {
            if (i == 0 || result[i - 1] <= result[i]) {
                i++;
            } else {
                int tmp = result[i];
                result[i] = result[i - 1];
                result[--i] = tmp;
            }
        }
        
        return result;
    }

    
	@Override
	public int[] sort(int[] listToOrder) {
		return GnomeSort.gnomeSort(listToOrder);
		
	}
}
	
