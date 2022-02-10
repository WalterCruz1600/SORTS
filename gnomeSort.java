/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class gnomeSort implements ISort {

	private static void gnomeSort(int[] ar) {
        int i = 1;
        int n = ar.length;
        while (i < n) {
            if (i == 0 || ar[i - 1] <= ar[i]) {
                i++;
            } else {
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[--i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] ar= {5, 3, 2, 4};
        gnomeSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
	
