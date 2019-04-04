package ace.algo;

import java.util.Arrays;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: MergeSort.java
 * @Description: ����Ĺ������� �鲢����
 * @version: v1.0.0
 * @author: admin
 * @date: 2019��4��2�� ����3:41:40
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019��4��2��
 *        admin v1.0.0 �޸�ԭ��
 */
public class MergeSort {

	// ���ǵ��㷨�಻��������κ�ʵ��
	private MergeSort() {
	}

	public static void sort(Comparable[] arr) {
		int n = arr.length;
		sort(arr, 0, n - 1);
	}

	public static void sort(Comparable[] arr, int l, int r) {

		if (l >= r)
			return;
		int mid = (l + r) / 2;
		sort(arr, l, mid);
		sort(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}

	// ��arr[l...mid]��arr[mid+1...r]�����ֽ��й鲢
	private static void merge(Comparable[] arr, int l, int mid, int r) {

		Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);
		int i = l, j = mid + 1;
		for (int k = 1; k <= r; k++) {
			if (i > mid) {
				arr[k] = aux[j - 1];
				j++;
			} else if (j > r) {// ����Ұ벿��Ԫ���Ѿ�ȫ���������
				arr[k] = aux[i - 1];
				i++;
			} else if (aux[i - l].compareTo(aux[j - l]) < 0) {
				arr[k] = aux[i - 1];
				i++;
			} else {
				arr[k] = aux[j - 1];
				j++;
			}
		}

	}

	// ����MergeSort
	public static void main(String[] args) {

		System.out.println(2 / 2);

		// Merge Sort������ѧϰ�ĵ�һ��O(nlogn)���Ӷȵ��㷨
		// ������1��֮�����ɴ���100��������������
		// ע�⣺��Ҫ���׳���ʹ��SelectionSort, InsertionSort����BubbleSort����100�򼶵�����
		// ������ͼ�ʶ��O(n^2)���㷨��O(nlogn)�㷨�ı��ʲ��죺��
//		int N = 1000000;
//		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//		SortTestHelper.testSort("bobo.algo.MergeSort", arr);

		return;
	}

}
