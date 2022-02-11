public class BubbleSort implements ISort {

	public static int[] ordenar(int array[]) {
		int[] result = array.clone();
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {

				int x = result[i];
				int y = result[j];

				if (x < y) {
					result[i] = y;
					result[j] = x;
				}

			}

		}

		return result;
	}

	@Override
	public int[] sort(int[] listToOrder) {
		return BubbleSort.ordenar(listToOrder);
	}

}