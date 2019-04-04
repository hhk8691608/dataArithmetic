package ace.algo;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: QuickSort.java
 * @Description: ����Ĺ������� ��������
 * @version: v1.0.0
 * @author: admin
 * @date: 2019��4��2�� ����8:09:46
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019��4��2��
 *        admin v1.0.0 �޸�ԭ��
 */
public class QuickSort {

	private QuickSort() {
	}

	public static void sort(Comparable[] arr) {

		int n = arr.length;
		sort(arr, 0, n - 1);
	}

	// �ݹ�ʹ�ÿ�������,��arr[l...r]�ķ�Χ��������
	private static void sort(Comparable[] arr, int l, int r) {

		if (l >= r)
			return;

		int p = partition(arr, l, r);
		sort(arr, l, p - 1);
		sort(arr, p + 1, r);
	}

	// ��arr[l...r]���ֽ���partition����
	// ����p, ʹ��arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
	private static int partition(Comparable[] arr, int l, int r) {

		Comparable v = arr[l];

		int j = l; // arr[l+1...j] < v ; arr[j+1...i) > v
		for (int i = l + 1; i <= r; i++)
			if (arr[i].compareTo(v) < 0) {
				j++;
				swap(arr, j, i);
			}

		swap(arr, l, j);

		return j;
	}

	private static void swap(Object[] arr, int i, int j) {
		Object t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	// ���� QuickSort
	public static void main(String[] args) {

		// Quick SortҲ��һ��O(nlogn)���Ӷȵ��㷨
		// ������1��֮�����ɴ���100��������������
		int N = 1000000;
//		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//		SortTestHelper.testSort("bobo.algo.QuickSort", arr);

		return;
	}

}
