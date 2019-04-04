package ace.algo;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: QuickSort.java
 * @Description: 该类的功能描述 快速排序
 * @version: v1.0.0
 * @author: admin
 * @date: 2019年4月2日 下午8:09:46
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019年4月2日
 *        admin v1.0.0 修改原因
 */
public class QuickSort {

	private QuickSort() {
	}

	public static void sort(Comparable[] arr) {

		int n = arr.length;
		sort(arr, 0, n - 1);
	}

	// 递归使用快速排序,对arr[l...r]的范围进行排序
	private static void sort(Comparable[] arr, int l, int r) {

		if (l >= r)
			return;

		int p = partition(arr, l, r);
		sort(arr, l, p - 1);
		sort(arr, p + 1, r);
	}

	// 对arr[l...r]部分进行partition操作
	// 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
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

	// 测试 QuickSort
	public static void main(String[] args) {

		// Quick Sort也是一个O(nlogn)复杂度的算法
		// 可以在1秒之内轻松处理100万数量级的数据
		int N = 1000000;
//		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//		SortTestHelper.testSort("bobo.algo.QuickSort", arr);

		return;
	}

}
