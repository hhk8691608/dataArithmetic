package ace.algo;

import java.util.Arrays;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: MergeSort.java
 * @Description: 该类的功能描述 归并排序 置低往上归并
 * @version: v1.0.0
 * @author: admin
 * @date: 2019年4月2日 下午3:41:40
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019年4月2日
 *        admin v1.0.0 修改原因
 */
public class MergeSortBU {

	public static void sort(Comparable[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i += 16) {
			InsertionSort.sort(arr, i, Math.min(i + 15, n - 1));
		}

		for (int sz = 16; sz < n; sz += sz) {
			for (int i = 0; i < n - sz; i += sz + sz) {
				if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0) {
					merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1));
				}
			}
		}

	}

	// 将arr[l...mid]和arr[mid+1...r]两部分进行归并
	private static void merge(Comparable[] arr, int l, int mid, int r) {

		Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);
		int i = l, j = mid + 1;
		for (int k = l; k <= r; k++) {
			if (i > mid) { // 如果左半部分元素已经全部处理完毕
				arr[k] = aux[j - l];
				j++;
			} else if (j > r) { // 如果右半部分元素已经全部处理完毕
				arr[k] = aux[i - l];
				i++;
			} else if (aux[i - l].compareTo(aux[j - l]) < 0) { // 左半部分所指元素 < 右半部分所指元素
				arr[k] = aux[i - l];
				i++;
			} else { // 左半部分所指元素 >= 右半部分所指元素
				arr[k] = aux[j - l];
				j++;
			}
		}

	}

}
