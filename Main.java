import java.util.Arrays;
import java.util.Random;

public class Main {

	public static int[] generateRandomNumbers(int length) {
		Random rd = new Random(); // creating Random object
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs( rd.nextInt(2001) -1000); // storing random integers in an array
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println("");
		int largo = 10;
		int[] lista10Elementos = Main.generateRandomNumbers(largo);

		System.out.println("Lista desordenada");
		System.out.println(Arrays.toString(lista10Elementos));

		BubbleSort bubble = new BubbleSort();
		RadixSort radix = new RadixSort();
		GnomeSort gnome = new GnomeSort();
		QuickSort quick = new QuickSort();
		MergeSort merge = new MergeSort();

		int[] arrBubble = bubble.sort(lista10Elementos);
		int[] arrRadix = radix.sort(lista10Elementos);
		int[] arrGnome = gnome.sort(lista10Elementos);
		int[] arrQuick = quick.sort(lista10Elementos);
		int[] arrMerge = merge.sort(lista10Elementos);

		System.out.println("La lista ordenada es: ");

		System.out.println(Arrays.toString(arrBubble));
		System.out.println(Arrays.toString(arrRadix));
		System.out.println(Arrays.toString(arrGnome));
		System.out.println(Arrays.toString(arrQuick));
		System.out.println(Arrays.toString(arrMerge));

	}

}