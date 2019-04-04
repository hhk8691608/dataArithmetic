package ace.algo;

import java.util.Arrays;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: MergeSort.java
 * @Description: 该类的功能描述 归并排序
 * @version: v1.0.0
 * @author: admin
 * @date: 2019年4月2日 下午3:41:40
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019年4月2日
 *        admin v1.0.0 修改原因
 */
public class MergeSort {

	// 我们的算法类不允许产生任何实例
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

	// 将arr[l...mid]和arr[mid+1...r]两部分进行归并
	private static void merge(Comparable[] arr, int l, int mid, int r) {

		Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);
		int i = l, j = mid + 1;
		for (int k = 1; k <= r; k++) {
			if (i > mid) {
				arr[k] = aux[j - 1];
				j++;
			} else if (j > r) {// 如果右半部分元素已经全部处理完毕
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

	// 测试MergeSort
	public static void main(String[] args) {

		System.out.println(2 / 2);

		// Merge Sort是我们学习的第一个O(nlogn)复杂度的算法
		// 可以在1秒之内轻松处理100万数量级的数据
		// 注意：不要轻易尝试使用SelectionSort, InsertionSort或者BubbleSort处理100万级的数据
		// 否则，你就见识了O(n^2)的算法和O(nlogn)算法的本质差异：）
//		int N = 1000000;
//		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//		SortTestHelper.testSort("bobo.algo.MergeSort", arr);

		return;
	}

}
