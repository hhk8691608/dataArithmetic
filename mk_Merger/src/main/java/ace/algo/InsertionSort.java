package ace.algo;

public class InsertionSort {

	// ���ǵ��㷨�಻��������κ�ʵ��
	private InsertionSort() {
	}

	// ������arr����ʹ��InsertionSort����
	public static void sort(Comparable[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			Comparable e = arr[i];
			int j = i;
			for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--)
				arr[j] = arr[j - 1];
			arr[j] = e;
		}
	}

	// ��arr[l...r]������ʹ��InsertionSort����
	public static void sort(Comparable[] arr, int l, int r) {

		for (int i = l + 1; i <= r; i++) {
			Comparable e = arr[i];
			int j = i;
			for (; j > l && arr[j - 1].compareTo(e) > 0; j--)
				arr[j] = arr[j - 1];
			arr[j] = e;
		}
	}

	private static void swap(Object[] arr, int i, int j) {
		Object t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	// ����InsertionSort
	public static void main(String[] args) {

		int N = 10000;
//		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//		SortTestHelper.testSort("bobo.algo.InsertionSort", arr);

		return;
	}

}
